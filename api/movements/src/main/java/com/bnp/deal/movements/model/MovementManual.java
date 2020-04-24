package com.bnp.deal.movements.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MOVIMENTO_MANUAL")
@Getter
@Setter
@IdClass(MovementManualId.class)
public class MovementManual implements Serializable {
    private static final long serialVersionUID = -3867029904984479869L;

    @Id
    @Column(name = "DAT_MES")
    private int datMes;

    @Id
    @Column(name = "DAT_ANO")
    private int datAno;

    @Id
    @Column(name = "NUM_LANCAMENTO", length = 18)
    private int numLancamento;

/*    @ManyToOne
    private Product product;

    @ManyToOne
    private ProductCosif productCosif;*/

    @Column(name = "VAL_VALOR", length = 30, scale = 2, precision = 18)
    private BigDecimal valValor;

    @Column(name = "DES_DESCRICAO", length = 50)
    private String desDescription;

    @Column(name = "DAT_MOVIMENTO")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date datMovement;

    @Column(name = "COD_USUARIO", columnDefinition = "varchar(15) default 'TESTE'")
    private String codUser;
}
