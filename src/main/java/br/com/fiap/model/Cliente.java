package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Endereco;
import br.com.fiap.model.Cliente;

public class Cliente
{

    private String nome;
    private Endereco endereco;
    private String cpf;
    private String senha;
    private int acessoArray;
    private String sobrenome;
    private Veiculo veiculo;



    public Cliente()
    {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAcessoArray() {
        return acessoArray;
    }

    public void setAcessoArray(int acessoArray) {
        this.acessoArray = acessoArray;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}