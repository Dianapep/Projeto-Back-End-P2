package br.com.fujideia.iesp.tecback.model.DTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvaliacaoFilmeDTO {

    private Integer id;
    @NotEmpty
    private Integer nota;

    private String comentario;

    @ManyToOne
    private Filme filme;

}
