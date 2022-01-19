
import java.util.ArrayList;

public class ColeccionLibros {

	private ArrayList<Libro> coleccion;

	public ColeccionLibros() {
		coleccion = new ArrayList<>();
	}

	public int sizeColeccion() {
		return coleccion.size();
	}

	public void insertarLibro(Libro libro) {

		if (coleccion.size() > 0) {

			for (int i = 0; i < coleccion.size(); i++) {

				if (coleccion.get(i).getTitulo().compareTo(coleccion.get(i+1).getTitulo()) == -1
						&& coleccion.get(i).getTitulo().compareTo(coleccion.get(i-1).getTitulo()) == 1) {
					for (int j = coleccion.size()-1; j > i; j--) {
						
						coleccion.add(j+1, coleccion.get(j));
					}
					coleccion.add(i,libro);
				}

			}

		}
		coleccion.add(libro);
	}

	public void eliminarLibro(int index) {

		coleccion.remove(index);
	}

	public Libro getLibro(int index) {
		return coleccion.get(index);
	}

	@Override

	public String toString() {
		String listaLibros = "Coleccion: \n";

		for (Libro libro : coleccion) {
			listaLibros += libro.toString();
			
			listaLibros += "\n\n";
		}
		return listaLibros;
	}

}
