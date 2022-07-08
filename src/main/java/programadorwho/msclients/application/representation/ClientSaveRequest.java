package programadorwho.msclients.application.representation;

import lombok.Data;
import programadorwho.msclients.domain.Client;

@Data
public class ClientSaveRequest {
    private String cpf;
    private String nome;
    private Integer idade;

    public Client toModel(){
        return new Client(cpf, nome, idade);
    }
}
