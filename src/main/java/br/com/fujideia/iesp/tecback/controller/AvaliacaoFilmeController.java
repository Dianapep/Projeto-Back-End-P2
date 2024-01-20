package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.AvaliacaoFilme;
import br.com.fujideia.iesp.tecback.service.AvaliacaoFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao-filme")
public class AvaliacaoFilmeController {

    @Autowired
    private AvaliacaoFilmeService service;


    @PostMapping
    public ResponseEntity<AvaliacaoFilme> salvarAvaliacaoFilme(@RequestBody AvaliacaoFilme avaliacaoFilme) {
        avaliacaoFilme = service.salvarAvaliacaoFilme(avaliacaoFilme);
        return ResponseEntity.ok(avaliacaoFilme);
    }

    @GetMapping
    public ResponseEntity<List<AvaliacaoFilme>> listar() {
        return ResponseEntity.ok((List<AvaliacaoFilme>) service.listarAvaliacoesFilme());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvaliacaoFilme> consultar(@PathVariable("id") Integer id) {
        return ResponseEntity.ok((AvaliacaoFilme) service.obterAvaliacaoFilmePorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id) {
        if (service.excluirAvaliacaoFilme(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}