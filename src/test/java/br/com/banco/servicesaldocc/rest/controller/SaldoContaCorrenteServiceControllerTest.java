package br.com.banco.servicesaldocc.rest.controller;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.banco.servicesaldocc.rest.model.Saldo;


/**
 * Classe exemplo de teste de controller rest
 * @author Thiago Leão
 * @jdk 1.8
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SaldoContaCorrenteServiceControllerTest {

	private String url = "http://localhost:8080/saldo";

	private RestTemplate restTemplate;

	@Before
	public void setUp() throws MalformedURLException {
		restTemplate = new RestTemplate();
	}

	@Test
	public void DeveRetornarOValorDoSaldoTest() throws Exception {
		restTemplate.getInterceptors().add(
				  new BasicAuthorizationInterceptor("user", "password"));
		
		ResponseEntity<Saldo> responseEntity = restTemplate.exchange(
				url + "?contaId=100", 
				  HttpMethod.GET, null, Saldo.class);
		assertEquals(200, responseEntity.getStatusCodeValue());
		assertEquals(new BigDecimal("100.00"), responseEntity.getBody().getValor());
	}
	
	@Test(expected = HttpClientErrorException.class)
	public void NaoDeveRetornarOValorDoSaldoTest() throws Exception {
		restTemplate.getInterceptors().add(
				  new BasicAuthorizationInterceptor("user", "password"));
		
		restTemplate.exchange(
				url + "?contaId=105", 
				  HttpMethod.GET, null, Saldo.class);
	}

}
