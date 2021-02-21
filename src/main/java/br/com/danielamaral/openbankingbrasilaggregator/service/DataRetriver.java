package br.com.danielamaral.openbankingbrasilaggregator.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.danielamaral.openbankingbrasilaggregator.model.OpenBankingApi;
import br.com.danielamaral.openbankingbrasilaggregator.model.org.ApiResource;
import br.com.danielamaral.openbankingbrasilaggregator.model.org.AuthorisationServer;
import br.com.danielamaral.openbankingbrasilaggregator.model.org.Organization;
import br.com.danielamaral.openbankingbrasilaggregator.model.personal.creditcards.Company;
import br.com.danielamaral.openbankingbrasilaggregator.model.personal.creditcards.PersonalCreditCard;
import br.com.danielamaral.openbankingbrasilaggregator.model.personal.creditcards.ProductPersonalCreditCards;

@Service
public class DataRetriver {
	private static final Logger log = LoggerFactory.getLogger(DataRetriver.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public List<String> listCreditcardsWithRewardProgram() {

		List<String> listCreditcardsWithReward = new ArrayList<>();
		List<OpenBankingApi> list = getEndpointsFromBanks();

		for (OpenBankingApi openBankingApi : list) {

			try {
				if (openBankingApi.getApi().equals("products-services")) {
					listCreditcardsWithReward.addAll(getCreditcardsWithReward(openBankingApi.getUrl()));
				}
			} catch (Exception ex) {
				log.error(ex.getLocalizedMessage());
			}
		}

		return listCreditcardsWithReward;
	}

	public List<String> getCreditcardsWithReward(String bankPersonalCreditCardsEndpoint) {
		RestTemplate restTemplate = new RestTemplate();
		List<String> creditCardsWithReward = new ArrayList<>();
		String resourceUrl = bankPersonalCreditCardsEndpoint + "/personal-credit-cards";
		ProductPersonalCreditCards data = restTemplate.getForObject(resourceUrl, ProductPersonalCreditCards.class);

		for (Company company : data.getData().getBrand().getCompanies()) {
			for (PersonalCreditCard creditCard : company.getPersonalCreditCards()) {
				if (creditCard.getRewardsProgram().isHasRewardProgram()) {
					creditCardsWithReward
							.add(company.getName() + " , " + creditCard.getName() + " , " + creditCard.getRewardsProgram().getRewardProgramInfo());
				}
			}
		}

		return creditCardsWithReward;
	}

	public List<OpenBankingApi> getEndpointsFromBanks() {
		List<OpenBankingApi> list = new ArrayList<OpenBankingApi>();

		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://data.directory.openbankingbrasil.org.br/participants";
		Organization[] data = restTemplate.getForObject(fooResourceUrl, Organization[].class);

		for (Organization o : data) {
			for (AuthorisationServer as : o.getAuthorisationServers()) {
				for (ApiResource resource : as.getApiResources()) {

					if (!resource.getApiDiscoveryEndpoints().isEmpty()) {

						OpenBankingApi api = new OpenBankingApi();
						api.setApi(resource.getApiFamilyType());
						api.setBank(as.getCustomerFriendlyName());
						api.setUrl(resource.getApiDiscoveryEndpoints().get(0).getApiEndpoint());

						list.add(api);

					}
				}
			}
		}

		return list;

	}

}
