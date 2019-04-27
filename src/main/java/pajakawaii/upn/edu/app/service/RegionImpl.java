
package pajakawaii.upn.edu.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import pajakawaii.upn.edu.app.dao.RegionDao;
import pajakawaii.upn.edu.app.model.Region;


public class RegionImpl implements RegionDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@SuppressWarnings("rawtypes")
	public List<Region> listarRegiones(){
	jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"SELECT * FROM region";
		
		List<Region> regiones = new ArrayList<Region>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        for (Map row : rows) {
            Region region = new Region();
            
            region.setRegionID(Integer.parseInt(String.valueOf(row.get("regionID"))));    
            region.setNombre_region((String)row.get("nombre_region"));
            region.setCoordenadas((String)row.get("coordenadas"));
  
            regiones.add(region);
        }
        
        
        return regiones;
	};
	
	
	@SuppressWarnings("rawtypes")
	public Region busquedaRegion(int regionID) {
		System.out.println("Entra al servicio");
		String sql = "SELECT * FROM region WHERE regionID = ?";
		 
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        
        @SuppressWarnings("unchecked")
		Region region = (Region) jdbcTemplate.queryForObject(
                sql, new Object[] { regionID }, 
                new BeanPropertyRowMapper(Region.class)
                );

        return region;
		
	}
	
	
	/*CREATE*/
	public int insertarRegion(Region region) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"INSERT INTO region(RegionID, nombre_region, Coordenadas)"
				+ "VALUES (?,?,?)";
		Object[] inputs = new Object[] 
			{
				region.getRegionID(),
				region.getNombre_region(),
				region.getCoordenadas()
				};
		return jdbcTemplate.update(query,inputs);
	}
	
	/*UPDATE*/
	public int editarRegion(Region region) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = 
				"UPDATE region SET RegionID=?, Nombre_region=?, Coordenadas=?"
				+ " WHERE regionID =? ";
		Object[] inputs = new Object[] 
			{
				region.getRegionID(),
				region.getNombre_region(),
				region.getCoordenadas(),
				};
		return jdbcTemplate.update(query,inputs);
	};
	
	/*DELETE*/
	public int eliminarRegion(int regionID) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "UPDATE region WHERE regionID = ?";
		Object[] inputs = new Object[] {regionID};
		return jdbcTemplate.update(query,inputs);
	}
	
}


