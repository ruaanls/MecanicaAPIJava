package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

public class Cadastro
{
    private List<Cliente> clientesRegistrados = new ArrayList<Cliente>();
    private int acessoArray;


    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }
    public void setClientesRegistrados(List<Cliente> clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }
    public int getAcessoArray() {
        return acessoArray;
    }
    public void setAcessoArray(int acessoArray) {
        this.acessoArray = acessoArray;
    }



}

