package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.AvaliacaoSerie;
import br.com.fujideia.iesp.tecback.service.AvaliacaoSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao-serie")
public class AvaliacaoSerieController {
    @Autowired
    private AvaliacaoSerieService service;

    @PostMapping
    public ResponseEntity<AvaliacaoSerie> salvarAvaliacaoSerie(@RequestBody AvaliacaoSerie avaliacaoSerie){
        avaliacaoSerie = service.salvarAvaliacaoSerie(avaliacaoSerie);
        return ResponseEntity.ok(avaliacaoSerie);
    }

    @GetMapping
    public ResponseEntity<List<AvaliacaoSerie>> listar(){
        return ResponseEntity.ok((List<AvaliacaoSerie>) service.listarAvaliacoesSerie());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvaliacaoSerie> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok((AvaliacaoSerie) service.obterAvaliacaoSeriePorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluirAvaliacaoSerie(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
