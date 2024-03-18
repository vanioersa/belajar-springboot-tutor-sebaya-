//package com.example.demo.service;
//
//import com.example.demo.model.SiswaModel;
//import com.example.demo.repository.SiswaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SiswaService {
//    private final SiswaRepository siswaRepository;
//
//    @Autowired
//    public SiswaService(SiswaRepository siswaRepository) {
//        this.siswaRepository = siswaRepository;
//    }
//
////    Mengambil seluruh data yang ada di dalam database
//    public List<SiswaModel> getAllData() {
//        return siswaRepository.findAll();
//    }
//
////    get perID
//    public Optional<SiswaModel> getById(Long id) {
//        return siswaRepository.findById(id);
//    }
//
////    Create / post
//    public SiswaModel createData(SiswaModel siswaModel) {
//        return siswaRepository.save(siswaModel);
//    }
//
////    Update / PUT
//    public SiswaModel updateData(SiswaModel siswaModel) {
//        return siswaRepository.save(siswaModel);
//    }
//
////    hapus / delete data perID
//    public void deleteData(Long id) {
//        siswaRepository.deleteById(id);
//    }
////    pengecekan data apakah data siswa sudah sesuai perID
//    public boolean existsById(Long id) {
//        return siswaRepository.existsById(id);
//    }
//
//
//}
