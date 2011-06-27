package service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import modelo.Item;
import service.ListaPreciosService;
import dao.ListaPreciosDAO;
import dao.impl.ItemDAOImpl;
import dao.impl.ListaPreciosDAOImpl;

@SuppressWarnings("serial")
public class ListaPreciosServiceImpl extends UnicastRemoteObject implements
		ListaPreciosService {

	ListaPreciosDAO listaPreciosDAO = new ListaPreciosDAOImpl();
	
	public ListaPreciosServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item obtenerItemPorMejorPrecio(Integer nroSerie, List<String> marcas, String paisOrigen, String caracteristicas) throws RemoteException{
		/*-	Mejor precio, caracter�sticas del rodamiento, marca, pa�s de origen y lista del proveedor.*/
		ItemDAOImpl itemDAO = new ItemDAOImpl();
		return itemDAO.obtenerItemPorMejorPrecio(nroSerie, marcas, paisOrigen);
		
	}

}
