package com.bnp.deal.movements.model.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status attribute) {
        if (attribute == null)
            return null;
        return attribute.getCode();
    }

    @Override
    public Status convertToEntityAttribute(String dbData) {
        if (dbData == null)
            return null;
        return Stream.of(Status.values())
                .filter(c -> c.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
