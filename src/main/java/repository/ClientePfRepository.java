package repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ClientePF;

@Repository
public interface ClienteRepository extends JpaRepository<ClientePF, UUID>{

}
