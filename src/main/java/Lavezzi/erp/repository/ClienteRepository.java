package Lavezzi.erp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Lavezzi.erp.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID>{

}
