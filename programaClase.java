package proyecto_matriz;

public class programaClase {


	public static void main(String[] args) {
		String[][] paises = {
	            {"Argentina", "+54"},
	            {"Belice", "+501"},
	            {"Bolivia", "+591"},
	            {"Brasil", "+55"},
	            {"Canadá", "+1"},
	            {"Chile", "+56"},
	            {"Colombia", "+57"},
	            {"Costa Rica", "+506"},
	            {"Cuba", "+53"},
	            {"Ecuador", "+593"},
	            {"El Salvador", "+503"},
	            {"Estados Unidos", "+1"},
	            {"Granada", "+1-473"},
	            {"Guatemala", "+502"},
	            {"Guyana", "+592"},
	            {"Haití", "+509"},
	            {"Honduras", "+504"},
	            {"Jamaica", "+1-876"},
	            {"México", "+52"},
	            {"Nicaragua", "+505"},
	            {"Panamá", "+507"},
	            {"Paraguay", "+595"},
	            {"Perú", "+51"},
	            {"República Dominicana", "+1-809"},
	            {"San Cristóbal y Nieves", "+1-869"},
	            {"Santa Lucía", "+1-758"},
	            {"San Vicente y las Granadinas", "+1-784"},
	            {"Surinam", "+597"},
	            {"Trinidad y Tobago", "+1-868"},
	            {"Uruguay", "+598"},
	            {"Venezuela", "+58"}
		};
		System.out.println("Países de América");
		for (int i = 0; i < paises.length; i++) {
			System.out.println("País: " + paises[i][0] + ", Prefijo: " + paises[i][1]);
           	}
		System.out.println(" ");
		System.out.println("Países de cuatro letras");
		int contador = 0;
		
		for (int i = 0; i < paises.length; i++) {
			String nombre = paises[i][0];
			if (nombre.length() == 4) {
				System.out.println("País: " + paises[i][0] + ", Prefijo: " + paises[i][1]);
				contador ++;
				
			}
				
			}
		System.out.print("hay "+ contador + " países con nombre de cuatro letras");
		

	}

}			




       
