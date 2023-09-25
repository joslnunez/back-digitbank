package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



import java.util.Date;
@Setter
@Getter
@Entity
public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    @ManyToOne
    @JoinColumn
    private Cuenta cuenta;

    @Column
    private Date fecha;

    @Column
    private String tipo;

    @Column
    private double monto;

    @Column
    private String moneda;

    @Column
    private double saldo;


}
