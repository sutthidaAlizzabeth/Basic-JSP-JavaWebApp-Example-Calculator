/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Model.Calculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alizzabeth
 */
public class Calculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String x = request.getParameter("x");
        String y = request.getParameter("y");
        String operation = request.getParameter("z");
        double num1 = 0;
        double num2 = 0;
        //"message" is the error message
        String message = null;
        //check number and operation
        if(x == null || x.length() == 0 || y == null || y.length() == 0 || operation == null || operation.length() == 0){
            message = "Please enter number and operation";
        }
        else if(!(operation.equalsIgnoreCase("*") || operation.equalsIgnoreCase("/") || operation.equalsIgnoreCase("+") || operation.equalsIgnoreCase("-")) ){
            message = "Please enter operation only \"*\" \"/\" \"+\" or \"-\"";
        }
        else{
            try{
                num1 = Double.parseDouble(x);
                num2 = Double.parseDouble(y);
            }
            catch(Exception ex){
                message = "Please enter only number";
            }
        }
        //Calculate
        double result = Calculator.calculate(num1, num2, operation);
        
        //input variable into Request
        request.setAttribute("message", message);
        request.setAttribute("result", result);
       
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
