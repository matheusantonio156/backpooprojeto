package br.unicap.si.poo.project.demo.services;

import br.unicap.si.poo.project.demo.models.Category;
import br.unicap.si.poo.project.demo.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // Salvar nova categoria
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    // Buscar categoria por ID
    public Category searchById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found."));
    }

    // Atualizar nome da categoria
    public Category updateNameCategory(Long id, String newName) {
        Category category = searchById(id);
        category.setCategoryName(newName);
        return categoryRepository.save(category);
    }

    // Listar todas as categorias
    public List<Category> searchAll() {
        return categoryRepository.findAll();
    }

    // Deletar categoria
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
