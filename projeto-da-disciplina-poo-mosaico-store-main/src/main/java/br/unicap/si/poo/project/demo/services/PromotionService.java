package br.unicap.si.poo.project.demo.services;

import br.unicap.si.poo.project.demo.models.Promotion;
import br.unicap.si.poo.project.demo.repositories.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final PromotionRepository promotionRepository;

    // Salvar nova promoção
    public Promotion save(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    // Buscar promoção por ID
    public Promotion searchById(Long id) {
        return promotionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Promoção não encontrada."));
    }

    // Atualizar nome da promoção
    public Promotion updatePromotionName(Long id, String newName) {
        Promotion promotion = searchById(id);
        promotion.setPromotionName(newName);
        return promotionRepository.save(promotion);
    }

    // Atualizar descrição da promoção
    public Promotion updatePromotionDescription(Long id, String newDescription) {
        Promotion promotion = searchById(id);
        promotion.setPromotionDescription(newDescription);
        return promotionRepository.save(promotion);
    }

    // Atualizar desconto da promoção
    public Promotion updatePromotionDiscount(Long id, Double newDiscount) {
        Promotion promotion = searchById(id);
        promotion.setPromotionDiscount(newDiscount);
        return promotionRepository.save(promotion);
    }

    // Listar todas as promoções
    public List<Promotion> searchAll() {
        return promotionRepository.findAll();
    }

    // Deletar promoção
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}
