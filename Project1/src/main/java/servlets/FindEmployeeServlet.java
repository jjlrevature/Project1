package servlets;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.*;

import common.DBUtil;
import common.Employee;
import common.Ticket;
import dao.EmployeeDAO;

@WebServlet("/user")
public class FindEmployeeServlet extends HttpServlet implements EmployeeDAO, Serializable {
	
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		System.out.println("/user POST pinged");
		Employee queriedEmployee = new Employee(null, null);	
		Employee returnedEmployee = null;
		
		try {
			queriedEmployee = om.readValue(getJSONData(req), Employee.class);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			returnedEmployee = login(queriedEmployee);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		

		returnedEmployee.getEmpTickets();
//		SimpleModule module = new SimpleModule();
//		module.addSerializer(Employee.class, new EmployeeSerializer());
//		om.registerModule(module);
//		
		resp.setContentType("application/json");
		String jsonEmp = om.writeValueAsString(returnedEmployee);
		resp.getWriter().print(jsonEmp);
		System.out.println(jsonEmp);
	}

	
	
	@Override
	public Employee login(Employee employee) throws SQLException {
			Employee e = null;
			ObjectMapper om = new ObjectMapper();
			Session session = DBUtil.getInstance().getSession();
			Employee emp = session.find(Employee.class, 1);
			// employee.getEmployeeID()
			//System.out.println(emp.getEmpTickets());
//			logger.info("user returned from getUser");
			System.out.println(emp.getEmpTickets());			
			e = emp;
			return e;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submitTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Ticket> getTickets(Employee emp) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public static String getJSONData(HttpServletRequest req) throws Exception {
		StringBuffer jsonStrBuffer = new StringBuffer();
		String line = null;

		BufferedReader reader = req.getReader();
		while ((line = reader.readLine()) != null)
			jsonStrBuffer.append(line);

		return jsonStrBuffer.toString();
	}
	
}
