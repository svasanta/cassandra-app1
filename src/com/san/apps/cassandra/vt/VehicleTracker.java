package com.san.apps.cassandra.vt;

import java.io.IOException;
import com.datastax.driver.core.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleTracker
 */
@WebServlet(
		urlPatterns = { "/tracker" }, 
		initParams = { 
				@WebInitParam(name = "CASSANDRA_HOST", value = "127.0.0.1")
		})
public class VehicleTracker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleTracker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("<h1>").append("Vehicle Tracker").append("<h1>");
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		
		Session session = cluster.connect();

	}

}
