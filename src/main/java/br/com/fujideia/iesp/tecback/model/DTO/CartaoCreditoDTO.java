package br.com.fujideia.iesp.tecback.model.DTO;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartaoCreditoDTO {


    private Integer id;
    @NotEmpty
    private String numero;
    private String titular;
    private String validade;

}
