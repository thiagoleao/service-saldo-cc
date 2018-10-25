package br.com.banco.servicesaldocc.rest.service;

import br.com.banco.servicesaldocc.rest.exception.ContaCorrenteNotFoundException;
import br.com.banco.servicesaldocc.rest.model.Saldo;

public interface SaldoContaCorrenteService {

	Saldo getSaldoByContaId(Long contaId) throws ContaCorrenteNotFoundException;
	
}
