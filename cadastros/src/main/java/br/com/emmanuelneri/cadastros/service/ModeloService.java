package br.com.emmanuelneri.cadastros.service;

import br.com.emmanuelneri.cadastros.model.Modelo;
import br.com.emmanuelneri.integrador.anotations.RelatoriosClientWS;
import br.com.emmanuelneri.integrador.anotations.VendasClientWS;
import br.com.emmanuelneri.integrador.service.GenericService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Named
public class ModeloService extends GenericService<Modelo, Long> {

    @Inject
    @VendasClientWS
    private WebTarget clientVendasWS;

    @Inject
    @RelatoriosClientWS
    private WebTarget clienteRelatorioWS;

    @Override
    protected void atualizarModulo(Modelo modelo) {
        enviarModulo(clientVendasWS, modelo);
        enviarModulo(clienteRelatorioWS, modelo);
    }

    private void enviarModulo(WebTarget client, Modelo modelo) {
        client.path("/cadastros/modelos/atualizar").queryParam("modelo", modelo)
                .request().put(Entity.entity(modelo, MediaType.APPLICATION_JSON));
    }

}
