package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.AvaliacaoSerie;
import br.com.fujideia.iesp.tecback.repository.AvaliacaoSerieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AvaliacaoSerieService {

    @Autowired
    private AvaliacaoSerieRepository repository;

    public List<AvaliacaoSerie> listarAvaliacoesSerie() {
        return repository.findAll();
    }

    public AvaliacaoSerie obterAvaliacaoSeriePorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public AvaliacaoSerie salvarAvaliacaoSerie(AvaliacaoSerie avaliacaoSerie) {
        return repository.save(avaliacaoSerie);
    }

    public Boolean excluirAvaliacaoSerie(Integer id) {
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }

}
