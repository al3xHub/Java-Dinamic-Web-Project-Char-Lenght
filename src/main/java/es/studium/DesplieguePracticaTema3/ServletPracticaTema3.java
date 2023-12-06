package es.studium.DesplieguePracticaTema3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPracticaTema3
 */
@WebServlet("/ServletPracticaTema3")
public class ServletPracticaTema3 extends HttpServlet {
	Modelo modelo = new Modelo();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPracticaTema3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtenemos el valor del parámetro "palabras"
			String palabras = request.getParameter("palabras");
				
		// Los separamos y metemos en un ArrayList
		ArrayList<String> original = new ArrayList<String>();
		String[] tablaPalabras = palabras.split(",");
		
		for (String palabra : tablaPalabras) {
			original.add(palabra);
		}
		
		// Obtenemos un nuevo ArrayList
		ArrayList<Integer> resultado = modelo.calcular(original);
		// Mostrar los resultados
		response.getWriter().append("Longuitud de carácteres por palabra: "+resultado + "");
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<br><a href=index.html>Volver</a>\n"+ "");	
	}

}
