package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int CantidadCreados;
	
	public int CantidadAsientos() {
		return(this.asientos.length);
	}
	
	public String VerificarIntegridad() {
		String integridad;
		for (int i = 0; i < CantidadAsientos();i++) {
			if ((this.asientos[i].registro != this.registro) ||
					(this.registro != this.motor.registro)) {
				
				integridad = "Las piezas no son originales";
			    return integridad;
				
			}else {continue;}
		}
		integridad = "Auto Original";
		return integridad;	
	}
}
