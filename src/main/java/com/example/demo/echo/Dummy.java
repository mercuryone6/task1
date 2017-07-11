package com.example.demo.echo;

import org.springframework.web.bind.annotation.*;


@RestController
public class Dummy {

    @RequestMapping (value = "/dummy", method = RequestMethod.GET)
    public String getAllTopics(@RequestParam(value="text") String text){
        return  text;
    }
}
