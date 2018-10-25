package br.com.banco.servicesaldocc.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.banco.servicesaldocc.db.model.ContaCorrente;
import br.com.banco.servicesaldocc.db.model.SaldoContaCorrente;
import br.com.banco.servicesaldocc.db.repository.SaldoContaCorrenteRepository;
import br.com.banco.servicesaldocc.rest.exception.ContaCorrenteNotFoundException;
import br.com.banco.servicesaldocc.rest.model.Saldo;
import br.com.banco.servicesaldocc.rest.service.SaldoContaCorrenteService;

@Component
public class SaldoContaCorrenteServiceImpl implements SaldoContaCorrenteService {

	@Autowired
	private SaldoContaCorrenteRepository repository;
	
	@Override
	public Saldo getSaldoByContaId(Long contaId) throws ContaCorrenteNotFoundException {
		
		SaldoContaCorrente saldoContaCorrente = repository.findByContaCorrente(new ContaCorrente(contaId));
		
		Saldo saldo = null;
		
		if(saldoContaCorrente == null) {
		
			throw new ContaCorrenteNotFoundException("data not found");
			
		} else {
			
			saldo = new Saldo(saldoContaCorrente.getValor());
		}
		
		return saldo;
	}
	
	

}
