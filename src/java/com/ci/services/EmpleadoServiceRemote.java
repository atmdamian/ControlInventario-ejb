/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.services;

import com.ci.entity.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

/**
 *
 * @author DeveloperSr
 */

@Remote
public interface EmpleadoServiceRemote {

   
    public List<Empleado> listarEmpleados();

    
    public void registrarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
    
     public void modificarEmpleado(Empleado empleado);
}
