
public class pruebaMyinput {

	public static void main(String[] args) {
		
		Autor autor1= new Autor();
		
		autor1.leerConsola();
		
		Libro libro1= new Libro();
		libro1.leerConsola();
		libro1.setAutor(autor1);
		System.out.println(libro1);

	}

}
