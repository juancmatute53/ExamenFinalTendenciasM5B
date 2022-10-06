package com.example.ExamenFinalJuanMatute.controller;

import com.example.ExamenFinalJuanMatute.modelo.Cliente;
import com.example.ExamenFinalJuanMatute.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService studentService;

    @GetMapping(value = "/")
    public List<Cliente> getAllStudent(){
        return studentService.findAll();
    }

    @GetMapping(value = "/{nProyecto}")
    public Cliente findByNStudent (@PathVariable("cliente") Long nProyecto ){
        return studentService.findBynProyecto(nProyecto);
    }


    @PostMapping(value = "/crear")
    public ResponseEntity<?> SaveOrUpdateStudent(@RequestBody Cliente cliente){
        studentService.saveOrUpdateStudent(cliente);
        return new ResponseEntity("Cliente creado exitosamente", HttpStatus.OK);
    }

    @DeleteMapping(value = "{nProyecto}")
    public void DeleteStudent (@PathVariable Long nProyecto){
        studentService.deleteStudent(studentService.findBynProyecto(nProyecto).getId());
    }
}
