package com.service.admin;

import com.domain.admin.SchoolDetails;
import com.repository.SchoolDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SchoolDetailsService {

    @Autowired
    private SchoolDetailsRepository repo;

    public List<SchoolDetails> listAll() {
        return repo.findAll();
    }

    public void save(SchoolDetails school) {
        repo.save(school);
    }

    public SchoolDetails get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}