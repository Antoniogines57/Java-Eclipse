package cortana.programms;

public class AddHotel implements Programa {
	private String def;
	@Override
	public void setDefinition(String defi) {
		// TODO Auto-generated method stub
		if(defi!=null&&defi.equals(" ")==false) {
			def=new String(defi);
		}
	}

	@Override
	public String getDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}