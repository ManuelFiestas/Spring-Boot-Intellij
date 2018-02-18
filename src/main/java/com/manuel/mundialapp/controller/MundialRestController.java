package com.manuel.mundialapp.controller;

import com.manuel.mundialapp.model.Pais;
import com.manuel.mundialapp.services.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class MundialRestController {

    @Autowired
     IPaisService paisService;

    @GetMapping("/paises")
    public List<Pais> getPaises() {
        return paisService.getPaises();
    }
}