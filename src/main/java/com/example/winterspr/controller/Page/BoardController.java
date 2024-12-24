package com.example.winterspr.controller.Page;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/board")
@Controller
public class BoardController {

//    @GetMapping("/create")
//    public  String create(){
//        return "board/create";
//    }

    @GetMapping("/{page}")
    public String page(@PathVariable String page){
        return "board/"+page;
    }

    @GetMapping("/{page}/{id}")
    public String page(@PathVariable String page,@PathVariable String id){
        return "board/"+page;
    }
}
