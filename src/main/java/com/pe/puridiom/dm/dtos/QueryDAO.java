package com.pe.puridiom.dm.dtos;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pe.puridiom.dm.entity.*;

/**
 * @author PuridiomPe
 * @version 1.0
 * 
 *
 */
@Repository
@Transactional
public class QueryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Infraction> getAllInfractions(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Infraction");
		List<Infraction> list = query.list();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public boolean checkExistsPlate(String placa){	
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Vehicle where placa = :pla");
	    query.setParameter("pla", placa);
		List<Vehicle> list = query.list();
		return (list.size()>0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Vehicle> getDato(String placa){	
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Vehicle where placa = :pla");
	    query.setParameter("pla", placa);
		List<Vehicle> list = query.list();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Permission> getPermission(String placa){	
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Vehicle where placa = :pla");
	    query.setParameter("pla", placa);
		List<Vehicle> list = query.list();
		
		List<Permission> list2 = new ArrayList<Permission>();
		if(list.size()==0) return list2;
		
		int id = list.get(0).getIdvehiculo();
		query = session.createQuery("from Permission where idvehiculo = :id");
	    query.setParameter("id", id);
		list2 = query.list();
		
		return list2;
	}
	
	@SuppressWarnings("unchecked")
	public List<TrafficTicket> getTrafficTicket(String placa) {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Vehicle where placa = :pla");
	    query.setParameter("pla", placa);
		List<Vehicle> list = query.list();
		
		List<TrafficTicket> list2 = new ArrayList<TrafficTicket>();
		if(list.size()==0) return list2;
		
		int id = list.get(0).getIdvehiculo();
		query = session.createQuery("from TrafficTicket where idvehiculo = :id");
	    query.setParameter("id", id);
		list2 = query.list();
		
		return list2;
	}
}
