/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServletFigura;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Circulo;
import logica.Cuadrado;
import logica.Figura;
import logica.Rectangulo;

/**
 *
 * @author asrre
 */
@WebServlet(name = "ServletFigura", urlPatterns = {"/ServletFigura"})
public class ServletFigura extends HttpServlet {
        public static Figura ani;
                public static void liskov(Figura a){
                         a.cArea();
                         a.cPerimetro();
                         ani=a;
    }
                
                
                
                
                
        /**
         * Processes requests for both HTTP <code>GET</code> and
         * <code>POST</code> methods.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                if("r".equals(request.getParameter("tipo"))) {
            /*Cuadrado cuadrado = new Cuadrado();
            cuadrado.setLado(Integer.parseInt(request.getParameter("lado")) );
            liskov(cuadrado);*/
            
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.setLado1(Integer.parseInt(request.getParameter("lado1")) );
                rectangulo.setLado2(Integer.parseInt(request.getParameter("lado2")) );
                liskov(rectangulo);
        }
                
                else if ("c".equals(request.getParameter("tipo"))){
                        Cuadrado cuadrado = new Cuadrado();
                        cuadrado.setLado(Integer.parseInt(request.getParameter("lado1")) );
                        liskov(cuadrado);
                
                }
                
                
                else if ("b".equals(request.getParameter("tipo"))){
                        Circulo circulo = new Circulo();
                        circulo.setLado(Integer.parseInt(request.getParameter("lado1")) );
                        liskov(circulo);
                
                }
                try (PrintWriter out = response.getWriter()) {
                        /* TODO output your page here. You may use following sample code. */
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Servlet ServletFigura</title>");                        
                        out.println("</head>");
                        out.println("<body>");
                        /*out.println("<h1>Servlet ServletFigura at " + request.getContextPath() + "</h1>");*/
                        out.println("<h1>Area "+ani.getArea()+"</h1>");
                        out.println("<h1>Perimetro "+ani.getPerimetro()+"</h1>");
                        out.println("</body>");
                        out.println("</html>");
                }
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
