package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_avaliacao_serie")
public class AvaliacaoSerie {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer nota;

    private String comentario;

    @ManyToOne
    private Serie serie;

}

