package com.coworking.controller;

import com.coworking.model.Reserva;
import com.coworking.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva>> getReservas() {
        List<Reserva> reservas = reservaService.listarReservas();
        return ResponseEntity.ok(reservas);
    }

    @PostMapping
    public ResponseEntity<Reserva> createReserva(@RequestBody Reserva reserva) {
        Reserva novaReserva = reservaService.salvarReserva(reserva);
        return ResponseEntity.status(201).body(novaReserva);
    }
}