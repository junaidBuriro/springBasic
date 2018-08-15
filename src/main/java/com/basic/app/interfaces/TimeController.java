package com.basic.app.interfaces;

import org.joda.time.DateTimeUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Junaid on 8/10/2018.
 */
@Controller
@RequestMapping("api/")
public class TimeController {

    @RequestMapping(value = "time", method = {RequestMethod.GET})
    public ResponseEntity<String> time() {
        return new ResponseEntity<String>(String.valueOf(DateTimeUtils.currentTimeMillis()), HttpStatus.OK);
    }

    @RequestMapping(value = "health", method = {RequestMethod.GET})
    @ResponseBody// indicates that the return type should be written straight to the HTTP response body (and not placed in a Model, or interpreted as a view name).
    public String health(){
        return "Health is good. Enjoy.";
    }

}
