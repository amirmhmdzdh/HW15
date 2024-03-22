package ir.hw15.Q2.B.Enum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class DegreeConverter implements AttributeConverter<Degree, String> {

    @Override
    public String convertToDatabaseColumn(Degree degree) {
        return degree.name();
    }

    @Override
    public Degree convertToEntityAttribute(String value) {
        return Degree.valueOf(value);
    }
}