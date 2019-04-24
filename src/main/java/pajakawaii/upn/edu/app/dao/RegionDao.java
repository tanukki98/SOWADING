package pajakawaii.upn.edu.app.dao;

import java.util.List;

import pajakawaii.upn.edu.app.model.Region;



public interface RegionDao {
	public List<Region> listarRegiones();
	public Region busquedaRegion(int regionID);
}
