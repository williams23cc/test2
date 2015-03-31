package com.pe.puridiom.dm.repository;

import java.math.BigDecimal;
import java.util.List;

import com.pe.puridiom.dm.entity.Permission;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PermissionRepository extends PagingAndSortingRepository<Permission, BigDecimal>{
	
	@Query("from Permission")
	public List<Permission> getPermission(String placa);
}
