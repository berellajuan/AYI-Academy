
public class MecanicoGas extends Mecanico{

	public MecanicoGas(String nombre, String apellido, String profesion, int dni) {
		super(nombre, apellido, profesion, dni);
	}
	
	@Override
	public void yaTeLoArreglo() {
		System.out.println("Tenes un problema es en el Gas");
	}

}
