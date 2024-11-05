package br.com.fiap.aplicacao;

import br.com.fiap.business.OficinaBusiness;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Veiculo;

public class Aplicacao
{
    public static void main(String[] args) {


        Cliente c = new Cliente();

        c.setCpf("123.456.789-10");
        c.setNome("Teste");

        Veiculo v = new Veiculo();
        v.setPlaca("ZTP5F71");
        v.setModelo("Civic");
        v.setMarca("Toyota");
        v.setAno(2015);
        v.setRenavam("12345678918");
        c.setVeiculo(v);

        System.out.println(c.getVeiculo().getPlaca());



        OficinaBusiness bm = new OficinaBusiness();
        try {
            bm.cadastraVeiculo(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
