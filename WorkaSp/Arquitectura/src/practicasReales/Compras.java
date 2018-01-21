package practicasReales;
public class Compras {

	private static int saldoEnCuenta;
    private static String productos[][]=new String[200][3];       //[id][0]=Nombre producto;             //
    private static int precios[][]=new int[200][3];               //[id][1]=precio                       //
    private static String users[][]=new String[100][4];           //[id][0]=usuario;  [id][1]=password   //
    private static int userPosesions[][]=new int[100][50];        //[id][idnum]=nº id producto poseido   //
    private static int tempID;
    
    static void getList() {
    	for(int i=0;i<productos.length-1;i++) {
    			System.out.println((i+1)+". "+productos[i][0]+" -> "+productos[i][1]+".");
    	}
    }
    static String getProduct(int id){
    	return users[id][1];	
    }
    
    private static void adder() {
    	users[0][0]="adminKeyless";
    	users[0][1]="getMastuersoBinarioAlgoritmo";
    }
    
    static String addProducto(String nombre, int precio){
        String added="El producto ha sido añadido";
    	int a=0;
        for(int i=0;i<productos.length-1;i++){
        	for(int j=0;j<productos[i].length-1;j++) {
        		if(productos[i][j]!=null){a++;}
        	}
        }
        productos[a-1][0]=nombre;
        precios[a-1][1]=precio;
        return added;
    }
    
    static boolean login() {
    	boolean logged=false;
    	
    	System.out.println("Introduzca su usuario y contraseña: ");
		String usuario=Teclado.readString();
		String password=Teclado.readString();
		Compras.getTempID(usuario);
		if(users[tempID][1].equals(password)) {
			logged=true;
		}
		return logged;
    }
    
    private static void getTempID(String username) {
    	int a=0;
    	for(int i=0;i<users.length-1;i++) {
    		if(users[i][0].equals(username)) {
    			a++;
    		}
    	}
    	tempID=a;
    	
    }
    
    static int checkAvalable(String name) {
    	int id=-1;
    	for(int i=0;i<users.length-1;i++) {
    		if(users[i][0]==null) {
    			id=i;
    		}
    	}
    	return id;
    }
    static void register() {
    	System.out.println("Introduzca usuario: ");
    	String setUsuario=Teclado.readString();
    	System.out.println("Introduzca una contraseña: ");
    	String setPassword=Teclado.readString();
    	int id=Compras.checkAvalable(setUsuario);
    	users[id][0]=setUsuario;
    	users[id][1]=setPassword;
    }
    static void setPassword(String password, int id) {users[id][1]=password;}
    static boolean checkLogin(String password, int id) {
    	if(users[id][1].equals(password)) {return true;}
    	else return false;
    }
    
    static void addMoney(int cuantity) {saldoEnCuenta+=cuantity;}
    static int getMoney() {return saldoEnCuenta;}
    static void realizarCompra(int id, int IDUSER) {
    	saldoEnCuenta-=precios[id][1];
    	//userPosesions[IDUSER][id];//
    }
    
	/*public static void main(String[] args) {
		
		System.out.println("Bienvenido a la pagina de compras de ropa.");
		System.out.println("Introduzca su usuario y contraseña: ");
		String usuario=utilidades.Teclado.readString();
		//---------------String password=utilidades.Teclado.readString();-----------------------//
		int ident=Compras.checkUser(usuario);
		if(Compras.checkUser(usuario)==-1) {
			System.out.println("No existen dicho usuario, desea registrarse?");
			String decision=utilidades.Teclado.readString();
			if(decision.equals("si")||decision.equals("SI")||decision.equals("Si")) {
				//crea nuevo usuario con "usuario"
				System.out.println("Introduzca una contraseña");
				String password=utilidades.Teclado.readString();
				Compras.setUser(usuario, ident);
				Compras.setPassword(password, ident);
				System.out.println("Gracias por registrase.\n\n");
			}
		}
		
		System.out.println("Disponemos de los siguientes productos: ");
		Compras.getList();
		    
		}*/
		
    /*
     *  
     * if(Compras.checkUser(usuario)==-1) {
			System.out.println("No existen dicho usuario, desea registrarse?");
			String decision=Teclado.readString();
			if(decision.equals("si")||decision.equals("SI")||decision.equals("Si")) {
				//crea nuevo usuario con "usuario"//
				System.out.println("Introduzca una contraseña");
				String setPassword=Teclado.readString();
				Compras.setUser(usuario, ident);
				Compras.setPassword(setPassword, ident);
				System.out.println("Gracias por registrase.\n\n");
			}
;
		}
		else {
			System.out.println("Introduzca su contraseña: ");
			String passwordLogin=Teclado.readString();
			Compras.checkLogin(passwordLogin, ident);
			}
			*
			*
			*/
		
		
	}

