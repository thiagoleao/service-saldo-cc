package br.com.banco.servicesaldocc.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.servicesaldocc.rest.exception.ContaCorrenteNotFoundException;
import br.com.banco.servicesaldocc.rest.model.Saldo;
import br.com.banco.servicesaldocc.rest.service.SaldoContaCorrenteService;

/**
 * Classe tipo controller endpoint das
 * chamadas rest para consulta do saldo da 
 * conta corrente  
 *
 * @author Thiago Leão
 * @jdk 1.8
 */

@RestController
public class SaldoContaCorrenteServiceController {
	
	private static final Logger logger = LoggerFactory.getLogger(SaldoContaCorrenteServiceController.class);
	
	@Autowired
	private SaldoContaCorrenteService service; 
	
	@RequestMapping("saldo")
	public Saldo getSaldo(@RequestParam Long contaId) throws ContaCorrenteNotFoundException {
		logger.info("Iniciando a consulta de saldo para a conta de ID:" + contaId);
	
		Saldo saldo = service.getSaldoByContaId(contaId);
		
		logger.info("Finalizando a consulta de saldo para a conta de ID:" + contaId + " com saldo: " + saldo.getValor());
		
		return saldo;
	}

}
