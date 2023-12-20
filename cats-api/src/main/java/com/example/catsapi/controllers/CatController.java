package com.example.catsapi.controllers;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat){
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @GetMapping("/test")
    public String Test(){
        return "Test page";
    }

    @GetMapping("/new")
    public String New(){
        return "New cat";
    }

}
