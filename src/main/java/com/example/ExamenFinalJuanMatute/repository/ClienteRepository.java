package com.example.ExamenFinalJuanMatute.repository;

import com.example.ExamenFinalJuanMatute.modelo.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository <Cliente, String>{

    Cliente findBynProyecto(long nProyecto);
}
