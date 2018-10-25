package br.com.banco.servicesaldocc.rest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe tipo model representa 
 * o objeto saldo da conta corrente
 * 
 * @author Thiago Leão
 * @jdk 1.8
 */

public class Saldo implements Serializable {

	private static final long serialVersionUID = -4285710239129353634L;
	
	@Getter
	@Setter
	private BigDecimal valor;
	
	public Saldo(BigDecimal valor) {
		this.valor = valor;
	}
	
}
