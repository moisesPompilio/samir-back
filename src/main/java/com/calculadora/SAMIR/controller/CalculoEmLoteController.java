package com.calculadora.SAMIR.controller;


import com.calculadora.SAMIR.Modelo.CalculoEmLote;
import com.calculadora.SAMIR.Repositorio.CalculoEmLoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/calculoEmLote")
public class CalculoEmLoteController {

    @Autowired
    private CalculoEmLoteRepository repository;

    @GetMapping("/listar")
    public @ResponseBody
    List<CalculoEmLote> listar() {
        return repository.findAllByOrderByIdDesc();
    }
    @PostMapping("/ProcurarPorName")
    public @ResponseBody
    CalculoEmLote procurarPorNome(@RequestBody CalculoEmLote name) {
        System.out.println("aqui");
//        try {
//            return repository.findByNome(name.getNome());
//        } catch (Exception e) {
//            return null;
//        }

        return repository.findByNome(name.getNome());
    }

    @GetMapping("/procurarPorCodigo/{codigo}")
    public @ResponseBody
    Optional<CalculoEmLote> filtrarCorrecaoCodigo(@PathVariable Integer codigo) {
        return repository.findById(codigo);
    }
    @GetMapping("/procurarPorUsuario/{usuario}")
    public @ResponseBody
    List<CalculoEmLote> filtarUsuario(@PathVariable Integer usuario) {
        return repository.findByUsuario(usuario);
    }

    @PostMapping("/salvar")
    public @ResponseBody
    CalculoEmLote salvarCalculoEmLote(@RequestBody CalculoEmLote calculoEmLote) {
        try {
            return repository.save(calculoEmLote);
        }  catch (Exception e) {
            return null;
        }


    }
    @PutMapping("/alterar")
    public @ResponseBody
    CalculoEmLote alterar(@RequestBody CalculoEmLote calculoEmLote) {
        try {
            return repository.save(calculoEmLote);
        }  catch (Exception e) {
            return null;
        }


    }

    @PostMapping("/salvarLista")
    public @ResponseBody
    List<CalculoEmLote> salvarLista(@RequestBody List<CalculoEmLote> list){
        try {
            return repository.saveAll(list);
        } catch (Exception e) {
            return null;
        }


    }

    @DeleteMapping("/deletar/{id}")
    public @ResponseBody void deletar( @PathVariable Integer id){
        try {
            repository.delete(repository.getById(id));
        } catch (Exception e) {
            //return e;
        }


    }
    @DeleteMapping("/deletarAllUsuario/{usuario}")
    public @ResponseBody List<CalculoEmLote> deletarALL(@PathVariable Integer usuario){
        try {
            List<CalculoEmLote> list = repository.findByUsuario(usuario);
            repository.deleteAll(list);
            return list;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }


}