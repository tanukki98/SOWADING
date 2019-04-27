


package pajakawaii.upn.edu.app.model;

public class Usuario {

	private int usuarioID;
	private String nombres;
	private String apellidos;
	private String nacionalidad;
	private String sexo;
	private String nombreu;
	private String contrasenia;
	private boolean esAdmin;
	
	@Override
	public String toString() {
		return "Usuario [usuarioID=" + usuarioID + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + ", nombreu=" + nombreu + ", contrasenia="
				+ contrasenia + ", esAdmin=" + esAdmin + "]";
	}
	
	public int getUsuarioID() {
		return usuarioID;
	}
	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNombreu() {
		return nombreu;
	}
	public void setNombreu(String nombreu) {
		this.nombreu = nombreu;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean getEsAdmin() {
		return esAdmin;
	}
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	
}
