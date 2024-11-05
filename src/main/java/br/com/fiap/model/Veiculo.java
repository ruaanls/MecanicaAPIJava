package br.com.fiap.model;

public class Veiculo
{
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String renavam;
    private String nomeCarro;
    private long id;
    private Agendamentos agendados;


    public Veiculo() {
        super();

    }

    @Override
    public String toString() {
        return "Veiculo:  "+ nomeCarro + " Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Renavam " + renavam + "\n";

    }

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

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Agendamentos getAgendados() {
        return agendados;
    }

    public void setAgendados(Agendamentos agendados) {
        this.agendados = agendados;
    }
}