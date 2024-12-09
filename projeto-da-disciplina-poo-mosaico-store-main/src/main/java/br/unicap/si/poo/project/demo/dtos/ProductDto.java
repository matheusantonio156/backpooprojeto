package br.unicap.si.poo.project.demo.dtos;

import lombok.Data;

@Data
public class ProductDto {
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Long productCategory; // ID da categoria associada
    private Long saleBy;          // ID da loja parceira
    private String productImage;  // Imagem em base64
}
