package cortana;

public class Fecha {
	private int dia;
	private int mes;
	private int year;
	public Fecha(int dia, int mes, int anyo) {
		if(dia<1||dia>31||mes<1||mes>12||year<2012) {
			System.out.println("Fecha introducida no valida.");
		}
		else {
			this.dia=dia; this.mes=mes; this.year=anyo;
		}
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getYear() {
		return year;
	}
	public boolean fechaAnteriorA(Fecha p) {
		if(year<=p.getYear()) {
			if(mes<=p.getMes()) {
				if(dia<=p.getDia()) {
					return true;
				}
				else return false;
			}
			else return false;
		}
		else return false;
	}
	public Fecha newFecha() {
		return new Fecha(dia,mes,year);
	}
	public String toString() {
		return dia+"/"+mes+"/"+year;
	}
	public Fecha getActualDay() {
		return null;
	}
	public boolean mismoDia(Fecha f) {
		if(year<f.getYear()) {
			if(mes<f.getMes()) {
				if(dia<f.getDia()) {
					return true;
				}
				else return false;
			}
			else return false;
		}
		else return false;
	}
	
}
