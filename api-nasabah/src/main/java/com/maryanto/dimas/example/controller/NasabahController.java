package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.dto.NasabahDto;
import com.maryanto.dimas.example.model.Kota;
import com.maryanto.dimas.example.model.MessageError;
import com.maryanto.dimas.example.model.Nasabah;
import com.maryanto.dimas.example.service.WilayahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/nasabah")
public class NasabahController {

    private WilayahService serviceKota;

    @Autowired
    public NasabahController(WilayahService serviceKota) {
        this.serviceKota = serviceKota;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerNasabah(@RequestBody @Validated NasabahDto.RegisterNasabah dto) {
        ResponseEntity<Kota> kotaResponse = this.serviceKota.findByKotaId(dto.getIdKota());
        Optional<Kota> kotaOptional = Optional.ofNullable(kotaResponse.getBody());

        if (kotaOptional.isEmpty()) return ResponseEntity.badRequest().body(MessageError.builder()
                .statusCode(11)
                .message("ID Kota is invalid!")
                .build());

        return ResponseEntity.ok(Nasabah.builder()
                .nik(dto.getNik())
                .namaLengkap(dto.getNamaLengkap())
                .kota(kotaOptional.get())
                .alamat(dto.getAlamat())
                .build());
    }
}
