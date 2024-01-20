package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @CPF
    private String cpf;


    @ManyToOne
    private CartaoCredito cartaoCredito;
}
