package br.com.fiap.util;

import br.com.fiap.model.CentrosAutomotivos;
import br.com.fiap.model.Endereco;

public class CentroAutomotivoTO
{
    private long id;

    private EnderecoTO endereco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnderecoTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoTO endereco) {
        this.endereco = endereco;
    }

    public CentrosAutomotivos toCentro()
    {
        CentrosAutomotivos c = new CentrosAutomotivos();
        c.setId(this.id);

        Endereco e = new Endereco();
        e.setLogradouro(this.endereco.getLogradouro());
        e.setCidade(this.endereco.getCidade());
        e.setBairro(this.endereco.getBairro());
        e.setNumero(this.endereco.getNumero());
        e.setUf(this.endereco.getUf());
        e.setCep(this.endereco.getCep());
        c.setEndereco(e);
        return c;
    }

}