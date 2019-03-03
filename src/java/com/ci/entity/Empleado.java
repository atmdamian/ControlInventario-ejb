/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ci.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DeveloperSr
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByIfe", query = "SELECT e FROM Empleado e WHERE e.ife = :ife")
    , @NamedQuery(name = "Empleado.findByNombrePila", query = "SELECT e FROM Empleado e WHERE e.nombrePila = :nombrePila")
    , @NamedQuery(name = "Empleado.findByApellidoPat", query = "SELECT e FROM Empleado e WHERE e.apellidoPat = :apellidoPat")
    , @NamedQuery(name = "Empleado.findByApellidoMat", query = "SELECT e FROM Empleado e WHERE e.apellidoMat = :apellidoMat")
    , @NamedQuery(name = "Empleado.findByPuesto", query = "SELECT e FROM Empleado e WHERE e.puesto = :puesto")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ife")
    private Integer ife;
    @Size(max = 45)
    @Column(name = "nombre_pila")
    private String nombrePila;
    @Size(max = 45)
    @Column(name = "apellido_pat")
    private String apellidoPat;
    @Size(max = 45)
    @Column(name = "apellido_mat")
    private String apellidoMat;
    @Size(max = 45)
    @Column(name = "puesto")
    private String puesto;

    public Empleado() {
    }

    public Empleado(Integer ife) {
        this.ife = ife;
    }

    public Integer getIfe() {
        return ife;
    }

    public void setIfe(Integer ife) {
        this.ife = ife;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ife != null ? ife.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.ife == null && other.ife != null) || (this.ife != null && !this.ife.equals(other.ife))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ci.entity.Empleado[ ife=" + ife + " ]";
    }
    
}
