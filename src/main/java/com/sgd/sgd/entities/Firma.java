package com.sgd.sgd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDateTime;

@Entity
@Table(name = "firmas")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuarioFirmante;
    private String cargoFirmante;
    private LocalDateTime fechaFirma;
    private String hashDigital;
    private String tipoFirma;

    @ManyToOne
    @JoinColumn(name = "documento_id")
    private Documento documento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuarioFirmante() {
        return usuarioFirmante;
    }

    public void setUsuarioFirmante(String usuarioFirmante) {
        this.usuarioFirmante = usuarioFirmante;
    }

    public String getCargoFirmante() {
        return cargoFirmante;
    }

    public void setCargoFirmante(String cargoFirmante) {
        this.cargoFirmante = cargoFirmante;
    }

    public LocalDateTime getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(LocalDateTime fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public String getHashDigital() {
        return hashDigital;
    }

    public void setHashDigital(String hashDigital) {
        this.hashDigital = hashDigital;
    }

    public String getTipoFirma() {
        return tipoFirma;
    }

    public void setTipoFirma(String tipoFirma) {
        this.tipoFirma = tipoFirma;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

}