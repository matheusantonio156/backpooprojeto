package br.unicap.si.poo.project.demo.controllers;

import br.unicap.si.poo.project.demo.models.Category;
import br.unicap.si.poo.project.demo.models.PartnerStore;
import br.unicap.si.poo.project.demo.models.Product;
import br.unicap.si.poo.project.demo.services.CategoryService;
import br.unicap.si.poo.project.demo.services.PartnerStoreService;
import br.unicap.si.poo.project.demo.services.ProductService;
import br.unicap.si.poo.project.demo.dtos.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Base64;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/products")
@CrossOrigin(origins = "*")
public class productController {

    private final ProductService productService;
    private final CategoryService categoryService;
    private final PartnerStoreService partnerStoreService;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDto productDTO) {
        Product product = new Product();
        product.setProductName(productDTO.getProductName());
        product.setProductDescription(productDTO.getProductDescription());
        product.setProductPrice(productDTO.getProductPrice());

        // Busca a categoria pelo ID usando o serviço
        Category productCategory = categoryService.searchById(productDTO.getProductCategory());
        product.setProductCategory(productCategory);

        // Busca a loja parceira pelo ID usando o serviço
        PartnerStore saleBy = partnerStoreService.searchById(productDTO.getSaleBy());
        product.setSaleBy(saleBy);

        if (productDTO.getProductImage() != null) {
            byte[] imageBytes = Base64.getDecoder().decode(productDTO.getProductImage());
            product.setProductImage(imageBytes);
        }

        Product savedProduct = productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    // Outros métodos permanecem os mesmos
}
