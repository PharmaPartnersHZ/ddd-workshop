package nl.pharmapartners.ddd.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2PatientRepository extends JpaRepository<PatientEntity, Long> {
}
