package pc;

import java.io.IOException;

public class Arraysbuyeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres= {"Pedro","Javi","Manuel","Sergio"};
		
		
		// Print all the array elements
	      for (int i = 0; i < nombres.length; i++) {
	         System.out.println(nombres[i] + " ");
	      }
		
	      
	      /*Esto no es creacion mia*/
	      
	      double[][] mUnidad= new double[4][4];
	      
	      for (int i=0; i < mUnidad.length; i++) {
	          for (int j=0; j < mUnidad[i].length; j++) {
	              if (i == j) {
	                  mUnidad[i][j]=1.0;
	              }else {
	                  mUnidad[i][j] = 0.0;
	              }
	          }
	      }

	      for (int i=0; i < mUnidad.length; i++) {
	          for (int j=0; j < mUnidad[i].length; j++) {
	              System.out.print(mUnidad[i][j]+"\t");
	          }
	          System.out.println("");
	      }

	      try{
	  //espera la pulsación de una tecla y luego RETORNO//
	          System.in.read();
	      }catch (Exception ex) {  }
	      
	      
	      
	      
	      int axis=utilidades.Teclado.readInt();
	      System.out.println(axis);
	      
	      
	}

}
