package ParcialA;

public class LanzadoresDestacados {

	
	private String EEUU;
	private String Rusia;
	private String Europa;
	private String Japon;
	private String China;
	
	public LanzadoresDestacados (String EEUU, String Rusia, String Europa, String Japon, String China){
		this.EEUU= EEUU;
		this.Rusia= Rusia;
		this.Europa= Europa;
		this.Japon= Japon;
		this.China= China;
	}
	public String getEEUU(){
		return EEUU;
		
	}
	public String getRusia(){
		return Rusia;
		
	}
	public String getEuropa(){
		return Europa;
		
	}
	public String getJapon(){
		return Japon;
		
	}
	public String getChina(){
		return China;
		
	}
	public void volar() {
		// TODO Auto-generated method stub
	   System.out.println("La nave a sido lanzada a la orbita");
	}
}
