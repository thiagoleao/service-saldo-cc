package br.com.banco.servicesaldocc.db.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "SALDO_CONTA_CORRENTE")
@Data
public class SaldoContaCorrente implements Serializable {

	private static final long serialVersionUID = -3976553321615166389L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "VALOR")
	private BigDecimal valor;
	
	@OneToOne
	private ContaCorrente contaCorrente;
		
}
