package br.com.banco.servicesaldocc.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTA_CORRENTE")
@Data
public class ContaCorrente implements Serializable {
	
	public ContaCorrente() {
		// default
	}
		
	public ContaCorrente(Long contaId) {
		this.id = contaId;
	}

	private static final long serialVersionUID = -7120169112814065705L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

}
