package br.unicap.si.poo.project.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "administrators")
public class Administrator {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String emailAdministrator;
    
    @Column(nullable = false)
    private String passwordAdministrator;
    
    @Column(nullable = false)
    private String nameAdministrator;
}
