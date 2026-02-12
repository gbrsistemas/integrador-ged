package br.com.gbrsistemas.main.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DemandaExternaDto {

    private Integer idDemanda;
    private Integer idSituacao;

    public Integer getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Integer idDemanda) {
        this.idDemanda = idDemanda;
    }

    public Integer getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        this.idSituacao = idSituacao;
    }
}
