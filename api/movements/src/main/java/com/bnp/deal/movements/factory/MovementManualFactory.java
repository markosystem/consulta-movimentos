package com.bnp.deal.movements.factory;

import com.bnp.deal.movements.model.MovementManual;

import java.math.BigDecimal;

public class MovementManualFactory {

    public static MovementManual initialize(){
        MovementManual model = new MovementManual();
        //demais factory de entidades
        return model;
    }

    public static MovementManual initializeConstructor(int datMes, int datAno, int numLancamento, BigDecimal valValor, String desDescription){
        MovementManual model = new MovementManual();
        model.setDatMes(datMes);
        model.setDatAno(datAno);
        model.setNumLancamento(numLancamento);
        model.setValValor(valValor);
        model.setDesDescription(desDescription);
        model.setCodUser("TESTE");
        //demais factory de entidades
        return model;
    }
}
