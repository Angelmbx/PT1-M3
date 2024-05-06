package com.example.M3PruebaTecnica.controller;


import com.example.M3PruebaTecnica.api.ILenguageService;
import com.example.M3PruebaTecnica.model.dto.LenguageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/lenguages")
public class LenguageController {

    @Autowired
    private ILenguageService lenguageService;

    @GetMapping
    public String testController() {
        return "Lenguages controller works, boss";
    }

    @PostMapping
    public String testController(@RequestBody String name) {
        return "Lenguages controller works, " + name + "!";
    }

    @PostMapping(value = "/get")
    public LenguageDTO queryLenguage(@RequestBody LenguageDTO lenguageDTO) { return lenguageService.queryLenguage(lenguageDTO); }

    @GetMapping(value = "/getAll")
    public List<LenguageDTO> queryAllLenguages() { return lenguageService.queryAllLenguages(); }

    @PostMapping(value = "/add")
    public int addLenguage(@RequestBody LenguageDTO lenguageDTO) { return lenguageService.insertLenguage(lenguageDTO);}

    @PutMapping(value= "/update")
    public int updateLenguage(@RequestBody LenguageDTO lenguageDTO) { return lenguageService.updateLenguage(lenguageDTO);}

    @DeleteMapping(value = "/delete")
    public int deleteLenguage(@RequestBody LenguageDTO lenguageDTO) { return lenguageService.deleteLenguage(lenguageDTO);}
}
