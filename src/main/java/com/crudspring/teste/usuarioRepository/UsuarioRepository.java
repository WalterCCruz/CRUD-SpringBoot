package com.crudspring.teste.usuarioRepository;

import com.crudspring.teste.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends MongoRepository<Usuario, String> {


}
