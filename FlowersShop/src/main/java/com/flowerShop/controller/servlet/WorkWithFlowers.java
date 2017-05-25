package com.flowerShop.controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flowerShop.model.dao.BunchOfFlowersDao;
import com.flowerShop.model.dao.implementation.BunchOfFlowersDaoImpl;
import com.flowerShop.model.flowers.BunchOfFlowers;

@WebServlet("/WorkWithFlowers")
public class WorkWithFlowers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id = (int)Integer.parseInt(request.getParameter("id"));
		BunchOfFlowersDao dao = new BunchOfFlowersDaoImpl();
    	BunchOfFlowers bunch = null;
		try{
			bunch = dao.getBunchOfFlowersById(id);
			if(bunch.getName() == null){
				out.println("Row with current ID is empty");
				return;
			}
			out.println("<p>"+bunch+"</p>");
		}catch(Exception e){
			e.printStackTrace();
			out.println("Can't find current ID in DB");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String freshness = request.getParameter("freshness");
		String price = request.getParameter("price");
		String lengthOfStalk = request.getParameter("lengthOfStalk");
		String numOfFlowersInBunch = request.getParameter("numOfFlowersInBunch");
		
		BunchOfFlowersDao dao = new BunchOfFlowersDaoImpl();
		try{
			dao.createBunchOfFlowers(id, name, freshness, price, lengthOfStalk, numOfFlowersInBunch);
			out.println("Created successfully");
		}catch(SQLException e){
			e.printStackTrace();
			out.println("Not Created. Wrong ID");
		}
	}

}
