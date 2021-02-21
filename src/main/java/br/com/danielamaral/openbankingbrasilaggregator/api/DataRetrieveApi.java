package br.com.danielamaral.openbankingbrasilaggregator.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielamaral.openbankingbrasilaggregator.model.OpenBankingApi;
import br.com.danielamaral.openbankingbrasilaggregator.service.DataRetriver;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/data-retriever")
public class DataRetrieveApi {

	@Autowired
	private DataRetriver dataRetriver;


	@ApiOperation(value = "listar apis dos bancos")
	@GetMapping(value = "/banks/enpoints", produces = "application/json")
	public List<OpenBankingApi> getEndpointsFromBanks() {
		return dataRetriver.getEndpointsFromBanks();

	}
	

	@ApiOperation(value = "listar cartões de créditos com programa de recompensas")
	@GetMapping(value = "/banks/credit-cards/reward", produces = "application/json")
	public List<String> pesquisarDadosDisponiveis() {
		return dataRetriver.listCreditcardsWithRewardProgram();

	}

}
