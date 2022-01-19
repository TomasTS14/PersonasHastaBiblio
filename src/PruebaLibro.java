
public class PruebaLibro {

	public static void main(String[] args) {
		
		Autor autor1= new Autor();
		
//		autor1.leerConsola();
		
		autor1.setNombre("Marco");
		autor1.setApellidos("inaros");
		autor1.setPaisNacimiento("Myammar");
		
		Autor autor2= new Autor();
		
		autor2.setNombre("Antoine");
		autor2.setApellidos("de Saint");
		autor2.setPaisNacimiento("Francia");
		
		ColeccionLibros coleccion1 = new ColeccionLibros();
		
		
		Libro libro1= new Libro();
//		libro1.leerConsola();
		libro1.setAutor(autor1);
		libro1.setTitulo("Des Ruggo");
		libro1.setEdicion("3ª edicion");
		libro1.setCodigo("123612837-X");
		libro1.setLugarPubli("higiro", "Monge", "Burundi");
		libro1.setfechaPublicacion("2", "4", "1998");
		libro1.setPaginas(981);
		
		coleccion1.insertarLibro(libro1);
		
		
		Libro libro2= new Libro();
		libro2.setAutor(autor1);
		libro2.setTitulo("El principito");
		libro2.setEdicion("1ª edicion");
		libro2.setCodigo("1231823-X");
		libro2.setLugarPubli("Kubre", "Toiloisse", "Francia");
		libro2.setfechaPublicacion("2", "4", "1943");
		libro2.setPaginas(981);
		
		coleccion1.insertarLibro(libro2);
		
		
		Libro libro3= new Libro();
		libro3.setAutor(autor1);
		libro3.setTitulo("Zarai");
		libro3.setEdicion("1ª edicion");
		libro3.setCodigo("12318243-X");
		libro3.setLugarPubli("Kubre", "Toiloisse", "España");
		libro3.setfechaPublicacion("2", "4", "1943");
		libro3.setPaginas(981);
		
		coleccion1.insertarLibro(libro3);
		
		
		
		
		System.out.println(coleccion1);
		
		

	}

}
