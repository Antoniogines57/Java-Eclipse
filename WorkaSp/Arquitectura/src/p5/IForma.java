/**
 * 
 */
package p5;

/**
 * Modela un objeto geomŽtrico que est‡ situado en una posici—n de un espacio de dos 
 * dimensiones con  una orientaci—n dada y que puede ser trasladado y girado 
 * respecto de un centro de giro. 
 * 
 * @author LSI
 *
 */
public interface IForma {
	
	/**
	 * Devuelve coordenada x del objeto (del punto, del origen del vector o del centro del pol’gono)
	 * @return coordenada x del objeto
	 */
	public double getX();
	
	
	/**
	 * Devuelve coordenada y del objeto (del punto, del origen del vector o del centro del pol’gono)
	 * @return coordenada y del objeto
	 */
	public double getY();
	
	
	/**
	 * Devuelve el ‡ngulo que forma el objeto con el eje X.
	 * @return ‡ngulo que forma el objeto con el eje X.
	 */
	public double getOrientacion();
	
	
	/**
	 * Giro del objeto respecto de un punto.
	 * @param grados del giro
	 * @param x coordenada x del centro de giro.
	 * @param y coordenada y del centro de giro
	 * @return referencia a la forma girada. 
	 *         La clase debe definir si el mŽtodo
	 *         gira al objeto receptor del mensaje o se crea un nuevo objeto resultado
	 *         de girar al objeto sobre el que se invoca el método.
	 */
	public IForma girar(double grados, double x, double y);
	
	
	/**
	 * Giro del objeto respecto de s’ mismo (respecto del punto retornado por getX y getY).
	 * 	 
	 * @param grados de giro.
	 * @return referencia a la forma girada.
	 *         La clase debe definir si el mŽtodo
	 *         gira al objeto receptor del mensaje o se crea un nuevo objeto resultado
	 *         de girar al objeto sobre el que se invoca el método.
	 */
	public IForma girar(double grados);

	/**
	 * Traslaci—n del objeto.
	 * @param deltaX traslaci—n en X
	 * @param deltaY traslaci—n en Y
	 * @return referencia a la forma trasladada.
	 *         La clase debe definir si el método
	 *         traslada al objeto receptor del mensaje o se crea un nuevo objeto resultado
	 *         de trasladar al objeto sobre el que se invoca el método.
	 */
	public IForma trasladar(double deltaX, double deltaY);
	
	/**
	 * Devuelve la distancia del objeto que recibe el mensaje respecto del argumento.
	 * La distancia debe calcularse respecto de los puntos definidos por los mŽtodos getX y getY
	 * de ambos objetos.
	 * La distancia a un vector es a su origen y a un pol’gono es a su centro.
	 * La distancia entre dos vectores ser‡ entre or’genes y entre pol’gonos ser‡ entre centros.
	 * @param forma objeto respecto del que se calcula la distancia.
	 * @return distancia del objeto al punto definido por las coordenadas devueltas en getX y getY.
	 */
	public double distancia(IForma forma);
	
	
}
