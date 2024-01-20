package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Entity
@Table(name = "tb_avaliacao_filme")
public class AvaliacaoFilme {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer nota;

    private String comentario;

    @ManyToOne
    private Filme filme;
}
