package com.coworking.controller;

import com.coworking.model.Espaco;
import com.coworking.service.EspacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/espacos")
public class EspacoController {

    @Autowired
    private EspacoService espacoService;

    @GetMapping
    public ResponseEntity<List<Espaco>> getEspacos() {
        List<Espaco> espacos = espacoService.listarEspacos();
        return ResponseEntity.ok(espacos);
    }

    @PostMapping
    public ResponseEntity<Espaco> createEspaco(@RequestBody Espaco espaco) {
        Espaco novoEspaco = espacoService.salvarEspaco(espaco);
        return ResponseEntity.status(201).body(novoEspaco);
    }
}