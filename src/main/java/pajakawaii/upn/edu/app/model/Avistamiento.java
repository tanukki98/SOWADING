package pajakawaii.upn.edu.app.model;

import java.util.Date;

public class Avistamiento {
	private int avistamientoID;
	private String descripcion_avista;
	private Date fecha_avista;
	private int cantidad_aves;
	private Ave avesID;
	private Region regionID;
	private Usuario usuarioID;
	public int getAvistamientoID() {
		return avistamientoID;
	}
	public String getDescripcion_avista() {
		return descripcion_avista;
	}
	public Date getFecha_avista() {
		return fecha_avista;
	}
	public int getCantidad_aves() {
		return cantidad_aves;
	}
	public Ave getAvesID() {
		return avesID;
	}
	public Region getRegionID() {
		return regionID;
	}
	public Usuario getUsuarioID() {
		return usuarioID;
	}
	public void setAvistamientoID(int avistamientoID) {
		this.avistamientoID = avistamientoID;
	}
	public void setDescripcion_avista(String descripcion_avista) {
		this.descripcion_avista = descripcion_avista;
	}
	public void setFecha_avista(Date fecha_avista) {
		this.fecha_avista = fecha_avista;
	}
	public void setCantidad_aves(int cantidad_aves) {
		this.cantidad_aves = cantidad_aves;
	}
	public void setAvesID(Ave avesID) {
		this.avesID = avesID;
	}
	public void setRegionID(Region regionID) {
		this.regionID = regionID;
	}
	public void setUsuarioID(Usuario usuarioID) {
		this.usuarioID = usuarioID;
	}
}
