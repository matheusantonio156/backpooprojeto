package br.unicap.si.poo.project.demo.services;

import br.unicap.si.poo.project.demo.models.PartnerStore;
import br.unicap.si.poo.project.demo.repositories.PartnerStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartnerStoreService {

    private final PartnerStoreRepository partnerStoreRepository;

    // Salvar nova loja parceira
    public PartnerStore save(PartnerStore partnerStore) {
        return partnerStoreRepository.save(partnerStore);
    }

    // Buscar loja parceira por ID
    public PartnerStore searchById(Long id) {
        return partnerStoreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partner store not found."));
    }

    // Atualizar nome da loja parceira
    public PartnerStore updateNamePartnerStore(Long id, String newName) {
        PartnerStore partnerStore = searchById(id);
        partnerStore.setPartnerStoreName(newName);
        return partnerStoreRepository.save(partnerStore);
    }

    // Atualizar URL da loja parceira
    public PartnerStore updateURLPartnerStore(Long id, String newUrl) {
        PartnerStore partnerStore = searchById(id);
        partnerStore.setPartnerStoreUrl(newUrl);
        return partnerStoreRepository.save(partnerStore);
    }

    // Listar todas as lojas parceiras
    public List<PartnerStore> searchAll() {
        return partnerStoreRepository.findAll();
    }

    // Deletar loja parceira
    public void deletePartnerStore(Long id) {
        partnerStoreRepository.deleteById(id);
    }
}
