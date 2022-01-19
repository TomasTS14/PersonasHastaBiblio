
public class PruebaLibro {

	public static void main(String[] args) {
		
		Autor autor1= new Autor();
		
//		autor1.leerConsola();
		
		autor1.setNombre("Marco");
		autor1.setApellidos("inaros");
		autor1.getFechaNacimiento();
		autor1.setPaisNacimiento("Myammar");
		
		
		
		Libro libro1= new Libro();
//		libro1.leerConsola();
		libro1.setAutor(autor1);
		libro1.setTitulo("Libro1");
		libro1.setEdicion("3ª edicion");
		libro1.setCodigo("123612837-X");
		libro1.setLugarPubli("Burundi", "Burundilandia", "superBUrundi");
		libro1.setfechaPublicacion("2", "4", "1998");
		libro1.setPaginas(981);
		System.out.println(libro1);

	}

}
