package com.sgc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sgc.app.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByIdUsuario(Long idUsuario);
    Usuario deleteByIdUsuario(Long idUsuario);
}
