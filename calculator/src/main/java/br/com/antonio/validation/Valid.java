package br.com.antonio.validation;

import br.com.antonio.exception.UnsuportedMathOperationException;
import br.com.antonio.request.converters.NumberConverter;

public class Valid {

    public static Double IsNumberOne(String numberOne) {
        if (!NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.covertToDouble(numberOne);
    }

    public static Double IsNumberTwo(String numberTwo) {
        if (!NumberConverter.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.covertToDouble(numberTwo);
    }
}
