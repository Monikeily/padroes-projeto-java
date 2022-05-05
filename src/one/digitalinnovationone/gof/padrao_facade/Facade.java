package one.digitalinnovationone.gof.padrao_facade;

import subsistema1.crm.CamadaServico;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
				
		CamadaServico.gravarCliente(nome, cep, cidade, estado);
		
	}

}
