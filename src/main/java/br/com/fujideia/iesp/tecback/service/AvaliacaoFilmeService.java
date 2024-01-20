package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.AvaliacaoFilme;
import br.com.fujideia.iesp.tecback.repository.AvaliacaoFilmeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AvaliacaoFilmeService {

    @Autowired
    private AvaliacaoFilmeRepository repository;

    public List<AvaliacaoFilme> listarAvaliacoesFilme() {
        return repository.findAll();
    }

    public AvaliacaoFilme obterAvaliacaoFilmePorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public AvaliacaoFilme salvarAvaliacaoFilme(AvaliacaoFilme avaliacaoFilme) {
        return repository.save(avaliacaoFilme);
    }

    public Boolean excluirAvaliacaoFilme(Integer id) {
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }


}
