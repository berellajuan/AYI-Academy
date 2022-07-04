import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TallerMecanico {
	private String nombre;
	private String direccion;
	private int telefono;
	private boolean estado;
	private List<Mecanico> mecanicos = new ArrayList<>();

	public TallerMecanico(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public boolean estaAbierto() {
		switch (LocalDate.now().getDayOfWeek().getValue()) {
		case 6: {
			this.setEstado(false);
		}
		case 7: {
			this.setEstado(false);
		}
		default:
			this.setEstado(true);
		}

		return this.estado;
	}
	
	public void agregarMecanico(Mecanico mecanico) {
		this.mecanicos.add(mecanico);
	}
	
	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "TallerMecanico nombre:" + nombre + ", direccion:" + direccion + ", telefono:" + telefono;
	}

}
