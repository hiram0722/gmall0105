package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hiram
 * @create 2020-12-28 2:27
 */

@Controller
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello";
    }
}
