package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_cartao")
public class CartaoCredito {

    @Id
    @GeneratedValue
    private Integer id;

    private String numero;
    private String titular;
    @Column(name = "ds_validade", length = 500)
    private String validade;

}

