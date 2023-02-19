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
		int contador = 0;
		for(Asiento a: this.asientos) {
			if(a != null) {
				contador += 1;
			}
		
		}
		return contador;
			
	}
	
	public String verificarIntegridad() {
		for (int i = 0; i < cantidadAsientos();i++) {
			if (asientos != null) {
				if( (motor.registro != registro) || (asientos[i].registro != registro) ) {
					
					return "Las piezas no son originales";
				}
				
		    }
		}
		return "Auto original";	
	}
}
