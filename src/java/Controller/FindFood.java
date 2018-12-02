/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.Hotel;
import Modal.HotelDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ankit
 */
public class FindFood extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        String state = request.getParameter("state");
        
       System.out.println(state);
        
        HotelDAO hd = new HotelDAO();
        
        ArrayList<Hotel> l = new ArrayList<>();
        
        l = hd.searchHotels(state);
        
        HttpSession session = request.getSession();
        
        session.setAttribute("hotellist",l);
        
        response.sendRedirect("foodresult.jsp");
        
    }



}
