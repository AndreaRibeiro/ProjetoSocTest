package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageCommons.Manager;
import pageCommons.RepositoryTest;
import pageNavigation.BuscaBlog;

public class BuscaBlogSteps extends Manager {
	
	public BuscaBlog busca;
	
	public BuscaBlogSteps () {
		busca = new BuscaBlog(driver);
	}
	
	@Dado("que estou na pagina BUSCA BLOG")
	public void que_estou_na_pagina_BUSCA_BLOG() throws Throwable {
		iniciaDriver();  
	}
	
	@Dado("preencho o campo de busca")
	public void preencho_o_campo_de_busca( ) {
		 driver.findElement(RepositoryTest.ID_COOKIE).click();
	    preencherBusca();
	   
	}

	@Quando("clico em pesquisar")
	public void clico_em_pesquisar() {
	    
	   clicarPesquisar();
	}

	@Entao("valido a busca no RESULTADO DA SUA BUSCA NO BLOG")
	public void valido_a_busca_no_RESULTADO_DA_SUA_BUSCA_NO_BLOG() {
		
		assertTrue("Resultado Não é memso da Pesquisa", validarResultado());
	}

}
