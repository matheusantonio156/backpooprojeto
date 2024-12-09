package br.unicap.si.poo.project.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "promotions")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotion_id")
    private Long promotionId;

    @Column(name = "promotion_name", nullable = false)
    private String promotionName;

    @Column(name = "promotion_description", length = 500)
    private String promotionDescription;

    @Column(name = "promotion_discount", nullable = false)
    private Double promotionDiscount;
}
