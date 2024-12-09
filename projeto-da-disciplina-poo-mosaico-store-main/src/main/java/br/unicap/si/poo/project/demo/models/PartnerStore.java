package br.unicap.si.poo.project.demo.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "lojas_parceiras")
public class PartnerStore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Melhor para bancos como MySQL
    @Column(name = "PartnerStore_ID")
    private Long partnerStoreId;

    @Column(name = "PartnerStore_NAME", nullable = false)
    private String partnerStoreName;

    @Column(name = "PartnerStore_URL", nullable = false, unique = true)
    private String partnerStoreUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartnerStore that = (PartnerStore) o;
        return Objects.equals(partnerStoreId, that.partnerStoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partnerStoreId);
    }
}
