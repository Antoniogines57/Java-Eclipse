package p4;
import p4.ProcesarArrays;
import p4.Matrices;

public class Test4 {

/**
 * @return
 */
public static int test_quitarFila(){
		
		System.out.println("***************************************************");
		System.out.println("test_quitarFila ");
		System.out.println();
		
		int calificacion = 10;
		
		double [][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double [][][] mf = {
	             {{4, 5, 6}, {7, 8, 9}},
	             {{1, 2, 3}, {7, 8, 9}},
	             {{1, 2, 3}, {4, 5, 6}},
	           };
		double [][] nm = {{1, 2, 3}, {4, 6}, {7, 8, 9}};
		
		System.out.print("Probando con argumento null: ");
		try{
			double r [][] = ProcesarArrays.quitarFila(null, 1);
			if (r != null){
				System.out.println(" --->  Error, debería devolver null: (-2) ");
				calificacion -= 2;
			}
			else{
				System.out.println(" --->  OK");
			}
		}catch(Exception exc){
			System.out.println(" ---> Error: Se produce error en tiempo de ejecución: (-2)");
			calificacion -= 2;
			exc.printStackTrace();
		}
		
		System.out.println("Probando con argumento que no es matriz válida:  ");
		try{
			double [][] r = null;
			for (int i = 0; i < nm[0].length; i++){
				//System.out.println("-----------------------");
				//System.out.println("Quitando fila " + i);
				r = ProcesarArrays.quitarFila(nm, i);
				//Algebra.printMatriz(r);
				if (r != null){
					System.out.println(" ---> Error, debería devolver null. (-2)");
					calificacion -= 2;
				}
				else{
					System.out.println(" ---> OK");					
				}
				//System.out.println();
			}
		}catch(Exception exc){
			System.out.println("Se produce error en tiempo de ejecución. (-2) ");
			calificacion -= 2;
			exc.printStackTrace();
		}
		
		System.out.print("Probando con filas que no existen: (-1 y m.length)  ");
		try{
			if (ProcesarArrays.quitarFila(m, -1) != null || ProcesarArrays.quitarFila(m, m.length) != null){
				System.out.println("Se produce error en tiempo de ejecución. (-2) ");
				calificacion -= 2;
			}
			else{
				System.out.println(" ---> OK");					
			}
		}catch(Exception exc){
			System.out.println("Se produce error en tiempo de ejecución. (-2) ");
			calificacion -= 2;
			exc.printStackTrace();
		}
	
		System.out.println("Probando con matrices válidas e índices en rango:  ");
		Matrices.printMatriz(m);
		for (int i = 0; i < m.length; i++){
			System.out.println("-----------------------");
			System.out.println("Quitando fila " + i);
			double r [][] = ProcesarArrays.quitarFila(m, i);
			Matrices.printMatriz(r);
			if (!Matrices.compararMatrices(r, mf[i])){
				System.out.println("  ---> Error, la matriz solicitada no es la obtenida. (-2) ");
				calificacion -= 2;
			}
			else{
				System.out.println(" ---> OK");					
			}
		}
		calificacion = calificacion>=0?calificacion:0;
		System.out.println();
		System.out.println("---------------------------------------------------------");	
		System.out.println("test quitarFila, calificación = " + calificacion);
		System.out.println("---------------------------------------------------------");	
		System.out.println();
		System.out.println();

		return calificacion;
	}


public static int test_quitarColumna(){
	
	System.out.println("******************************************************");
	System.out.println("test_quitarColumna ");
	System.out.println();
	
	int calificacion = 10;
	
	double [][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	double [][][] mf = {
             {{2, 3}, {5, 6}, {8, 9}},
             {{1, 3}, {4, 6}, {7, 9}},
             {{1, 2}, {4, 5}, {7, 8}},
           };
	double [][] nm = {{1, 2, 3}, {4, 6}, {7, 8, 9}};
	
	System.out.print("Probando con argumento null: ");
	try{
		double r [][] = ProcesarArrays.quitarCol(null, 1);
		if (r != null){
			System.out.println(" --->  Error, debería devolver null: (-2) ");
			calificacion -= 2;
		}
		else{
			System.out.println(" --->  OK");
		}
	}catch(Exception exc){
		System.out.println(" ---> Error: Se produce error en tiempo de ejecución: (-2)");
		calificacion -= 2;
		exc.printStackTrace();
	}
	
	System.out.println("Probando con argumento que no es matriz válida:  ");
	try{
		double [][] r = null;
		for (int i = 0; i < nm[0].length; i++){
			//System.out.println("-----------------------");
			//System.out.println("Quitando columna " + i);
			r = ProcesarArrays.quitarCol(nm, i);
			//Algebra.printMatriz(r);
			if (r != null){
				System.out.println(" ---> Error, debería devolver null. (-2)");
				calificacion -= 2;
			}
			else{
				System.out.println(" ---> OK");					
			}
			//System.out.println();
		}
	}catch(Exception exc){
		System.out.println("Se produce error en tiempo de ejecución. (-2) ");
		calificacion -= 2;
		exc.printStackTrace();
	}
	
	System.out.print("Probando con columnas que no existen: (-1 y m.length)  ");
	try{
		if (ProcesarArrays.quitarCol(m, -1) != null || ProcesarArrays.quitarCol(m, m.length) != null){
			System.out.println("Se produce error en tiempo de ejecución. (-2) ");
			calificacion -= 2;
		}
		else{
			System.out.println(" ---> OK");					
		}
	}catch(Exception exc){
		System.out.println("Se produce error en tiempo de ejecución. (-2) ");
		calificacion -= 2;
		exc.printStackTrace();
	}

	System.out.println("Probando con matrices válidas e índices en rango:  ");
	Matrices.printMatriz(m);
	for (int i = 0; i < m.length; i++){
		System.out.println("-----------------------");
		System.out.println("Quitando columna " + i);
		double r [][] = ProcesarArrays.quitarCol(m, i);
		Matrices.printMatriz(r);
		if (!Matrices.compararMatrices(r, mf[i])){
			System.out.println("  ---> Error, la matriz solicitada no es la obtenida. (-2) ");
			calificacion -= 2;
		}
		else{
			System.out.println(" ---> OK");					
		}
	}
	calificacion = calificacion>=0?calificacion:0;
	System.out.println();
	System.out.println("---------------------------------------------------------");	
	System.out.println("test quitarColumna, calificación = " + calificacion);
	System.out.println("---------------------------------------------------------");	
	System.out.println();
	System.out.println();

	return calificacion;
}


public static int test_getMenorComplementario(){
	
	System.out.println("*****************************************************");
	System.out.println("test_getMenorComplementario ");
	System.out.println();
	
	int calificacion = 10;
	
	double [][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	
	double [][][][] adjuntos = {
							    {
							      {{5,  6}, {8, 9}},
							      {{4,  6}, {7, 9}},
							      {{4,  5}, {7, 8}}
							    },
							    {
								  {{2,  3}, {8, 9}},
								  {{1,  3}, {7, 9}},
								  {{1,  2}, {7, 8}}
								},
								{
								  {{2,  3}, {5, 6}},
								  {{1,  3}, {4, 6}},
								  {{1,  2}, {4, 5}}								
								}
	                           };
	
	double [][] nm = {{1, 2, 3}, null, {7, 8, 9}};
	
	System.out.print("Probando con argumento null: ");
	try{
		double r [][] = ProcesarArrays.getMenorComplementario(null, 1, 1);
		if (r != null){
			System.out.println(" --->  Error, debería devolver null: (-2) ");
			calificacion -= 2;
		}
		else{
			System.out.println(" --->  OK");
		}
	}catch(Exception exc){
		System.out.println(" ---> Error: Se produce error en tiempo de ejecución: (-2)");
		calificacion -= 2;
		exc.printStackTrace();
	}
	
	System.out.println("Probando con argumento que no es matriz válida:  ");
	try{
		double [][] r = null;
		for (int i = 0; i < nm[0].length; i++){
			//System.out.println("-----------------------");
			//System.out.println("probando con índices: " + i);
			r = ProcesarArrays.getMenorComplementario(nm, i, 0);
			//Algebra.printMatriz(r);
			if (r != null){
				System.out.println(" ---> Error, debería devolver null. (-2)");
				calificacion -= 2;
			}
			else{
				System.out.println(" ---> OK");					
			}
			//System.out.println();
		}
	}catch(Exception exc){
		System.out.println("Se produce error en tiempo de ejecución. (-2) ");
		calificacion -= 2;
		exc.printStackTrace();
	}
	System.out.println("---------------------------------------------------------");	
	System.out.println("Probando con elementos que no existen: (-1 y m.length)  ");
	try{
		if (ProcesarArrays.getMenorComplementario(m, -1, 0) != null || ProcesarArrays.getMenorComplementario(m, m.length, 1) != null){
			System.out.println("Se produce error en tiempo de ejecución. (-2) ");
			calificacion -= 2;
		}
		else{
			System.out.println(" ---> OK");					
		}
	}catch(Exception exc){
		System.out.println("Se produce error en tiempo de ejecución. (-2) ");
		calificacion -= 2;
		exc.printStackTrace();
	}
	System.out.println("---------------------------------------------------------");	
	System.out.println("Probando con matrices válidas e índices en rango  ");
	Matrices.printMatriz(m);
	
	int errores = 0;
	
	String tabla [][] = new String[m.length-1][m[0].length];
	
	for (int i = 0; i < m.length; i++){
		System.out.println("menores complementario de elementos de fila: " + i);
		for (int j = 0; j < m[i].length; j++){
			double r [][] = ProcesarArrays.getMenorComplementario(m, i, j);
			String tr[] = Matrices.matrizToStringArray(r);
			/*
			for(int k = 0; k < tr.length; k++){
				System.out.println(tr[k]);
			}
			*/
			for(int k = 0; k < tr.length; k++){
				tabla[k][j] = tr[k];
			}
			if (!Matrices.compararMatrices(r, adjuntos[i][j])){
				errores++;
			}
		}
		Matrices.printTabla(tabla);
	}
	
	if (errores == 0){
		System.out.println(" ---> OK");
	}
	else{
		calificacion -= errores;
		System.out.println(" ---> Error. " + errores + " menores complementarios han sido mal construidos");
	}
	
	calificacion = calificacion>=0?calificacion:0;
	System.out.println();
	System.out.println("---------------------------------------------------------");	
	System.out.println("test getMenorComplementario, calificación = " + calificacion);
	System.out.println("---------------------------------------------------------");	
	System.out.println();
	System.out.println();

	return calificacion;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_quitarFila();
		test_quitarColumna();
		test_getMenorComplementario();
	}

}
