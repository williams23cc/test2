package com.pe.puridiom.sc.router;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pe.puridiom.dm.entity.Infraction;
import com.pe.puridiom.dm.entity.Permission;
import com.pe.puridiom.dm.entity.Placa;
import com.pe.puridiom.dm.entity.TrafficTicket;
import com.pe.puridiom.dm.entity.Vehicle;
import com.pe.puridiom.dm.dtos.QueryDAO;
/**
 * @author PuridiomPe
 * @version 1.0
 * 
 *
 */

@Controller
@RequestMapping("/consult")  
public class QueryController {
	
	@Autowired
	private QueryDAO queryDAO;
	
	@RequestMapping(value="infraccion",method = RequestMethod.GET)
	public  @ResponseBody List<Infraction> getAllInfractions(){
		return queryDAO.getAllInfractions();
	}
	
	@RequestMapping(value="existe",method = RequestMethod.POST)
	public  @ResponseBody boolean checkExistsPlate(@RequestBody Placa placa){
		return queryDAO.checkExistsPlate(placa.getPlaca());
	}
	
	@RequestMapping(value="dato", method = RequestMethod.POST)
	 public @ResponseBody List<Vehicle>  getdato( @RequestBody Placa placa) {   
		return queryDAO.getDato(placa.getPlaca());
	 }
	
	@RequestMapping(value="permiso", method = RequestMethod.POST)
	 public @ResponseBody List<Permission>  getPermission( @RequestBody Placa placa) {   
		return queryDAO.getPermission(placa.getPlaca());
	 }
	
	@RequestMapping(value="papeleta", method = RequestMethod.POST)
	 public @ResponseBody List<TrafficTicket>  getTrafficTicket( @RequestBody Placa placa) {   
		return queryDAO.getTrafficTicket(placa.getPlaca());
	 }
	
}
