/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.services;

import com.ci.entity.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DeveloperSr
 */
@Local
public interface EmpleadoService {
    public List<Empleado> listarEmpleados();
    public void registrarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
    public void modificarEmpleado(Empleado empleado);
}
