package br.unicap.si.poo.project.demo.dtos;

import lombok.Data;

@Data
public class PromotionDto {
    private String promotionName;
    private String promotionDescription;
    private Double promotionDiscount;
}
