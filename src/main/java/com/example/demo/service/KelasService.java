//package com.example.demo.service;
//
//import com.example.demo.model.KelasModel;
//import com.example.demo.repository.KelasRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class KelasService {
//    private final KelasRepository kelasRepository;
//
//    @Autowired
//    public KelasService(KelasRepository kelasRepository) {
//        this.kelasRepository = kelasRepository;
//    }
//
////    Mengambil seluruh data yang ada di dalam database
//    public List<KelasModel> getAllData() {
//        return kelasRepository.findAll();
//    }
//
////    get perID
//    public Optional<KelasModel> getById(Long id) {
//        return kelasRepository.findById(id);
//    }
//
////    Create / post
//    public KelasModel createData(KelasModel kelasModel) {
//        return kelasRepository.save(kelasModel);
//    }
//
////    Update / PUT
//    public KelasModel updateData(KelasModel kelasModel) {
//        return kelasRepository.save(kelasModel);
//    }
//
////    hapus / delete data perID
//    public void deleteDataById(Long id) {
//        kelasRepository.deleteById(id);
//    }
//
////    pengecekan data apakah data siswa sudah sesuai perID
//    public boolean existsById(Long id) {
//        return kelasRepository.existsById(id);
//    }
//}
//
//
