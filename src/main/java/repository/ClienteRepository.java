package repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ClientePesFis;

@Repository
public interface ClienteRepository extends JpaRepository<ClientePesFis, UUID>{

}
