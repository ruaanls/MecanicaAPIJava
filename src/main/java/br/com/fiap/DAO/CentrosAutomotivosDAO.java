package br.com.fiap.DAO;

import br.com.fiap.model.CentrosAutomotivos;
import br.com.fiap.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CentrosAutomotivosDAO
{
    public List<CentrosAutomotivos> recuperaCA () throws Exception
    {
        String sql = "select * from t_centro_automotivo";
        List<CentrosAutomotivos> lista = new ArrayList<>();
        try(Connection con = new Conexao().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                CentrosAutomotivos c = new CentrosAutomotivos();
                Endereco e = new Endereco();
                System.out.println("BANCO COMEÇOU!!!");
                System.out.println(rs.getString("LOGRADOURO_CA"));
                c.setId(rs.getLong("ID_CA"));
                e.setLogradouro(rs.getString("LOGRADOURO_CA"));
                e.setNumero(rs.getInt("NUMERO_CA"));
                e.setBairro(rs.getString("BAIRRO_CA"));
                e.setCidade(rs.getString("CIDADE_CA"));
                e.setUf(rs.getString("UF_CA"));
                e.setCep(rs.getString("CEP_CA"));
                c.setEndereco(e);
                /*
                c.getEndereco().setLogradouro(rs.getString("LOGRADOURO_CA"));
                c.getEndereco().setNumero(rs.getInt("NUMERO_CA"));
                c.getEndereco().setBairro(rs.getString("BAIRRO_CA"));
                c.getEndereco().setCidade(rs.getString("CIDADE_CA"));
                c.getEndereco().setUf(rs.getString("UF_CA"));
                c.getEndereco().setCep(rs.getString("CEP_CA"));*/
                lista.add(c);

            }


        }

        catch(Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        return lista;

    }
}
