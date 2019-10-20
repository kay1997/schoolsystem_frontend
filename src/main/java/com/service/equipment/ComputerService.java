package com.service.equipment;

import com.domain.equipment.Computer;
import com.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComputerService {

    @Autowired
    private ComputerRepository repo;

    public List<Computer> listAll(){
        return repo.findAll();
    }

    public void save(Computer computer)
    {
        repo.save(computer);
    }

    public Computer get(String id)
    {
        return  repo.findById(id).get();
    }

    public void delete(String id)
    {
        repo.deleteById(id);
    }
}
