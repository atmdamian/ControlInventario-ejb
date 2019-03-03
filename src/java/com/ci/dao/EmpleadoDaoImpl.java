/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.dao;

import com.ci.entity.Empleado;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DeveloperSr
 */
@Stateless
public class EmpleadoDaoImpl implements EmpleadoDao {

    @PersistenceContext(unitName = "ControlInventario-ejbPU")
    private EntityManager em;
    
    

    @Override
    public List<Empleado> findAllEmpleados() {
       return em.createNamedQuery("Empleado.findAll").getResultList();
    }

    @Override
    public void insertEmpleado(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
        empleado = em.getReference(Empleado.class, empleado.getIfe());
        em.remove(empleado);
        
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        em.merge(empleado);
    }
}
