//package com.example.demo.service;
//
//import com.example.demo.model.KelasModel;
//import com.example.demo.model.SekolahModel;
//import com.example.demo.repository.SekolahRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SekolahService {
//    private final SekolahRepository sekolahRepository;
//
//    @Autowired
//    public SekolahService(SekolahRepository sekolahRepository){
//        this.sekolahRepository = sekolahRepository;
//    }
//
////    Mengambil seluruh data yang ada di dalam database
//    public List<SekolahModel>getAllData() {
//        return sekolahRepository.findAll();
//    }
//
////    get perID
//    public Optional<SekolahModel> getById(Long id) {
//        return sekolahRepository.findById(id);
//    }
//
////    Create / post
//    public SekolahModel createData(SekolahModel sekolahModel) {
//        return sekolahRepository.save(sekolahModel);
//    }
//
////    Update / PUT
//    public SekolahModel updateData(SekolahModel sekolahModel) {
//        return sekolahRepository.save(sekolahModel);
//    }
//
////    hapus / delete data perID
//    public void deleteDataById(Long id) {
//        sekolahRepository.deleteById(id);
//    }
//
////    pengecekan data apakah data siswa sudah sesuai perID
//    public boolean existsById(Long id) {
//        return sekolahRepository.existsById(id);
//    }
//}
