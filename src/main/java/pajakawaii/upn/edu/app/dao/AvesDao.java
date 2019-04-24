package pajakawaii.upn.edu.app.dao;


import java.util.List;

import pajakawaii.upn.edu.app.model.Ave;

public interface AvesDao {
	public Ave busquedaAve(int avesID);
	public List<Ave> listarAves();
}
