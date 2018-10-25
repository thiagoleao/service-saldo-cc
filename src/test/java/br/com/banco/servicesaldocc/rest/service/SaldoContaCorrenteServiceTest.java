package br.com.banco.servicesaldocc.rest.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.banco.servicesaldocc.rest.exception.ContaCorrenteNotFoundException;
import br.com.banco.servicesaldocc.rest.model.Saldo;

/**
 * Classe exemplo de teste de service de negócio
 * @author Thiago Leão
 * @jdk 1.8
 * 
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SaldoContaCorrenteServiceTest {
	
	
	@Autowired
	private SaldoContaCorrenteService service;

	@Test
	public void ConsultaValorDeContaExistentetest() throws ContaCorrenteNotFoundException {
		Saldo saldo = service.getSaldoByContaId(new Long(100));
		assertEquals(new BigDecimal("100.00"), saldo.getValor());
	}

}
