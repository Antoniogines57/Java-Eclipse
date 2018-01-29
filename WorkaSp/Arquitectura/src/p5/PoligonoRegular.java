package p5;

public class PoligonoRegular {
	private Vector vectorDireccion;
	private Punto[] vertices;
	
	public PoligonoRegular(int num_lados, double lado) {
		double sigma= Math.PI/num_lados;
		double radio=lado/2*Math.sin(sigma);
		vertices=new Punto[num_lados];
		vertices[0]=new Punto(0,radio);
		
		
		for(int i=1;i<vertices.length;i++) {
			vertices[i]=vertices[i-1].girar(2*sigma,0,0);
		}
		vectorDireccion=new Vector(new Punto(0,0), new Punto(0,1));
		
	}
	public PoligonoRegular(Vector direccion, Punto[] veert) {
		this.vectorDireccion=direccion; this.vertices=veert;
	}
	public Punto getCentre() {
		return vectorDireccion.getFirstPoint();
	}
	public Vector getOrientacion() {
		return vectorDireccion;
	}
	public double getLado() {
		return 2*vertices[0].distancia(vertices[1])*Math.sin(Math.PI/vertices.length);
	}
	public double getPerimetro() {
		return  vertices.length*2*vertices[0].distancia(vertices[1])*Math.sin(Math.PI/vertices.length);
	}
	public double getArea() {
		return vertices[0].distancia(vertices[1])*Math.cos(Math.PI/vertices.length);
	}
	public Punto[] getVortex() {
		return vertices;
	}
	public PoligonoRegular girar(double grados, double dx, double dy) {
		vectorDireccion.girar(grados,dx,dy);
		for(int i=0;i<vertices.length;i++) {
			vertices[i].girar(grados, dx, dy);
		}
		return new PoligonoRegular(vectorDireccion, vertices);
	}
	public PoligonoRegular girar(double grados) {
		vectorDireccion.girar(grados);
		for(int i=0;i<vertices.length;i++) {
			vertices[i].girar(grados);
		}
		return new PoligonoRegular(vectorDireccion,vertices);
	}
	public PoligonoRegular trasladar(double dx, double dy) {
		vectorDireccion.trasladar(dx, dy);
		for(int i=0;i<vertices.length;i++) {
			vertices[i].trasladar(dx, dy);
		}
		return new PoligonoRegular(vectorDireccion,vertices);
	}
	public String toString() {
		String concatt="Centro en "+getCentre()+"\n";
		for(int i=0;i<vertices.length;i++) {
			if(i<vertices.length-1) {
				concatt+="\nLado "+(i+1)+": "+vertices[i].distancia((vertices[i+1]));
			}
			else {
				concatt+="\nLado "+(i+1)+": "+vertices[i].distancia((vertices[0]));
			}
		}
		return concatt;
	}
	
	
}
