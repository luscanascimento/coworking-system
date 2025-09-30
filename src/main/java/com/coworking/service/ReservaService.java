package com.coworking.service;

import com.coworking.model.Reserva;
import com.coworking.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    public Reserva salvarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // Outros métodos relacionados a reservas podem ser adicionados aqui
}