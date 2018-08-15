package com.basic.app.services;

import com.basic.app.dto.CalculationDto;

/**
 * Created by Junaid on 8/10/2018.
 */
public interface CalculatorService<T> {

    T calculate(CalculationDto calculationDto);
}
