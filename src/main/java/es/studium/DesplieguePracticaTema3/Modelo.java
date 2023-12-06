package es.studium.DesplieguePracticaTema3;

import java.util.ArrayList;

public class Modelo {
	//Método calcular
		ArrayList<Integer> calcular(ArrayList<String> palabras){
			
			ArrayList<Integer> resultado = new ArrayList<Integer>();
			
				for(String palabra: palabras){
					int longuitud=palabra.length();
					resultado.add(longuitud);
				}
			
			return resultado;
		}

}
