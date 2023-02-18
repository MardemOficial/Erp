package Lavezzi.erp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Lavezzi.erp.model.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, UUID>{

}
