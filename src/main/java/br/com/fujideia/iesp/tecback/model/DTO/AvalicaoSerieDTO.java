package br.com.fujideia.iesp.tecback.model.DTO;
import br.com.fujideia.iesp.tecback.model.Serie;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvalicaoSerieDTO {

    private Integer id;
    @NotEmpty
    private Integer nota;
    private String comentario;
    private Serie serie;

}
