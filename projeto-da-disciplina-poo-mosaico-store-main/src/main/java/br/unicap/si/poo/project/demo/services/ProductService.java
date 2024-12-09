package br.unicap.si.poo.project.demo.services;

import br.unicap.si.poo.project.demo.models.Product;
import br.unicap.si.poo.project.demo.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // Salvar novo produto
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Buscar produto por ID
    public Product searchById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado."));
    }

    // Atualizar nome do produto
    public Product updateProductName(Long id, String newName) {
        Product product = searchById(id);
        product.setProductName(newName);
        return productRepository.save(product);
    }

    // Atualizar descrição do produto
    public Product updateProductDescription(Long id, String newDescription) {
        Product product = searchById(id);
        product.setProductDescription(newDescription);
        return productRepository.save(product);
    }

    // Atualizar preço do produto
    public Product updateProductPrice(Long id, Double newPrice) {
        Product product = searchById(id);
        product.setProductPrice(newPrice);
        return productRepository.save(product);
    }

    // Listar todos os produtos
    public List<Product> searchAll() {
        return productRepository.findAll();
    }

    // Deletar produto
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
