/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.clases;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.ejb.Stateless;
/**
 *
 * @author linda
 */
@Stateless
public class lindaServices implements lindaServicesRemote {
    private String servicio ;
    public lindaServices() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String servicioLinda (){
    	DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date hora = new Date();	 	   	
		
    	servicio = "Hola Mundo son las: "+dateformat.format(hora);	
		
		return servicio;	
    }    
}
