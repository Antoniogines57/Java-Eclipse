package febrero_2017_SOLO_OBJETOS;
import java.text.DecimalFormat;

public class Lavadora implements IElectrodomesticos {
	private String color;
	private double precio, consumo;
	private CodigoBarras barCode;
	
	public Lavadora() {
		precio=100;consumo=100; color="Blanco";
		barCode=new CodigoBarras(new int[] {0,0,0,0,0,0,0,0,0,0});
	}
	public Lavadora(double precio, double consumo, String color, CodigoBarras cod) {
		if(precio>=100&&consumo>=100&&color!=null&&cod!=null) {
			this.precio=precio;this.consumo=consumo;this.color=color;
			barCode=cod;
		}
	}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {
		if(precio>=100) this.precio=precio;
	}
	public CodigoBarras getCodigo() {return barCode;}
	public double getConsumo() {
		return consumo;
	}
	public void setColor(String color) {
		if(color!=null) this.color=color;
	}
	public String toString() {
		DecimalFormat f=new DecimalFormat();
		f.setMaximumFractionDigits(2); f.setMinimumFractionDigits(2);
		return "Precio: "+f.format(precio)+"€, consumo: "+f.format(consumo)+"kWh, color: "+color;
	}
	
	
}
