package ar.digitalers.back_digitbank.domain;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cuota")
@Getter
@Setter
@NoArgsConstructor
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;   

    @NotNull
    @Column
    private int numeroCuota;

    @NotNull
    @Column
    private int monto;
    
    @NotBlank
    @Column
    private String fechaVencimiento;

    @Null
    @Column
    @CreationTimestamp
    private String fechaPago; 

    @Null
    @Column
    @NotBlank
    private String attribute1;

    @NotNull
    @Column
    private boolean estado;

    @ManyToOne
    private Contrato contrato;
}
