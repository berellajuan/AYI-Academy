
public class Clase04072022 {

	public static void main(String[] args) {
		TallerMecanico taller = new TallerMecanico("Taller AYI", "Algun lugar 1234", 35176549);
		System.out.println(taller);
		
		System.out.println("Estado del taller: " + taller.estaAbierto());
		
		Cliente matu = new Cliente("Matu", "D", "Desarollador", 238541868);
		
		Mecanico meca = new MecanicoGas("Jose", "Lopez", "Mecanico Gas", 238541865);
		
		Mecanico meca2 = new MecanicoGeneral("Pedro", "Dipalma", "Mecanico General Automotor", 238541861);
		
		taller.agregarMecanico(meca);
		taller.agregarMecanico(meca2);
		
		
		if(taller.isEstado()) {
			matu.ayudaSeRompio(taller);			
		}else {
			System.out.println("Noooo llamo a la grua");
		}
	}

}
