package pajakawaii.upn.edu.app.service;

import pajakawaii.upn.edu.app.dao.AvesDao;
import pajakawaii.upn.edu.app.model.Ave;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.PreparedStatement;









public class AveImpl implements AvesDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	//CREACION DE AVE
	public int insertarAve(Ave ave) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"INSERT INTO aves (avesID,nombre_comun,nombre_cientifico,peso,tamanio) VALUES (?,?,?,?,?)";
		Object[] inputs = new Object[] 
			{
				ave.getAvesID(),				
				ave.getNombre_comun(),
				ave.getNombre_cientifico(),
				ave.getPeso(),
				ave.getTamanio()
									
			};
		return jdbcTemplate.update(query,inputs);
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public List<Ave> listarAves(){
	jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"SELECT avesID,nombre_comun,nombre_cientifico,peso,tamanio FROM aves WHERE ESTADO=1";
		
		List<Ave> aves = new ArrayList<Ave>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        for (Map row : rows) {
            Ave ave = new Ave();
            
            ave.setAvesID(Integer.parseInt(String.valueOf(row.get("avesID")))); 
            ave.setNombre_comun((String)row.get("nombre_comun"));
            ave.setNombre_cientifico((String)row.get("nombre_cientifico"));
            ave.setPeso(Float.parseFloat(String.valueOf(row.get("peso"))));
            ave.setTamanio(Float.parseFloat(String.valueOf(row.get("tamanio")))); 
          
            
            aves.add(ave);
        }
        
        
        return aves;
	};
	
	
	@SuppressWarnings("rawtypes")
	public Ave busquedaAve(int avesID) {
		System.out.println("Entra al servicio");
		String sql = "SELECT avesID,nombre_comun,nombre_cientifico,peso,tamanio FROM aves WHERE avesID = ?";
		 
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        
        @SuppressWarnings("unchecked")
		Ave ave = (Ave) jdbcTemplate.queryForObject(
                sql, new Object[] { avesID }, 
                new BeanPropertyRowMapper(Ave.class)
                );

        return ave;
		
		
	}
	
	//EDITAR
	public int editarAve(Ave ave) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"UPDATE aves SET nombre_cientifico=?, nombre_comun=?, peso=?, tamanio=? "
				+ " WHERE avesID =? ";
		Object[] inputs = new Object[] 
			{
					
				ave.getNombre_cientifico(),
				ave.getNombre_comun(),
				ave.getPeso(),
				ave.getTamanio(),
				ave.getAvesID()
			};
		
		return jdbcTemplate.update(query,inputs);
	};
	
	//ELIMINAR
	public int eliminarAve(int id) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "UPDATE aves SET ESTADO = 0 WHERE avesID = ?";
		Object[] inputs = new Object[] {id};
		return jdbcTemplate.update(query,inputs);
	};
}
