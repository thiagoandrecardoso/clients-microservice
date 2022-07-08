package programadorwho.msclients.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import programadorwho.msclients.domain.Client;
import programadorwho.msclients.infra.repository.ClientRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    @Transactional
    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Optional<Client> getByCpf(String cpf){
        return clientRepository.findByCpf(cpf);
    }
}
