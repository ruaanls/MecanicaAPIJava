package br.com.fiap.business;

import br.com.fiap.DAO.AgendamentosDAO;
import br.com.fiap.DAO.CadastroVeiculosDAO;
import br.com.fiap.model.Agendamentos;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Veiculo;
import br.com.fiap.util.AgendamentoTO;
import br.com.fiap.util.VeiculoTO;

public class OficinaBusiness
{

    public void cadastraVeiculo(Cliente c ) throws Exception
    {
        CadastroVeiculosDAO cadVeiculo = new CadastroVeiculosDAO();
        cadVeiculo.insere(c);
    }

    public void agendarConserto(Veiculo v) throws Exception
    {
        AgendamentosDAO agendar = new AgendamentosDAO();
        agendar.insereAgendamento(v);

    }


}
