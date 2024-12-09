package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
