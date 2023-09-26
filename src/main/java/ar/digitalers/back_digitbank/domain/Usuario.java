package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column(nullable = false, updatable = false)
    private String email;
    @Column(nullable=false)
    private String password;
}
