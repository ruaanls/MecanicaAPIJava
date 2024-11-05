package br.com.fiap.util;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Endereco;
import br.com.fiap.model.Veiculo;

public class ClienteTO {
    private String cpf;
    private VeiculoTO veiculo; // Associa diretamente um objeto VeiculoTO

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public VeiculoTO getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoTO veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente toCliente() {
        Cliente c = new Cliente();
        Veiculo v = new Veiculo();

        v.setPlaca(veiculo.getPlaca());
        v.setMarca(veiculo.getMarca());
        v.setModelo(veiculo.getModelo());
        v.setAno(veiculo.getAno());
        v.setRenavam(veiculo.getRenavam());

        c.setVeiculo(v); // Associa o veículo ao cliente
        c.setCpf(cpf);

        return c;
    }
}

