package dao.impl;

import generico.dao.impl.GenericDAOImpl;

import java.util.List;

import modelo.ListaPrecios;

import org.hibernate.Query;
import org.hibernate.Session;

import util.hibernate.HibernateUtil;

public class ListaPreciosDAOImpl extends GenericDAOImpl<ListaPrecios> {

	public List<Object> obtenerItemsPorCriterios(Integer nroSerie, String marca, String paisOrigen){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "from ListaPrecios lp join lp.items i where i.rodamiento.nroSerie = :nroSerie and i.rodamiento.marca = :marca and " +
				"i.rodamiento.paisOrigen = :paisOrigen";
		Query query = session.createQuery(hql);
		/*Seguro no and..aprend� HQL ladri...*/
		
		return query.list();
	}
}
