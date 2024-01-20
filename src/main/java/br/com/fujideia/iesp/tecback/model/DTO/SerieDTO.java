package br.com.fujideia.iesp.tecback.model.DTO;
import br.com.fujideia.iesp.tecback.model.Genero;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SerieDTO {


    private Integer id;
    @NotEmpty
    private String titulo;
    private Integer temporadas;
    private String sinopse;
    private Genero genero;

}
