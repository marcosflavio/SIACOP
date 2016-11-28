package br.com.siacop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siacop.model.SolicitacaoConsulta;

public interface IRepositorySolicitacaoConsulta extends JpaRepository<SolicitacaoConsulta, Integer> {

}
