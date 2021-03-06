package com.minhasfinancas.Repository;

import com.minhasfinancas.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //Optional caso o email exista, sera retornado o usuario. Caso contrario o optional retornara fazio.
    Optional<Usuario> findByEmail(String email);

    //Podemos usar esse metodo para verificar se o email existe no banco
    boolean existsByEmail(String email);


}
