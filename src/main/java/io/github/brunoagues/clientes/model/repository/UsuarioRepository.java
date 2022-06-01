package io.github.brunoagues.clientes.model.repository;

import io.github.brunoagues.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
