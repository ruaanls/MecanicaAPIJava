package br.com.fiap.model;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class CentrosAutomotivos
{
    private String nome;
    private Endereco endereco;
    private List<LocalTime> horariosDisponiveis;
    private List<LocalDate> datas;
    private long id;
    private int cod;




    public CentrosAutomotivos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<LocalTime> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(List<LocalTime> horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public List<LocalDate> getDatas() {
        return datas;
    }

    public void setDatas(List<LocalDate> datas) {
        this.datas = datas;
    }

    public long getId() {

        return this.id;
    }

    public void setId(long id) {
        this.id = id;

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
