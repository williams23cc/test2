package com.pe.puridiom.da.servicedata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pe.puridiom.dm.entity.Infraction;
import com.pe.puridiom.dm.repository.InfractionRepository;

public class InfractionServiceDataImpl implements InfractionServiceData{

	@Autowired
	private InfractionRepository infractionRepository;
	
	@Override
	public List<Infraction> getInfractions() {
		return infractionRepository.getInfractions();
	}

}