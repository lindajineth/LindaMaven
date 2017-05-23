/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.misservicioslinda;

import com.linda.clases.lindaServicesRemote;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author linda
 */
@WebService(serviceName = "LindaServices")
public class LindaServices {

    @EJB
    private lindaServicesRemote ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "servicioLinda")
        public String servicioLinda() {
        return ejbRef.servicioLinda();
    }
    
}
