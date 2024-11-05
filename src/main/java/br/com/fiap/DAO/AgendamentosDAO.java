package br.com.fiap.DAO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.model.Veiculo;

public class AgendamentosDAO
{
    public void insereAgendamento(Veiculo v) throws Exception
    {
        String sql = "insert into T_AGENDAMENTO(PROBLEMA_AG, DATA_AGENDAMENTO, HORA_AGENDAMENTO, T_VEICULO_PLACA, T_CENTRO_AUTOMOTIVO_ID_CA)"
                + "values(?,?,?,?,?)";
        try(Connection con = new Conexao().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            System.out.println("INICIOU BANCO");
            System.out.println("PROBLEMA: " + v.getAgendados().getTipoConserto());
            System.out.println("DATA: " + v.getAgendados().getData());
            System.out.println("HORA: " + v.getAgendados().getHorario());
            System.out.println("PLACA: " + v.getPlaca());
            System.out.println("ID CENTRO: " + v.getAgendados().getCentrosAutomotivos().getId());


            pstm.setString(1, v.getAgendados().getTipoConserto());
            pstm.setDate(2, Date.valueOf(v.getAgendados().getData()));
            pstm.setString(3,v.getAgendados().getHorario());
            pstm.setString(4, v.getPlaca());
            pstm.setLong(5, v.getAgendados().getCentrosAutomotivos().getId());
            pstm.executeUpdate();

        }

        catch(Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

}