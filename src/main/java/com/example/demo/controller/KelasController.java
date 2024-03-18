//package com.example.demo.controller;
//
//import com.example.demo.model.KelasModel;
//import com.example.demo.service.KelasService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/data_kelas")
//
//public class KelasController {
//    @Autowired
//    private KelasService kelasService;
//
////    Get seluruh data yang ada dalam database
//    @GetMapping
//    public ResponseEntity<List<KelasModel>> getAllData(){
//        List<KelasModel> kelasModels = kelasService.getAllData();
//        return ResponseEntity.ok(kelasModels);
//    }
//
////    Get perID
//    @GetMapping("/{id}")
//    public ResponseEntity<KelasModel> getById(@PathVariable Long id) {
//        Optional<KelasModel> kelasModel = kelasService.getById(id);
//        return kelasModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
////    Create / post
//    @PostMapping
//    public ResponseEntity<KelasModel> createData(@RequestBody KelasModel kelasModel){
//        KelasModel newData = kelasService.createData(kelasModel);
//        return new ResponseEntity<>(newData, HttpStatus.CREATED);
//    }
//
////    Update / Put
//    @PutMapping("/{id}")
//    public ResponseEntity<KelasModel> updateData(@PathVariable Long id, @RequestBody KelasModel kelasModel){
//        Optional<KelasModel> existingData = kelasService.getById(id);
//        if (existingData.isPresent()) {
//            kelasModel.setId(id);
//            KelasModel updatedData = kelasService.updateData(kelasModel);
//            return new ResponseEntity<>(updatedData, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
////    Hapus / Delete
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
//        if (kelasService.existsById(id)) {
//            kelasService.deleteDataById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
