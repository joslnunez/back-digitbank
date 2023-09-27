package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter

public class Transaccion {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String tipoTransaccion;

    @Column
    private LocalDateTime fechaHora;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn (name = "cuenta_id")
    private Cuenta cuenta;

}
