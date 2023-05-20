package ParcialA;

public class NavesEspaciales {
	
	private String lanzadera;
	private String roboticas;
	private String tripuladas;
	
	public NavesEspaciales (String lanzadera, String roboticas, String tripuladas){
		this.lanzadera= lanzadera;
		this.roboticas= roboticas;
		this.tripuladas= tripuladas;
	}
	public String getlanzadera(){
		return lanzadera;
		
	}
	public String getroboticas(){
		return roboticas;
		
	}
	public String gettripuladas(){
		return tripuladas;
		
	}
	
	abstract class Naves {
	    void callThis() {
	        System.out.println("vehículos capaces de abandonar la atmósfera terrestre, que destacan por su potencia y su velocidad.");
	    }
	}

	abstract class VehiculosLanzadera extends Naves {
	    void callThis() {
	        System.out.println("se trata de un cohete autopropulsado que sirve para lanzar una carga útil al espacio Estos cohetes impulsores funcionan mediante combustible químico sólido o bien propelente líquido, o ambos.");
	    }
	}

	abstract class NavesEspacialesNoTripuladas extends Naves {
	    void callThis() {
	        System.out.println("");
	    }
	}
	
	class SaturnoYSusLunas extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("Se trata de un proyecto ejecutado conjuntamente por la NASA (EE.UU.), la ESA (Europa) y la ASI (Italia), que todavía sigue en marcha. Desplazándose a unos 18000 km/h tardó casi 7 años en llegar a su destino. Permanece activa.");
	    }
	}

	class Jupiter extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("");
	    }
	}

	class PioneroX extends Jupiter {
	    void callThis() {
	        System.out.println("la primera de la historia en llegar. Ahora se sabe que se desplaza inercialmente hacia la estrella Aldebarán. Se calcula que llegará dentro de 1,6 millones de años");
	    }
	}

	class PioneroXI extends Jupiter {
	    void callThis() {
	        System.out.println("gemela de PioneroX, pesa 258 kg y tiene un empuje de 26 kg. Igualmente, se desplaza sin energía de forma inercial. Se estima que llegará a la estrella Lambda dentro de 4 millones de años.");
	    }
	}

	class SondaGalileo extends Jupiter {
	    void callThis() {
	        System.out.println("destruida en la actualidad, poseía un empuje principal de 0,4 toneladas.");
	    }
	}
	
	class Marte extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("donde más sondas se han enviado");
	    }
	}
	
	class MarinerIV extends Marte {
	    void callThis() {
	        System.out.println("la primera que sobrevoló el planeta, se halla actualmente en algún lugar de la órbita marciana sin energía. Empleaba hidracina como combustible y tenía un empuje de solo 22,44 kg. ");
	    }
	}
	
	class MarinerIX extends Marte {
	    void callThis() {
	        System.out.println("la primera en orbitar con éxito el planeta, ahora permanece inactiva.");
	    }
	}
	
	class ElPioneroDeMarte extends Marte {
	    void callThis() {
	        System.out.println("la primera nave en llevar un todoterreno para explorar la superficie del planeta, que incorporaba bolsas de aire para amortiguar el impacto al tocar Marte.");
	    }
	}
	
	class VikingoI extends Marte {
	    void callThis() {
	        System.out.println("la primera sonda en tocar Marte de forma controlada y enviar imágenes de la superficie. Cuenta con dos partes, el orbitador: con un empuje de 134,9 kg propulsado por nitrógeno comprimido; y el aterrizador");
	    }
	}
	
	class Curiosity extends Marte {
	    void callThis() {
	        System.out.println("robot sonda que se encuentra activo, con un empuje de 336,73 kg.");
	    }
	}

	class Mercurio extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("");
	    }
	}

	class MarinerX extends Mercurio {
	    void callThis() {
	        System.out.println("actualmente inactiva, orbita el sol. Fue la primera sonda en enviar imágenes de Mercurio después de sobrevolar Venus");
	    }
	}

	class LaSondaMensajero extends Mercurio {
	    void callThis() {
	        System.out.println("entró en la órbita mercuriana el 18 de marzo de 2011, la primera en lograrlo. Pesa 1093 kg y posee un empuje principal de 65,79 kg.");
	    }
	}
	
	class Pluton extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("");
	    }
	}
	
	class LaSondaEstadounidense extends Pluton {
	    void callThis() {
	        System.out.println("destinada a explorar Plutón y sus lunas, llegó al semiplaneta el 14 de julio de 2015, gracias a 16 motores, 4 con un empuje de 0,44 kg, y 12 de 0,09 kg. Viajaba a unos 56000 km/h y tardó más de 9 años en llegar a su destino, aunque se espera que prosiga su viaje más allá del cinturón de Kuiper.");
	    }
	}
	
	class UranoYNeptuno extends NavesEspacialesNoTripuladas {
	    void callThis() {
	        System.out.println("");
	    }
	}
	
	class SondaViajerosII extends UranoYNeptuno {
	    void callThis() {
	        System.out.println("ahora flota activa en algún lugar del espacio exterior, fue la primera en alcanzar estos dos planetas.");
	    }
	}
	
	abstract class NavesEspacialesTripuladas extends Naves {
	    void callThis() {
	        System.out.println("su propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación, en misiones donde se precisa de la destreza y de la toma de decisiones de personas, en detrimento de las máquinas.");
	    }
	}
	

	class MisionesLunares extends NavesEspacialesTripuladas {
	    void callThis() {
	        System.out.println("Apolo, Módulo Lunar, Soyuz");
	    }
	}
	
	class ExperimentacionYEstudio extends NavesEspacialesTripuladas {
	    void callThis() {
	        System.out.println("Vostok, la primera de la historia en llevar un ser humano al espacio");
	    }
	}
	
	class MantenimientoDeSatelites extends NavesEspacialesTripuladas {
	    void callThis() {
	        System.out.println("Orbitador del Transbordador Espacial— vehículo de carga con conexión a la EEI—, Gemini, Mercury, Unidad de Maniobra acoplada al traje EMU");
	    }
	}
}