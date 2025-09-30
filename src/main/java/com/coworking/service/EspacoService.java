package com.coworking.service;

import com.coworking.model.Espaco;
import com.coworking.repository.EspacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacoService {

    @Autowired
    private EspacoRepository espacoRepository;

    public List<Espaco> listarEspacos() {
        return espacoRepository.findAll();
    }

    public Espaco salvarEspaco(Espaco espaco) {
        return espacoRepository.save(espaco);
    }

    public void deletarEspaco(Long id) {
        espacoRepository.deleteById(id);
    }

    public Espaco buscarEspacoPorId(Long id) {
        return espacoRepository.findById(id).orElse(null);
    }
}