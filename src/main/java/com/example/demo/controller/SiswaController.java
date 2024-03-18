//package com.example.demo.controller;
//
//import com.example.demo.model.SiswaModel;
//import com.example.demo.service.SiswaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/data_siswa")
//public class SiswaController {
//
//    @Autowired
//    private SiswaService siswaService;
//
////    Get seluruh data yang ada dalam database
//    @GetMapping
//    public ResponseEntity<List<SiswaModel>> getAllData(){
//        List<SiswaModel> siswaModels = siswaService.getAllData();
//        return new ResponseEntity<>(siswaModels, HttpStatus.OK);
//    }
//
////    Get perID
//    @GetMapping("/{id}")
//    public ResponseEntity<SiswaModel> getById(@PathVariable Long id) {
//        Optional<SiswaModel> siswaModel = siswaService.getById(id);
//        return siswaModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
////    Create / post
//    @PostMapping
//    public ResponseEntity<SiswaModel> createData(@RequestBody SiswaModel siswaModel){
//        SiswaModel newData = siswaService.createData(siswaModel);
//        return new ResponseEntity<>(newData, HttpStatus.CREATED);
//    }
//
////    Update / PUT
//    @PutMapping("/{id}")
//    public ResponseEntity<SiswaModel> updateData(@PathVariable Long id, @RequestBody SiswaModel siswaModel){
//        Optional<SiswaModel> existingData = siswaService.getById(id);
//        if (existingData.isPresent()) {
//            siswaModel.setId(id);
//            SiswaModel updatedData = siswaService.updateData(siswaModel);
//            return new ResponseEntity<>(updatedData, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    //    Hapus / Delete
//    @DeleteMapping("/hapus/{id}")
//    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
//        if (siswaService.existsById(id)) {
//            siswaService.deleteData(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<SiswaModel> patchData(@PathVariable Long id, @RequestBody SiswaModel updatedData) {
//        Optional<SiswaModel> existingDataOptional = siswaService.getById(id);
//        if (existingDataOptional.isPresent()) {
//            SiswaModel existingData = existingDataOptional.get();
//            if (updatedData.getNama_siswa() != null) {
//                existingData.setNama_siswa(updatedData.getNama_siswa());
//            }
//            if (updatedData.getUmur() != 0) {
//                existingData.setUmur(updatedData.getUmur());
//            }
//            if (updatedData.getAlamat() != null) {
//                existingData.setAlamat(updatedData.getAlamat());
//            }
//            if (updatedData.getKelas() != null) {
//                existingData.setKelas(updatedData.getKelas());
//            }
//            if (updatedData.getJurusan() != null) {
//                existingData.setJurusan(updatedData.getJurusan());
//            }
//            SiswaModel patchedData = siswaService.updateData(existingData);
//            return new ResponseEntity<>(patchedData, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
