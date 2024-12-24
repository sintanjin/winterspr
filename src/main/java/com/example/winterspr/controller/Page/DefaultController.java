package com.example.winterspr.controller.Page;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("")
@Controller
public class DefaultController {

    @GetMapping("/index")
    public  String index(@RequestParam String name, Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "index";
    }



    @GetMapping("/calculate")
    public String Calculate(@RequestParam int a, int b, Model model){
        int sum = a+b;
        model.addAttribute("sum",sum);
        return "calculate";
    }

    @GetMapping("/idpw")
    public String Calculate(@RequestParam String id, String pw, Model model){
        boolean login= false;
        String[][] idpw={
                {"a1","b1"},
                {"a2","b2"},
                {"winterspr","abcd1234"}
        };
        for(int i=0;i<idpw.length;i++){
            if(id.equals(idpw[i][0])&&pw.equals(idpw[i][1])){
                login=true;
            }
        }
        model.addAttribute("login",login);
        return "idpw";
    }
}
