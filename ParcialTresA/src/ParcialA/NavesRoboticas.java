package ParcialA;

public class NavesRoboticas {

	private String EEUU;
	private String Rusia;
	private String Europa;
	
	public NavesRoboticas (String EEUU, String Rusia, String Europa){
		this.EEUU= EEUU;
		this.Rusia= Rusia;
		this.Europa= Europa;
	
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
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("La nave robotica va hacia el espacio");
	}
}
