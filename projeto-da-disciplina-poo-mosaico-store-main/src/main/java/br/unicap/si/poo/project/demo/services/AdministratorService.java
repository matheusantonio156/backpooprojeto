package br.unicap.si.poo.project.demo.services;

import br.unicap.si.poo.project.demo.models.Administrator;
import br.unicap.si.poo.project.demo.repositories.AdministratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdministratorService {

    private final AdministratorRepository administratorRepository;

    // Salvar novo administrador
    public Administrator save(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    // Buscar administrador por ID
    public Administrator searchById(Long id) {
        return administratorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Administrator not found."));
    }

    // Atualizar a senha do administrador
    public Administrator updatePassword(Long id, String newPassword) {
        Administrator administrator = searchById(id);
        administrator.setPasswordAdministrator(newPassword);
        return administratorRepository.save(administrator);
    }

    // Atualizar o e-mail do administrador
    public Administrator updateEmail(Long id, String newEmail) {
        Administrator administrator = searchById(id);
        administrator.setEmailAdministrator(newEmail);
        return administratorRepository.save(administrator);
    }

    // Atualizar o nome do administrador
    public Administrator updateName(Long id, String newName) {
        Administrator administrator = searchById(id);
        administrator.setNameAdministrator(newName);
        return administratorRepository.save(administrator);
    }

    // Listar todos os administradores
    public List<Administrator> searchAll() {
        return administratorRepository.findAll();
    }

    // Deletar um administrador
    public void deleteAdmin(Long id) {
        administratorRepository.deleteById(id);
    }
}
