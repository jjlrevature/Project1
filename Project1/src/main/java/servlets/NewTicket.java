package servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.Ticket;


@WebServlet("/newticket")
public class NewTicket extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		int empID = Integer.parseInt(req.getParameter("empID"));
		double amount = Double.parseDouble(req.getParameter("amount"));
		String dateOftrans = req.getParameter("date");
		String[] desc;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String dateOfSubmission = req.getParameter("dos");
		java.util.Date dSub = new java.util.Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    Instant dateOfSub;
		Instant dateOfT;
		try {
			java.util.Date dot = sdf.parse(dateOftrans);
			
			dateOfSub = dSub.toInstant();
			dateOfT = dot.toInstant();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// write output in response
//		try {
//			res.getWriter().write(
//					 new ObjectMapper().writeValueAsString(
//							 new Ticket(username, empID, amount, dSub, desc))
//					);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
}
