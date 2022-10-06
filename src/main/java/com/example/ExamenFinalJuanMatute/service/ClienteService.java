package com.example.ExamenFinalJuanMatute.service;

import com.example.ExamenFinalJuanMatute.modelo.Cliente;

import java.util.List;


public interface ClienteService {

    public List<Cliente> findAll();
    public Cliente findBynProyecto(long nProyecto);
    public void saveOrUpdateStudent (Cliente cliente);
    public void deleteStudent (String id);
}
