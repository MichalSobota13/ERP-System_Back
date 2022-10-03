package com.example.skBackend.controller;

import com.example.skBackend.entity.Operator;
import com.example.skBackend.entity.QuantityType;
import com.example.skBackend.repository.OperatorRepository;
import com.example.skBackend.repository.QuantityTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {
    private final QuantityTypeRepository quantityTypeRepository;

    @PostMapping("/quantity_types")
    public QuantityType newQuantityType (@RequestBody QuantityType newQuantityType){
        return quantityTypeRepository.save(newQuantityType);
    }

    @GetMapping("/quantity_types")
    public List<QuantityType> listQuantityType(){
        return quantityTypeRepository.findAll();
    }

    @DeleteMapping("/quantity_types")
    public ResponseEntity deleteQuantityType(@RequestBody Long idQuantityType){
        quantityTypeRepository.deleteById(idQuantityType);
        return ResponseEntity.ok().build();
    }
}
