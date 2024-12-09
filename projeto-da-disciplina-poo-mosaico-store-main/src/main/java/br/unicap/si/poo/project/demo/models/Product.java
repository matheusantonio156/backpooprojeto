package br.unicap.si.poo.project.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_description", length = 500)
    private String productDescription;

    @Column(name = "product_price", nullable = false)
    private Double productPrice;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category productCategory;

    @ManyToOne
    @JoinColumn(name = "partner_store_id", nullable = false)
    private PartnerStore saleBy;

    @Lob
    @Column(name = "product_image")
    private byte[] productImage;
}
