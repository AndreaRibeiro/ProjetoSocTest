$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureBuscaBlog/BuscaBlog.feature");
formatter.feature({
  "name": "Validar pagina BUSCA BLOG",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Validando BUSCA BLOG com uma busca com caracteres especiais e numeros",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que estou na pagina BUSCA BLOG",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscaBlogSteps.que_estou_na_pagina_BUSCA_BLOG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo de busca",
  "keyword": "E "
});
formatter.match({
  "location": "BuscaBlogSteps.preencho_o_campo_de_busca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em pesquisar",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscaBlogSteps.clico_em_pesquisar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido a busca no RESULTADO DA SUA BUSCA NO BLOG",
  "keyword": "Entao "
});
formatter.match({
  "location": "BuscaBlogSteps.valido_a_busca_no_RESULTADO_DA_SUA_BUSCA_NO_BLOG()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFAP/Fap.feature");
formatter.feature({
  "name": "Validar a Fator acidentario de Prevencao",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Acessar a FAP e preencher o formulario para calculo",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que estou na pagina BUSCA BLOG FAP",
  "keyword": "Dado "
});
formatter.match({
  "location": "FapSteps.que_estou_na_pagina_BUSCA_BLOG_FAP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono na barra superior -\u003e Solucoes e Recursos -\u003e FAP",
  "keyword": "E "
});
formatter.match({
  "location": "FapSteps.seleciono_na_barra_superior_Solucoes_e_Recursos_FAP()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027CORDEIRO\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\JUNIOR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:29934}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4cbb4e67d30eebc5a13bc92d509a0866\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepDefinitions.FapSteps.seleciono_na_barra_superior_Solucoes_e_Recursos_FAP(FapSteps.java:27)\r\n\tat ✽.seleciono na barra superior -\u003e Solucoes e Recursos -\u003e FAP(file:src/test/resources/FeatureFAP/Fap.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "preencho os campos",
  "keyword": "E "
});
formatter.match({
  "location": "FapSteps.preencho_os_campos()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clico estimar FAP",
  "keyword": "Quando "
});
formatter.match({
  "location": "FapSteps.clico_estimar_FAP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "valido o calculo FAP",
  "keyword": "Entao "
});
formatter.match({
  "location": "FapSteps.valido_o_calculo_FAP()"
});
formatter.result({
  "status": "skipped"
});
});