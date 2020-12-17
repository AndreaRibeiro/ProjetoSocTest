package pageCommons;

import org.openqa.selenium.By;

public class RepositoryTest {
	
	//Menu FAP
	public static final By ID_COOKIE = By.id("barra-cookie");
	public static final By CSS_FAP_MENU = By.cssSelector("#navegacao-superior > ul > li.mostra-submenu > div > div:nth-child(2) > ul > li:nth-child(4) > a > abbr");
	public static final By CSS_MENU_SOL_REC = By.cssSelector("#navegacao-superior > ul > li.mostra-submenu");
	
	//Form FAP
	public static final By ID_NM_EMPRESA = By.id("nomeEmpresa");
	public static final By ID_FAP = By.id("fap");
	public static final By CSS_RAT = By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric > span");
	public static final By ID_PROJECAO_FAP = By.id("projecao");
	public static final By ID_BTN_ESTIMAR_FAP = By.id("estimar");
	public static final By ID_BTN_LIMPAR_FAP = By.cssSelector("#frmcalculadora > div.col-sm-12 > div.col-sm-12.buttons > a");
	public static final By CSS_ALERTA_FAP = By.cssSelector("#page > div > div > div > div.modal-body > p");
	public static final By CSS_FECHAR_ALERTA_FAP = By.cssSelector("#page > div > div > div > div.modal-header > button");
	public static final By COMBO_RAP = By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric-items > div > ul > li:nth-child(3)");
	
	//Estimativa FAP
	public static final By CSS_ESTIMATIVA_FAP = By.cssSelector("#page > section > div > header > h1");
	
	//Massa de dados do Form
	public static final String NOME_FAP = "TESTE FAP";
	public static final String VALOR_FAP = "10";
	public static final String VALOR_RAP = "2";
	public static final String PROJECAO_SAL_FAP = "2.000,00";
	
	//Massa de dados do Busca Blog
	
	public static final String BUSCA_SINDROME = "SÍNDROME DE BURNOUT";
	
	
	public static final By CSS__PESQUISA_BLOG = By.cssSelector("#blog > div > div.row.head-blog > div > form > input.form-control.input-com-icone.mt0");
	public static final By CSS_BTN_PESQUISAR = By.cssSelector("#blog > div > div.row.head-blog > div > form > input.lupa-form");
	public static final By CSS_CAMPO_RESULTADO = By.cssSelector("#blog > div > div.row.head-blog > div > h2");
}
