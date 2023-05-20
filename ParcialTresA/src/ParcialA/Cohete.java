package ParcialA;

public class Cohete implements NaveEspacial {
    private String propulsor;
	private double peso;
	private double capacidad;
	 private double velocidadMaxima;

    public Cohete(double peso, double capacidad, double velocidadMaxima, String propulsor) {
        super();
        this.peso = peso;
	     this.capacidad = capacidad;
	     this.velocidadMaxima = velocidadMaxima;
        this.propulsor = propulsor;
    }

    public String getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }

    @Override
    public void despegar() {
        System.out.println("El cohete está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El cohete está aterrizando.");
    }
    @Override
    public String toString() {
        return "Cohete [peso=" + peso + ", capacidad=" + capacidad + ", velocidadMaxima=" + velocidadMaxima + ", propulsor=" + propulsor + "]";
    }
}