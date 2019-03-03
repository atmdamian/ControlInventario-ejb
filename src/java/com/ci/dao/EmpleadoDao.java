/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.dao;

import com.ci.entity.Empleado;
import java.util.List;

/**
 *
 * @author DeveloperSr
 */
public interface EmpleadoDao {
    public List<Empleado> findAllEmpleados();
    public void insertEmpleado(Empleado empleado);
    public void deleteEmpleado(Empleado empleado);
    public void updateEmpleado(Empleado empleado);
}
