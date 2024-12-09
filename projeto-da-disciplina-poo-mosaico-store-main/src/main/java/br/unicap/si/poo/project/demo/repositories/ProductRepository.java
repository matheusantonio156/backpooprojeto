package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
