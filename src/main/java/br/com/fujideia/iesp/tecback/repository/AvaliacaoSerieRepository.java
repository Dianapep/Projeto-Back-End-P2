package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.AvaliacaoSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoSerieRepository extends JpaRepository<AvaliacaoSerie, Integer> {
}
