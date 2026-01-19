package com.sgd.sgd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "documentos")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroDocumento;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private TipoDocumento tipo;

    private boolean requiereFirma;
    private boolean requiereVisacion;
    private String rutaAdjuntoPdf;
    private LocalDateTime fechaCarga;

    @ManyToOne
    @JoinColumn(name = "expediente_id")
    private Expediente expediente;

    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<Firma> firmas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public boolean isRequiereFirma() {
        return requiereFirma;
    }

    public void setRequiereFirma(boolean requiereFirma) {
        this.requiereFirma = requiereFirma;
    }

    public boolean isRequiereVisacion() {
        return requiereVisacion;
    }

    public void setRequiereVisacion(boolean requiereVisacion) {
        this.requiereVisacion = requiereVisacion;
    }

    public String getRutaAdjuntoPdf() {
        return rutaAdjuntoPdf;
    }

    public void setRutaAdjuntoPdf(String rutaAdjuntoPdf) {
        this.rutaAdjuntoPdf = rutaAdjuntoPdf;
    }

    public LocalDateTime getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDateTime fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public List<Firma> getFirmas() {
        return firmas;
    }

    public void setFirmas(List<Firma> firmas) {
        this.firmas = firmas;
    }

}