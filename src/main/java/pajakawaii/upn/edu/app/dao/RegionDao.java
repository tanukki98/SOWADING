
package pajakawaii.upn.edu.app.dao;

import java.util.ArrayList;
import java.util.List;

import pajakawaii.upn.edu.app.model.Region;


public interface RegionDao {
	public List<Region> listarRegiones();
	public Region busquedaRegion(int regionID);
	
	public int insertarRegion(Region regionDao);
	public int editarRegion(Region regionDao);
	public int eliminarRegion(int regionID);
}
