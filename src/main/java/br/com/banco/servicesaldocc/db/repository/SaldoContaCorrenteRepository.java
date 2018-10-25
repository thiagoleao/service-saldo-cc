package br.com.banco.servicesaldocc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.servicesaldocc.db.model.ContaCorrente;
import br.com.banco.servicesaldocc.db.model.SaldoContaCorrente;


public interface SaldoContaCorrenteRepository extends JpaRepository<SaldoContaCorrente, Long> {
    SaldoContaCorrente findByContaCorrente(ContaCorrente contaCorrente);
}
