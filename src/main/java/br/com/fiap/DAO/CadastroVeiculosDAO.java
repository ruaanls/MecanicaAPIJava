package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Veiculo;

public class CadastroVeiculosDAO
{

    public void insere(Cliente c) throws Exception
    {

        String sql = "insert into T_VEICULO(PLACA, MARCA, MODELO, ANO, RENAVAM, T_CLIENTE_CPF) values(?,?,?,?,?,?)";
        try(Connection con = new Conexao().getConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {
            System.out.println("Placa: " + c.getVeiculo().getPlaca());
            System.out.println("Marca: " + c.getVeiculo().getMarca());
            System.out.println("Modelo: " + c.getVeiculo().getModelo());
            System.out.println("Ano: " + c.getVeiculo().getAno());
            System.out.println("Renavam: " + c.getVeiculo().getRenavam());
            System.out.println("CPF: " + c.getCpf());


            pstm.setString(1, c.getVeiculo().getPlaca());   // PLACA: VARCHAR2
            pstm.setString(2, c.getVeiculo().getMarca());   // MARCA: VARCHAR2
            pstm.setString(3, c.getVeiculo().getModelo());  // MODELO: VARCHAR2
            pstm.setInt(4, c.getVeiculo().getAno());        // ANO: NUMBER
            pstm.setString(5, c.getVeiculo().getRenavam()); // RENAVAM: VARCHAR2
            pstm.setString(6, c.getCpf());                  // T_CLIENTE_CPF: VARCHAR2

            pstm.executeUpdate();
        }
            catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}