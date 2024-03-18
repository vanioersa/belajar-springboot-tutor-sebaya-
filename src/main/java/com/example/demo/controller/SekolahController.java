//package com.example.demo.controller;
//
//import com.example.demo.model.KelasModel;
//import com.example.demo.model.SekolahModel;
//import com.example.demo.service.SekolahService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/data_sekolah")
//public class SekolahController {
//    @Autowired
//    private SekolahService sekolahService;
//
////    Get seluruh data yang ada dalam database
//    @GetMapping
//    public ResponseEntity<List<SekolahModel>> getAllData() {
//        List<SekolahModel> sekolahModels = sekolahService.getAllData();
//        return new ResponseEntity<>(sekolahModels, HttpStatus.OK);
//    }
//
////    Get perID
//    @GetMapping("/{id}")
//    public ResponseEntity<SekolahModel> getById(@PathVariable Long id) {
//        Optional<SekolahModel> sekolahModel = sekolahService.getById(id);
//        return sekolahModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
////    Create / post
//    @PostMapping
//    public ResponseEntity<SekolahModel> createData(@RequestBody SekolahModel sekolahModel){
//        SekolahModel newData = sekolahService.createData(sekolahModel);
//        return new ResponseEntity<>(newData, HttpStatus.CREATED);
//    }
//
////    Update / Put
//    @PutMapping("/{id}")
//    public ResponseEntity<SekolahModel> updateData(@PathVariable Long id, @RequestBody SekolahModel sekolahModel){
//        Optional<SekolahModel> existingData = sekolahService.getById(id);
//        if (existingData.isPresent()) {
//            sekolahModel.setId(id);
//            SekolahModel updatedData = sekolahService.updateData(sekolahModel);
//            return new ResponseEntity<>(updatedData, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
////    Hapus / Delete
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
//        if (sekolahService.existsById(id)) {
//            sekolahService.deleteDataById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
