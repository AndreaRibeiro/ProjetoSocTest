package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageCommons.Manager;
import pageCommons.RepositoryTest;
import pageNavigation.Fap;

public class FapSteps extends Manager {
	
	public Fap fap;

	public FapSteps () {
		fap = new Fap(driver);
	}
	
	@Dado("que estou na pagina BUSCA BLOG FAP")
	public void que_estou_na_pagina_BUSCA_BLOG_FAP() throws Throwable {
		iniciaDriver();  
	}
	
	@Dado("seleciono na barra superior -> Solucoes e Recursos -> FAP")
	public void seleciono_na_barra_superior_Solucoes_e_Recursos_FAP() {
	   driver.findElement(RepositoryTest.ID_COOKIE).click();
	   driver.findElement(RepositoryTest.CSS_MENU_SOL_REC).click();
	   driver.findElement(RepositoryTest.CSS_FAP_MENU).click();   
	}

	@Quando("clico estimar FAP")
	public void clico_estimar_FAP() {
		driver.findElement(RepositoryTest.ID_BTN_ESTIMAR_FAP).click();  
	}

	@Dado("preencho os campos")
	public void preencho_os_campos() {
		manipularScrollParaBaixo();
		driver.findElement(RepositoryTest.ID_NM_EMPRESA).sendKeys(RepositoryTest.NOME_FAP);
		driver.findElement(RepositoryTest.ID_FAP).sendKeys(RepositoryTest.VALOR_FAP);
		driver.findElement(RepositoryTest.CSS_RAT).click();
		driver.findElement(RepositoryTest.COMBO_RAP).click();
		driver.findElement(RepositoryTest.ID_PROJECAO_FAP).sendKeys(RepositoryTest.PROJECAO_SAL_FAP); 
	}

	@Entao("valido o calculo FAP")
	public void valido_o_calculo_FAP() {
		assertTrue("Não está exibindo a estimativa: ESTIMATIVA FAP DA EMPRESA",
				validarTextoEspecifico("ESTIMATIVA FAP DA EMPRESA"));
	   fechaDriver();
	}

}
