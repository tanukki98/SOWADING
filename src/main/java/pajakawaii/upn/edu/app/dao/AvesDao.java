package pajakawaii.upn.edu.app.dao;


import java.util.ArrayList;
import java.util.List;


import pajakawaii.upn.edu.app.model.Ave;

public interface AvesDao {
	public List<Ave> listarAves();
	public Ave busquedaAve(int avesID);
	public int insertarAve(Ave aveDao);
	public int editarAve(Ave ave);
	public int eliminarAve(int id);
}
