package com.example.API.Controller;

import com.example.API.Model.Restaurante;
import com.example.API.Repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SistemaController{

    @Autowired
    private Repositorio bd;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurante cadastrarRestaurante(@RequestBody Restaurante objeto){
        return bd.save(objeto);
    }

    @GetMapping("/all")
    public List<Restaurante> mostrarRestaurantes(){
        return bd.findAll();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Restaurante> RestauranteSelecionadoPorCodigo(@PathVariable Long codigo){
        return bd.findById(codigo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{restaurante}")
    public ResponseEntity<Restaurante> atualizarComida(@RequestBody Restaurante restaurante,
                                                       @PathVariable Long restauranteId){
        if (!bd.existsById(restauranteId))


    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> removerRestaurante(@PathVariable Long codigo) {
        if(!bd.existsById(codigo))return ResponseEntity.notFound().build();
        bd.deleteById(codigo);
        return ResponseEntity.noContent().build();
    }
}
