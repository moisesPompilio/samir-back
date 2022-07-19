package com.calculadora.SAMIR.Repositorio;

import com.calculadora.SAMIR.Modelo.CalculoEmLote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalculoEmLoteRepository extends JpaRepository <CalculoEmLote, Integer> {

    CalculoEmLote findByNome(String nome);


    CalculoEmLote findByNumeroDoProcesso(String numeroDoProcesso);

    List<CalculoEmLote> findByUsuario(int usuario);


    List<CalculoEmLote> findAllByOrderByIdDesc();

    //List<CalculoEmLote> findByUsuario(UsuarioModelo usuario);

    //CalculoEmLote findByUsuarioAndName(UsuarioModelo usuario, String name);
}
