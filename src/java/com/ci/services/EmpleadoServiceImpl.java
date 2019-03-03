/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.services;

import com.ci.dao.EmpleadoDao;
import com.ci.entity.Empleado;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author DeveloperSr
 */
@Stateless
public class EmpleadoServiceImpl implements EmpleadoService, EmpleadoServiceRemote {
    
    @Resource
    private SessionContext contexto;

    @EJB
    private EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoDao.findAllEmpleados();
    }

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleadoDao.insertEmpleado(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoDao.deleteEmpleado(empleado);
    }

    @Override
    public void modificarEmpleado(Empleado empleado) {
        try {
            empleadoDao.updateEmpleado(empleado);
        } catch (Throwable t) {
            contexto.setRollbackOnly();
        }
    }

}
