package programadorwho.msclients.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import programadorwho.msclients.domain.Client;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCpf(String cpf);
}
