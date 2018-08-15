package com.basic.app.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

/**
 * Created by Junaid on 8/13/2018.
 */

@JsonAutoDetect
@Data
public class CalculationDto {
    Double firstNumber;
    Double secondNumber;
    String operation;
}
