package br.com.gbrsistemas.main.service.cfm;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.gbrsistemas.main.dto.DemandaExternaDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.gbrsistemas.main.controller.CfmController;
import br.com.gbrsistemas.main.dto.IntegradorGedDTO;
import br.com.gbrsistemas.main.dto.VistoriaEfetuadaDTO;
import br.com.gbrsistemas.main.util.AccessTokenInvalidoException;
import br.com.gbrsistemas.main.util.Constants;

@Path("/importar")
@Consumes(Constants.JSON_UTF8)
@Produces(Constants.JSON_UTF8)
public class CfmService {
	
	@Inject
	private CfmController cfmController;

	@POST
    @Path("/vistoria-realizada")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response vistoriaRealizada(VistoriaEfetuadaDTO vistoriaEfetuadaRequest) throws Exception {
    	return Response.ok(this.cfmController.listarVistoria(vistoriaEfetuadaRequest)).build(); 
    }
	
	@POST
	@Path("/integrar-ged/{idDemanda}")
	public Response integrarGed(
			@PathParam("idDemanda") Integer idDemanda, 
			IntegradorGedDTO integradorGedDTO
			) throws Exception {		
		
		this.cfmController.integrarIrregularidades(idDemanda, integradorGedDTO.getIdProcesso());
		this.cfmController.integrarAnexos(idDemanda, integradorGedDTO);
		
	    return Response.ok().build();
	}

    @PUT
    @Path("/atualizar-demanda")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response atualizarDemanda(DemandaExternaDto dto) throws Exception {
        this.cfmController.atualizarDemanda(dto);
        return Response.ok().build();
    }
	
}
