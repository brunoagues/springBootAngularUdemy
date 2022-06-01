package io.github.brunoagues.clientes.model.repository;

import io.github.brunoagues.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
