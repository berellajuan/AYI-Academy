
public class Mecanico extends Persona {
	
	public Mecanico(String nombre, String apellido, String profesion, int dni) {
		super(nombre, apellido, profesion, dni);
	}
	
	public void yaTeLoArreglo() {
		System.out.println("Ya te lo arreglo no temas");
	}
}
