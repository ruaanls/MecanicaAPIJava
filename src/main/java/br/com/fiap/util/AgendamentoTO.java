package br.com.fiap.util;

import br.com.fiap.model.CentrosAutomotivos;
import br.com.fiap.model.Veiculo;

public class AgendamentoTO
{
    private String tipoProblema;
    private String data;
    private String horario;
    private CentroAutomotivoTO centroAutomotivo;  // Associação com CentroAutomotivoTO

    // Getters e Setters
    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public CentroAutomotivoTO getCentroAutomotivo() {
        return centroAutomotivo;
    }

    public void setCentroAutomotivo(CentroAutomotivoTO centroAutomotivo) {
        this.centroAutomotivo = centroAutomotivo;
    }
}
