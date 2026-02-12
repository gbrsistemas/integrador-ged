package br.com.gbrsistemas.main.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DemandaExternaDto {

    private Integer numeroDemanda;
    private Integer anoDemanda;
    private String ufDemanda;
    private Integer idSituacao;

    public Integer getNumeroDemanda() {
        return numeroDemanda;
    }

    public void setNumeroDemanda(Integer numeroDemanda) {
        this.numeroDemanda = numeroDemanda;
    }

    public Integer getAnoDemanda() {
        return anoDemanda;
    }

    public void setAnoDemanda(Integer anoDemanda) {
        this.anoDemanda = anoDemanda;
    }

    public String getUfDemanda() {
        return ufDemanda;
    }

    public void setUfDemanda(String ufDemanda) {
        this.ufDemanda = ufDemanda;
    }

    public Integer getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        this.idSituacao = idSituacao;
    }
}
