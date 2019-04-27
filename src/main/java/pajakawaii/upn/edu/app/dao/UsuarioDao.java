
package pajakawaii.upn.edu.app.dao;


import java.util.ArrayList;
import java.util.List;

import pajakawaii.upn.edu.app.model.Usuario;

public interface UsuarioDao {
	public List<Usuario> listarUsuario();
	public Usuario busquedaUsuario(int usuarioID);
	
	public int insertarUsuario(Usuario usuarioDao);
	public int editarUsuario(Usuario usuarioDao);
	public int eliminarUsuario(int usuarioID);
}

