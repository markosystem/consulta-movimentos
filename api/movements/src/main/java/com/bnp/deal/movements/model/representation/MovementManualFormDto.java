package com.bnp.deal.movements.model.representation;

import com.bnp.deal.movements.factory.MovementManualFactory;
import com.bnp.deal.movements.model.MovementManual;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class MovementManualFormDto {

    @NotBlank
    @Column(name = "DAT_MES")
    private int datMes;

    @NotBlank
    @Column(name = "DAT_ANO")
    private int datAno;

    @NotBlank
    @Column(name = "NUM_LANCAMENTO", length = 18)
    private int numLancamento;

    @NotNull
    @Column(name = "VAL_VALOR", length = 30, scale = 2, precision = 18)
    private BigDecimal valValor;

    @NotNull
    @Column(name = "DES_DESCRICAO", length = 50)
    private String desDescription;

    public MovementManual converter() {
        return MovementManualFactory.initializeConstructor(this.datMes, this.datAno, this.numLancamento, this.valValor, this.desDescription);
    }

    //falta os 2 relacionamentos
}
