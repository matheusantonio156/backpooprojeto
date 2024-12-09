package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
