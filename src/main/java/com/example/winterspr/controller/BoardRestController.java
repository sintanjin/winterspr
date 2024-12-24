package com.example.winterspr.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/board")
@Controller
public class BoardRestController {

    List<Map<String,Object>> boards = new ArrayList<Map<String,Object>>();
    @GetMapping("/create")
    public  String create2(@RequestParam Map<String,Object> params){
        System.out.println("title:" +params.get("title"));
        System.out.println("content:" +params.get("content"));

        Map<String,Object> board = new HashMap<String, Object>();
        board.put("id",boards.size()+1);
        board.put("title",params.get("title"));
        board.put("content", params.get("content"));
        boards.add(board);

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code",200);
        result.put("")
        return "board/create";
    }

}
