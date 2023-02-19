package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int CantidadCreados;
	
	public int cantidadAsientos() {
		if (asientos == null) {
			return 0;			
		}else {return(this.asientos.length);}
			
	}
	
	public String verificarIntegridad() {
		String integridad;
		for (int i = 0; i < cantidadAsientos();i++) {
			if ((((this.asientos[i].registro != this.registro) ||
					(this.registro != this.motor.registro))) && (this.asientos[i] != null)) {
				
				integridad = "Las piezas no son originales";
			    return integridad;
				
			}else {continue;}
		}
		integridad = "Auto Original";
		return integridad;	
	}
}
