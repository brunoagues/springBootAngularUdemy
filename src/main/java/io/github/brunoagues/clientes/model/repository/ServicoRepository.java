package io.github.brunoagues.clientes.model.repository;

import io.github.brunoagues.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
