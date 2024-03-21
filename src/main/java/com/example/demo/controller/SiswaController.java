package com.example.demo.controller;

import com.example.demo.model.SiswaModel;
import com.example.demo.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/belajar-spring/api/siswa")
public class SiswaController {

    @Autowired
    private SiswaService siswaService;

//    Get seluruh data yang ada dalam database
    @GetMapping("/all")
    public ResponseEntity<List<SiswaModel>> getAllData(){
        List<SiswaModel> siswaModels = siswaService.getAllData();
        return new ResponseEntity<>(siswaModels, HttpStatus.OK);
    }

//    Get perID
    @GetMapping("/by-id/{id}")
    public ResponseEntity<SiswaModel> getById(@PathVariable Long id) {
        Optional<SiswaModel> siswaModel = siswaService.getById(id);
        return siswaModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

//    Create / post
    @PostMapping("/add")
    public ResponseEntity<SiswaModel> createData(@RequestBody SiswaModel siswaModel){
        SiswaModel newData = siswaService.createData(siswaModel);
        return new ResponseEntity<>(newData, HttpStatus.CREATED);
    }

//    Update / PUT
    @PutMapping("/ubah/{id}")
    public ResponseEntity<SiswaModel> updateData(@PathVariable Long id, @RequestBody SiswaModel siswaModel){
        Optional<SiswaModel> existingData = siswaService.getById(id);
        if (existingData.isPresent()) {
            siswaModel.setId(id);
            SiswaModel updatedData = siswaService.updateData(siswaModel);
            return new ResponseEntity<>(updatedData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //    Hapus / Delete
    @DeleteMapping("/hapus/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
        if (siswaService.existsById(id)) {
            siswaService.deleteData(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
