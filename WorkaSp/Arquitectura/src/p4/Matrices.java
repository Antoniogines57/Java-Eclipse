package p4;

import java.text.DecimalFormat;

public class Matrices {

	/**
	 * Comprueba si un array de dos dimensiones es matriz.
	 * m != null && m[i] != null para i= 0..m.length-1 && m[i].length = m.length, i = 0..length-1
	 * @param m array bidimensional a comprobar
	 * @return true si m es matriz, false si no lo es.
	 */
	public static boolean esMatriz(double [][] m){
		if (m == null){
			return false;
		}
		if (m.length == 0){
			return true;
		}
		for (int i = 0; i < m.length; i++){
			if (m[i] == null){
				return false;
			}
			if (m[i].length != m[0].length){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Comprueba si un array de dos dimensiones es matriz cuadrada.
	 * m es matriz && m.length == m[0].length
	 * @param m array bidimensional a comprobar
	 * @return true si m es matriz cuadrada, false si no lo es.
	 */
	public static boolean esMatrizCuadrada(double [][] m){
		if (!esMatriz(m)){
			return false;
		}
		if (m.length == 0){
			return true;
		}
		if (m.length == m[0].length){
			return true;
		}
		return false;
	}
	
	/**
	 * Devuelve la traspuesta de una matriz dada
	 * @param m matriz
	 * @return traspuesta de m
	 * 		   null si m no es matriz.
	 */
	public static double [][] traspuesta(double [][] m){
		if (!esMatriz(m)){
			System.out.println("traspuesta: no es matriz: retorna null");
			return null;
		}
		double [][] tr = new double[m[0].length][m.length];
		for (int i = 0; i < tr.length; i++){
			for (int j = 0; j < tr[i].length; j++){
				tr[i][j] = m[j][i];
			}
		}
		return tr;
	}

	/**
	 * 
	 * Para depuración.
	 * 
	 * Imprime en consola la matriz representada por m.
	 * @param p polinomio.
	 */
	public static void printMatriz(double [][] m){
		if (!esMatriz(m)){
			System.out.println("no es matriz");
			return;
		}
		
		// Representación de los números con dos decimales.
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(2);
		
		String [][] ms = new String[m.length][m[0].length];
		
		// Por cada columna apuntamos el elemento que más ocupa para
		// ajustar la anchura de la columna en todas las filas.
		int [] anchoCol = new int[m[0].length];
		for (int i = 0; i < anchoCol.length; i++){
			anchoCol[i] = 0;
		}
		
		// Obtenemos las representaciones de los números con dos decimales
		// y apuntamos los anchos de columna.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				ms[i][j] = form.format(m[i][j]);
				if (anchoCol[j] < ms[i][j].length()){
					anchoCol[j] = ms[i][j].length();
				}
			}
		}
		
		// Reconstruimos los elementos de ms ajustando las columnas y añadiendo
		// blancos de separación entre columnas.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				// Ajustar
				while (ms[i][j].length() < anchoCol[j]){
					ms[i][j] = " " + ms[i][j];
				}
				// Añadir separación.
				ms[i][j] = ms[i][j] + "  ";
			}
		}
		
		// Imprimimos
		for (int i = 0; i < ms.length; i++){
			for (int j = 0; j < ms[i].length; j++){
				System.out.print(ms[i][j]);	
			}
			System.out.println();
		}
	}

	/**
	 * Compara dos arrays de double
	 * @param m1 array 1
	 * @param m2 array 2
	 * @return true si son iguales elemento a elemento o si ambas referencias son null
	 *         false en caso contrario.
	 */
	public static boolean compararMatrices(double [][] m1, double [][] m2){
		
		if (m1 == null && m2 == null){
			return true;
		}
		
        if (!esMatriz(m1) || !esMatriz(m2) ){
        	return false;
        }

		if (m1 == m2){
			return true;
		}
		
		if (m1.length != m2.length){
			return false;
		}
		
		if (m1[0].length != m2[0].length){
			return false;
		}

		for (int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				if (m1[i][j] != m2[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * Para depuración.
	 * 
	 * Imprime en consola los elementos de un array de doubles.
	 * @param a array.
	 */
	public static void printArray(double [] a){
		if (a == null){
			System.out.print("null");
			return;
		}
		System.out.print("{");
		if (a.length == 0){
			System.out.print("}");
			return;
		}
		
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(3);
		
		for (int i = 0; i < a.length-1; i++){
			System.out.print(form.format(a[i]) + ", ");
		}
		System.out.print(form.format(a[a.length-1]) + "}");
	}

	/**
	 * 
	 * Para depuración.
	 * 
	 * Coloca en un array de Strings las filas de m.
	 * @param m matriz.
	 * @return array de Strings las filas de m.
	 *         null si m no representa a una matriz.
	 */
	public static String [] matrizToStringArray(double [][] m){
		
		if (!Matrices.esMatriz(m)){
			return null;
		}
		
		String [] filas = new String[m.length];

		// Representación de los números con dos decimales.
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(3);
		
		String [][] ms = new String[m.length][m[0].length];
		
		// Por cada columna apuntamos el elemento que más ocupa para
		// ajustar la anchura de la columna en todas las filas.
		int [] anchoCol = new int[m[0].length];
		for (int i = 0; i < anchoCol.length; i++){
			anchoCol[i] = 0;
		}
		
		// Obtenemos las representaciones de los números con dos decimales
		// y apuntamos los anchos de columna.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				ms[i][j] = form.format(m[i][j]);
				if (anchoCol[j] < ms[i][j].length()){
					anchoCol[j] = ms[i][j].length();
				}
			}
		}
		
		// Reconstruimos los elementos de ms ajustando las columnas y añadiendo
		// blancos de separación entre columnas.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				// Ajustar
				while (ms[i][j].length() < anchoCol[j]){
					ms[i][j] = " " + ms[i][j];
				}
				// Añadir separación.
				ms[i][j] = ms[i][j] + "  ";
			}
		}
		
		// Copiamos;
		for (int i = 0; i < ms.length; i++){
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < ms[i].length; j++){
				sb.append(ms[i][j]);	
			}
			filas[i] = sb.toString();
		}
		return filas;
	}
	
	public static void printTabla(String [][] ms){	
		
		// Por cada columna apuntamos el elemento que más ocupa para
		// ajustar la anchura de la columna en todas las filas.
		int [] anchoCol = new int[ms[0].length];
		for (int i = 0; i < anchoCol.length; i++){
			anchoCol[i] = 0;
		}
		
		// Obtenemos las representaciones de los números con dos decimales
		// y apuntamos los anchos de columna.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				if (ms[i][j] == null){
					ms[i][j] = "null";
				}
				if (anchoCol[j] < ms[i][j].length()){
					anchoCol[j] = ms[i][j].length();
				}
			}
		}
		
		// Reconstruimos los elementos de ms ajustando las columnas y añadiendo
		// blancos de separación entre columnas.
		for (int i = 0; i < ms.length; i++){
			for(int j = 0; j < ms[i].length; j++){
				// Ajustar
				while (ms[i][j].length() < anchoCol[j]){
					ms[i][j] = ms[i][j] + " ";
				}
				// Añadir separación.
				ms[i][j] = ms[i][j] + "   ";
			}
		}
		
		// Imprimimos
		for (int i = 0; i < ms.length; i++){
			for (int j = 0; j < ms[i].length; j++){
				System.out.print(ms[i][j]);	
			}
			System.out.println();
		}
	}

}
