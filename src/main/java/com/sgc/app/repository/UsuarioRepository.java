package com.sgc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sgc.app.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByIdUsuario(long id_usuario);
    Usuario deleteByIdUsuario(long id_usuario);
}
