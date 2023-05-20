package ParcialA;

public class NavesTripuladasImportantes {
	
	private String EEUU;
	private String Rusia;
	private String Internacional;
	private String China;
	
	public NavesTripuladasImportantes (String EEUU, String Rusia, String Internacional, String China){
		this.EEUU= EEUU;
		this.Rusia= Rusia;
		this.Internacional= Internacional;
		this.China= China;
	
}
	public String getEEUU(){
		return EEUU;
		
	}
	public String getRusia(){
		return Rusia;
		
	}
	public String getInternacional(){
		return Internacional;
		
	}
	public String getChina(){
		return China;
		
	}
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("La nave tripulada se dirige hacia el espacio con personas a bordo");
	}
}