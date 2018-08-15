package com.basic.app.facade.impl;

import com.basic.app.dto.CalculationDto;
import com.basic.app.facade.CalculationFacadeService;
import com.basic.app.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Junaid on 8/13/2018.
 */

@Component
public class CalculationFacadeServiceImpl implements CalculationFacadeService{

    CalculatorService calculatorService;

    @Override
    public Double performCalculation(CalculationDto calculationDto) {

        CalculatorService<Double> additionOperation = (x) -> {
            return calculationDto.getFirstNumber() + calculationDto.getSecondNumber();
        };

        return operation(additionOperation, calculationDto);
    }


    Double operation(CalculatorService calculatorService, CalculationDto calculationDto){
        return (Double) calculatorService.calculate(calculationDto);
    }


}
