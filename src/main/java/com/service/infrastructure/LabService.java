package com.service.infrastructure;

import com.domain.infrastructure.Lab;
import com.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LabService {

    @Autowired
    private LabRepository repo;

    public List<Lab> listAll(){
        return repo.findAll();
    }

    public void save(Lab lab)
    {
        repo.save(lab);
    }

    public Lab get(String id)
    {
        return  repo.findById(id).get();
    }

    public void delete(String id)
    {
        repo.deleteById(id);
    }
}
