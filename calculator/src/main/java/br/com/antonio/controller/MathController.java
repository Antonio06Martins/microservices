package br.com.antonio.controller;

import br.com.antonio.math.SimpleMath;
import br.com.antonio.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        var num1 = Valid.IsNumberOne(numberOne);
        var num2 = Valid.IsNumberTwo(numberTwo);

        return math.sum(num1, num2);
    }

    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        var num1 = Valid.IsNumberOne(numberOne);
        var num2 = Valid.IsNumberTwo(numberTwo);

        return math.subtraction(num1, num2);
    }

    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        var num1 = Valid.IsNumberOne(numberOne);
        var num2 = Valid.IsNumberTwo(numberTwo);

        return math.multiplication(num1, num2);
    }

    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        var num1 = Valid.IsNumberOne(numberOne);
        var num2 = Valid.IsNumberTwo(numberTwo);

        return math.division(num1, num2);
    }


    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        var num1 = Valid.IsNumberOne(numberOne);
        var num2 = Valid.IsNumberTwo(numberTwo);

        return math.mean(num1, num2);
    }

    @RequestMapping(value="/squareRoot/{number}", method=RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number) throws Exception {

        var num1 = Valid.IsNumberOne(number);

        return math.squareRoot(num1);
    }
}
