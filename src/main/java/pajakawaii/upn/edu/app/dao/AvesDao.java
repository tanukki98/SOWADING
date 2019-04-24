package pajakawaii.upn.edu.app.dao;


import java.util.ArrayList;
import java.util.List;

import pajakawaii.upn.edu.app.model.Ave;

public interface AvesDao {
	public List<Ave> listarAves();
	public Ave busquedaAve(int avesID);
	
}
