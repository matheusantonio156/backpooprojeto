package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.PartnerStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerStoreRepository extends JpaRepository<PartnerStore, Long> {
}
