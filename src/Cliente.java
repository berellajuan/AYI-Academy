
public class Cliente extends Persona{

	public Cliente(String nombre, String apellido, String profesion, int dni) {
		super(nombre, apellido, profesion, dni);
	}
	
	public void ayudaSeRompio(TallerMecanico taller) {
		System.out.println("Ayuda se Rompio mi Autito");
		
		taller.getMecanicos().get(0).yaTeLoArreglo();
		
	}
}
