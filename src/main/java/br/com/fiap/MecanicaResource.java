package br.com.fiap;

import br.com.fiap.DAO.CentrosAutomotivosDAO;
import br.com.fiap.business.OficinaBusiness;
import br.com.fiap.model.CentrosAutomotivos;
import br.com.fiap.model.Cliente;
import br.com.fiap.util.AgendamentoTO;
import br.com.fiap.util.ClienteTO;
import br.com.fiap.util.VeiculoTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("apiJava")
public class MecanicaResource
{
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("cadastroVeiculo")
    public Response cadastroVeiculo(ClienteTO c) {
        OficinaBusiness negocio = new OficinaBusiness();
        try {
            negocio.cadastraVeiculo(c.toCliente());

            return Response.status(201).entity(c).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(406).entity(e.getMessage()).build();
        }
    }

    @POST
    @Consumes (MediaType.APPLICATION_JSON)
    @Path("agendamento")
    public Response agendamento(VeiculoTO v)
    {
        System.out.println(v.getAgendamento().getCentroAutomotivo().getId());
        OficinaBusiness negocio = new OficinaBusiness();
        try {
            negocio.agendarConserto(v.toVeiculo());

            return Response.status(201).entity(v).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(406).entity(e.getMessage()).build();
        }
    }


    @GET
    @Consumes (MediaType.APPLICATION_JSON)
    @Path("recuperaCA")
    public Response recuperaCA()
    {
        /*OficinaBusiness negocio = new OficinaBusiness();*/
        CentrosAutomotivosDAO c = new CentrosAutomotivosDAO();
        try {
            /*negocio.listaCentros();*/
            List<CentrosAutomotivos> centros = c.recuperaCA();
            return Response.status(201).entity(centros).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(406).entity(e.getMessage()).build();
        }
    }




}


