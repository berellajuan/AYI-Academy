

public class MecanicoGeneral extends Mecanico implements CursoInyeccionElectronica{
	//Agregar mas cursos y implementar el MAP
	//private Map<K, V>
	//MAÑANA BD SQLite
	
	public MecanicoGeneral(String nombre, String apellido, String profesion, int dni) {
		super(nombre, apellido, profesion, dni);
	}
	
	@Override
	public void yaTeLoArreglo() {
		System.out.println("Tenes un problema en el motor");
	}

	@Override
	public void limpiandoInyectores() {
		System.out.println("Limpiando Inyectores con una maquina genial");
	}
}
