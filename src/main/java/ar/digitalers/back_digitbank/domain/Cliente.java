package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class Cliente /*extends Usuario*/ {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    @Email
    private String email;

    @Column
    private String contraseña;



}
