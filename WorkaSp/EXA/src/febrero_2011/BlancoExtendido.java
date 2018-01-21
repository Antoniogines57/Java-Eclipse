package febrero_2011;

public class BlancoExtendido extends Blanco {
	public BlancoExtendido() {
		super();
	}
	public Localizacion getNinePos() {
		if(location[8].getT()!=0&&location[8].getY()!=0&&location[8].getX()!=0) {
			return location[8];
		}
		else {
			 return null;
		}
	}
	public Localizacion[] getNPositions(int n) {
		if(n<0) {
			return null;
		}
		else if(n>10) {
			n=10;
			Localizacion[] fin=new Localizacion[n];
			for(int i=10-n;i<fin.length;i++) {
				fin[i]=location[i];
			}
			return fin;
		}
		else {
			Localizacion[] fin=new Localizacion[n];
			for(int i=10-n;i<fin.length;i++) {
				fin[i]=location[i];
			}
			return fin;
		}
	}
	public double velocidad() {
		return (Math.sqrt((location[9].getX()-location[8].getX())*(location[9].getX()-location[8].getX())+
				(location[9].getY()-location[8].getY())*(location[9].getY()-location[8].getY()))/
				(location[9].getT()-location[8].getT()));
	}
}
