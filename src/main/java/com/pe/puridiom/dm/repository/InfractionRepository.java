package com.pe.puridiom.dm.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.pe.puridiom.dm.entity.Infraction;

public interface InfractionRepository extends PagingAndSortingRepository<Infraction, BigDecimal> {
	
	@Query("from Infraction")	
	public List<Infraction> getInfractions();
}
