package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.model.Kota;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wilayah-api")
public interface WilayahService {

    @GetMapping("/api/kota/findById/{kotaId}")
    public ResponseEntity<Kota> findByKotaId(@PathVariable("kotaId") String kotaId);
}
