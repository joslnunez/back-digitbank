package ar.digitalers.back_digitbank.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "prestamo")
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    /* atributos id, cliente, monto, plazo, tasa, cuota y costo */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prestamo_id")
    private int prestamo_id;
    @Column(nullable = false)
    private double monto;
    @Column(nullable = false)

    private int plazo;
    @Column(nullable = false)

    private float tasa;
    @Column(nullable = false)

    private double cuota;
    @Column(nullable = false)

    private float costo;

    /*@ManyToOne
    @JoinColumn(name = "cliente_id")
    //private Cliente cliente;*/
}
