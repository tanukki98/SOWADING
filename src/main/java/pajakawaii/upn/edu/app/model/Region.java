package pajakawaii.upn.edu.app.model;

public class Region {
	private int regionID;
	private String nombre_region;
	private String coordenadas;
	public int getRegionID() {
		return regionID;
	}
	public String getNombre_region() {
		return nombre_region;
	}
	public String getCoordenadas() {
		return coordenadas;
	}
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}
	public void setNombre_region(String nombre_region) {
		this.nombre_region = nombre_region;
	}
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
}
