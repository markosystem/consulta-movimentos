package com.bnp.deal.movements.model.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ClassificationConverter implements AttributeConverter<Classification, String> {

    @Override
    public String convertToDatabaseColumn(Classification attribute) {
        if (attribute == null)
            return null;
        return attribute.getCode();
    }

    @Override
    public Classification convertToEntityAttribute(String dbData) {
        if (dbData == null)
            return null;
        return Stream.of(Classification.values())
                .filter(c -> c.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
