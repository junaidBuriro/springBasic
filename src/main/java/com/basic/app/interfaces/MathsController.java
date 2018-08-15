package com.basic.app.interfaces;

import com.basic.app.dto.CalculationDto;
import com.basic.app.facade.CalculationFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Junaid on 8/10/2018.
 */

@Controller
@RequestMapping("maths/")
public class MathsController {


    @Autowired
    CalculationFacadeService calculationFacadeService;

    @RequestMapping(value = "addition", method = {RequestMethod.PUT})
    public ResponseEntity<Double> addNumbers(@RequestBody CalculationDto calculationDto){
        return new ResponseEntity<Double>(calculationFacadeService.performCalculation(calculationDto), HttpStatus.ACCEPTED);
    }
}
