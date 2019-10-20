package com.service.people;

import com.domain.people.Learner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.LearnerRepository;

import java.util.List;

@Service
@Transactional
public class LearnerService {

    @Autowired
    private LearnerRepository repo;

    public List<Learner> listAll(){
        return repo.findAll();
    }

    public void save(Learner learner)
    {
        repo.save(learner);
    }

    public Learner get(String id)
    {
        return  repo.findById(id).get();
    }

    public void delete(String id)
    {
        repo.deleteById(id);
    }

}
