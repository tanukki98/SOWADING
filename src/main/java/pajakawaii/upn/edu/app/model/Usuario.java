package pajakawaii.upn.edu.app.model;

public class Usuario {
	private int usuarioID;
	private String nombre_region;
	private String coordenadas;
	public int getUsuarioID() {
		return usuarioID;
	}
	public String getNombre_region() {
		return nombre_region;
	}
	public String getCoordenadas() {
		return coordenadas;
	}
	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}
	public void setNombre_region(String nombre_region) {
		this.nombre_region = nombre_region;
	}
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
}
