package com.sgd.sgd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "derivaciones")
public class Derivacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "expediente_id")
    private Expediente expediente;

    @ManyToOne
    @JoinColumn(name = "entrada_id")
    private Entrada entrada; // Relación con el ingreso original

    // Origen y Destino (IDs de API externa)
    private Long idDepartamentoOrigen;
    private String enviadoPor;
    private LocalDateTime fechaEnvio;

    private Long idDepartamentoDestino;
    private String tipoCopia; // ORIGINAL, COPIA

    // Recepción
    private LocalDateTime fechaRecepcion;
    private String recibidoPor;

    @Column(length = 1000)
    private String observaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Long getIdDepartamentoOrigen() {
        return idDepartamentoOrigen;
    }

    public void setIdDepartamentoOrigen(Long idDepartamentoOrigen) {
        this.idDepartamentoOrigen = idDepartamentoOrigen;
    }

    public String getEnviadoPor() {
        return enviadoPor;
    }

    public void setEnviadoPor(String enviadoPor) {
        this.enviadoPor = enviadoPor;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Long getIdDepartamentoDestino() {
        return idDepartamentoDestino;
    }

    public void setIdDepartamentoDestino(Long idDepartamentoDestino) {
        this.idDepartamentoDestino = idDepartamentoDestino;
    }

    public String getTipoCopia() {
        return tipoCopia;
    }

    public void setTipoCopia(String tipoCopia) {
        this.tipoCopia = tipoCopia;
    }

    public LocalDateTime getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDateTime fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}