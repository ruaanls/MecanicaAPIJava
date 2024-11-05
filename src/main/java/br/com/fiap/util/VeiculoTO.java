package br.com.fiap.util;

import br.com.fiap.model.Agendamentos;
import br.com.fiap.model.CentrosAutomotivos;
import br.com.fiap.model.Veiculo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class VeiculoTO {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String renavam;
    private AgendamentoTO agendamento;  // Associação com AgendamentoTO

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public AgendamentoTO getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(AgendamentoTO agendamento) {
        this.agendamento = agendamento;
    }

    // Método de conversão para Veiculo
    public Veiculo toVeiculo() {
        Veiculo v = new Veiculo();  // Criar um objeto Veiculo
        v.setPlaca(this.placa);

        Agendamentos a = new Agendamentos();  // Criar um objeto Agendamentos
        a.setTipoConserto(this.agendamento.getTipoProblema());

        a.setData(LocalDate.parse(this.agendamento.getData()));
        // Define o horário do agendamento
        a.setHorario(this.agendamento.getHorario());

        // Associação com CentrosAutomotivos
        CentrosAutomotivos ca = new CentrosAutomotivos();

        System.out.println(this.agendamento.getCentroAutomotivo().getId());
        ca.setId(this.agendamento.getCentroAutomotivo().getId());
        a.setCentrosAutomotivos(ca);

        v.setAgendados(a);
        System.out.println(v.getAgendados().getCentrosAutomotivos().getId());// Associa o agendamento ao veículo

        return v;
    }



    private Agendamentos agendar;

    // Getters e Setters
    /*
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getRenavam() { return renavam; }
    public void setRenavam(String renavam) { this.renavam = renavam; }*/
}
