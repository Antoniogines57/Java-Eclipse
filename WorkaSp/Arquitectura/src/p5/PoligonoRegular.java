package p5;

public class PoligonoRegular {
	private Vector vectorDireccion;
	private Vector[] vertices;
	
	public PoligonoRegular(int num_lados, double lado) {
		double sigma= (Math.PI)/num_lados;
		vertices=new Vector[num_lados];
		double radio=lado/2*Math.sin(sigma);
		
		vertices[0]=new Vector(new Punto(0,0),new Punto(0,-radio).girar((2*Math.PI)-sigma));
		
		for(int i=1;i<vertices.length;i++) {
			vertices[i]=(Vector)vertices[i-1].girar(2*sigma);
		}
		vectorDireccion=new Vector(new Punto(0,0), new Punto(0,1));
		
	}
	public PoligonoRegular(Vector direccion, Vector[] veert) {
		this.vectorDireccion=direccion; this.vertices=veert;
	}
	public Punto getCentre() {
		return vectorDireccion.getFirstPoint();
	}
	public Vector getOrientacion() {
		return vectorDireccion;
	}
	public double getLado() {
		return 2*vertices[0].getModule()*Math.sin(Math.PI/vertices.length);
	}
	public double getPerimetro() {
		return  vertices.length*2*vertices[0].getModule()*Math.sin(Math.PI/vertices.length);
	}
	public double getArea() {
		return vertices[0].getModule()*Math.cos(Math.PI/vertices.length);
	}
	public Punto[] getVortex() {
		Punto[] vortex=new Punto[vertices.length];
		for(int i=0;i<vortex.length;i++){
			vortex[i]=((Vector)vertices[i]).getFinalPoint();
		}
		return vortex;
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
		String concatt="Centro en "+vectorDireccion.getFinalPoint();
		for(int i=0;i<vertices.length-1;i++) {
			concatt+="\nLado 1: "+((Vector)vertices[i]).getFinalPoint().distancia((((Vector)vertices[i+1]).getFinalPoint()));
		}
		return concatt;
	}
	
	
}
