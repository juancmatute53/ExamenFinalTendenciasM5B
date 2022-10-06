package com.example.ExamenFinalJuanMatute.service;

import com.example.ExamenFinalJuanMatute.modelo.Cliente;
import com.example.ExamenFinalJuanMatute.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteRepository StudRepo;

    @Override
    public List<Cliente> findAll() {
        return StudRepo.findAll();
    }

    @Override
    public Cliente findBynProyecto(long nProyecto) {
        return StudRepo.findBynProyecto(nProyecto);
    }



    @Override
    public void saveOrUpdateStudent(Cliente cliente) {
        StudRepo.save(cliente);
    }

    @Override
    public void deleteStudent(String id) {
        StudRepo.deleteById(id);
    }

}
