



package pajakawaii.upn.edu.app.service;

import pajakawaii.upn.edu.app.dao.UsuarioDao;
import pajakawaii.upn.edu.app.model.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.PreparedStatement;

import pajakawaii.upn.edu.app.dao.UsuarioDao;
import pajakawaii.upn.edu.app.model.Usuario;

public class UsuarioImpl implements UsuarioDao{
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/*FIND BY*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
    public Usuario busquedaUsuario(int usuarioID) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "SELECT * FROM usuario WHERE usuarioID = ?";
		Usuario usuario = (Usuario) jdbcTemplate.queryForObject(
				query, new Object[] { usuarioID }, new BeanPropertyRowMapper(Usuario.class));
      
        return usuario;
	};
	
	/*CREATE*/
	public int insertarAspirante(Usuario usuario) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"INSERT INTO usuario(UsuarioID, Nombres, Apellidos, Nacionalidad, Sexo, Nombreu, Contrasenia, EsAdmin)"
				+ "VALUES (?,?,?,?,?,?,?,?)";
		Object[] inputs = new Object[] 
			{
				usuario.getUsuarioID(),
				usuario.getNombres(),
				usuario.getApellidos(),
				usuario.getNacionalidad(),
				usuario.getSexo(),
				usuario.getNombreu(),
				usuario.getContrasenia(),
				usuario.getEsAdmin()
			};
		return jdbcTemplate.update(query,inputs);
	}
	
	/*READ*/
	@SuppressWarnings("rawtypes")
	public List<Usuario> listarUsuario(){
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"SELECT usuarioID, nombres, apellidos, nacionalidad, sexo, usuario, contrasenia, esAdmin "
				+ "FROM usuario";
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        for (Map row : rows) {
            Usuario usuario = new Usuario();
            usuario.setUsuarioID(Integer.parseInt(String.valueOf(row.get("usuarioID"))));
            usuario.setNombres((String)row.get("nombres"));
            usuario.setApellidos((String)row.get("apellidos"));
            usuario.setNacionalidad((String)row.get("nacionalidad"));
            usuario.setSexo((String)row.get("sexo"));
            usuario.setNombreu((String)row.get("usuario"));
            usuario.setContrasenia((String)row.get("contrasenia"));
            usuario.setEsAdmin(Boolean.parseBoolean(String.valueOf(row.get("esAdmin"))));
            
            usuarios.add(usuario);
        }
        return usuarios;
	};
	
	/*UPDATE*/
	public int editarUsuario(Usuario usuario) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"UPDATE usuario SET UsuarioID=?, Nombres=?, Apellidos=?, Nacionalidad=?, Sexo=?, Nombreu=?, Contrasenia=?, EsAdmin=?"
				+ " WHERE usuarioID =? ";
		Object[] inputs = new Object[] 
			{
				usuario.getUsuarioID(),
				usuario.getNombres(),
				usuario.getApellidos(),
				usuario.getNacionalidad(),
				usuario.getSexo(),
				usuario.getNombreu(),
				usuario.getContrasenia(),
				usuario.getEsAdmin()
			};
		return jdbcTemplate.update(query,inputs);
	};
	
	/*DELETE*/
	public int eliminarUsuario(int id) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "UPDATE usuario WHERE IdUsuario = ?";
		Object[] inputs = new Object[] {id};
		return jdbcTemplate.update(query,inputs);
	}

		public int insertarUsuario(Usuario usuarioDao) {
		// TODO Auto-generated method stub
		return 0;
	};
}
