package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.core.JsonParseException;

import common.Ticket;


public class FindAllTicketsServlet extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		//read query
		// write output in response
		res.getWriter().write(
				new ObjectMapper.writeValueAsString(
						new Ticket()));
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		//read query
		// write output in response
	}
}
