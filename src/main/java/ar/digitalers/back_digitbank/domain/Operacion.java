package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;



import java.util.Date;
@Setter
@Getter
@Entity
public class Operacion {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn
    private Cuenta cuenta;

    @Column
    private Date fecha;

    @Column
    private String tipo;

    @Column(length = 50)
    private double monto;

    @Min(0)
    @Column(nullable = false)
    private String moneda;

    @Column
    private double saldo;


}
