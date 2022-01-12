
public class Persona {
	private static int numerPersonas;
	
	private String  nombre;
	private String apellidos;
	private String fechaNacimiento;
	private int edad;
	private String paisNacimiento;
	private String ciudadNacimiento;
	
	public Persona () {
		
	}
	
	public Persona (String nombre, String apellidos, int edad) {
		
		this.nombre= nombre;
		this.apellidos= apellidos;
		this.fechaNacimiento= FechaLugar.daFechaConsole();
		this.edad = edad;
		this.paisNacimiento= FechaLugar.daPaisCons();
		this.ciudadNacimiento= FechaLugar.daCiudadCons();
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public String getPaisNacimineto() {
		return paisNacimiento;
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos= apellidos;
	}
	public void fechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento= fechaNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento= paisNacimiento;
	}
	
	public void leerConsola() {
		nombre= MyInput.readStringConsole();
		nombre= MyInput.UpperThenLow(nombre);
		apellidos = MyInput.readStringConsole();
		fechaNacimiento= FechaLugar.daFechaConsole();
		paisNacimiento = FechaLugar.daPaisCons();
		
	}
	public void leerWindow() {
		String mensajeNombre= "Introduce el nombre del autor:";
		String mensajeApellidos= "Introduce el apellido del autor:";
		
		FechaLugar.mensajeDia("Introduce el dia");
		FechaLugar.mensajeMes("Introduce el mes");
		FechaLugar.mensajeAnno("Introduce el año");
		
		FechaLugar.mensajePais("Introduce el país");
		
				
		nombre = MyInput.readStringWindow(mensajeNombre);
		nombre=MyInput.UpperThenLow(nombre);
		apellidos = MyInput.readStringWindow(mensajeApellidos);
		fechaNacimiento = FechaLugar.daFechaWindow();
		paisNacimiento= FechaLugar.daPaisConWindow();
	}
	
	@Override
	
	public String toString() {
		
		String persona = "Nombre: \t\t"+this.nombre+"\n"+
						"Apellidos:\t\t"+this.apellidos+"\n"+
						"Fecha de nacimiento: \t"+	this.fechaNacimiento+"\n"
						+ "País de nacimiento:\t"+this.paisNacimiento+"\n";
		
		return persona;
	}
	
	

}
