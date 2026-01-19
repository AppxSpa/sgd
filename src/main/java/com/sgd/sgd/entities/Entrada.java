package com.sgd.sgd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "entradas")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroFolio; // Número único de ingreso
    private LocalDateTime fechaIngreso;
    private String remitenteNombre; // Quien trae el documento (persona/empresa externa)
    private String remitenteInstitucion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "expediente_id")
    private Expediente expediente; // Una entrada genera un expediente

    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL)
    private List<Derivacion> derivacionesIniciales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroFolio() {
        return numeroFolio;
    }

    public void setNumeroFolio(String numeroFolio) {
        this.numeroFolio = numeroFolio;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRemitenteNombre() {
        return remitenteNombre;
    }

    public void setRemitenteNombre(String remitenteNombre) {
        this.remitenteNombre = remitenteNombre;
    }

    public String getRemitenteInstitucion() {
        return remitenteInstitucion;
    }

    public void setRemitenteInstitucion(String remitenteInstitucion) {
        this.remitenteInstitucion = remitenteInstitucion;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public List<Derivacion> getDerivacionesIniciales() {
        return derivacionesIniciales;
    }

    public void setDerivacionesIniciales(List<Derivacion> derivacionesIniciales) {
        this.derivacionesIniciales = derivacionesIniciales;
    }

}