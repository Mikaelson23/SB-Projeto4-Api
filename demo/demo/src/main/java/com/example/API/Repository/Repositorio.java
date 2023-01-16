package com.example.API.Repository;

import com.example.API.Model.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends CrudRepository <Restaurante, Long> {

    List<Restaurante> findAll();

    Restaurante findByCodigo(int id);

}
