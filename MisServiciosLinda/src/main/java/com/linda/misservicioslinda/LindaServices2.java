/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.misservicioslinda;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.linda.clases.lindaServicesRemote;
/**
 *
 * @author linda
 */
@WebService
public class LindaServices2 {
    @EJB 
	private lindaServicesRemote servicio;
	@WebMethod
	public String servicioLinda(){
		
		return servicio.servicioLinda();
	}
}
