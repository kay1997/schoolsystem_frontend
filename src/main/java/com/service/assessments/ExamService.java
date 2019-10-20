package com.service.assessments;

import com.domain.assessments.Exam;
import com.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExamService {

    @Autowired
    private ExamRepository repo;

    public List<Exam> listAll() {
        return repo.findAll();
    }

    public void save(Exam exam) {
        repo.save(exam);
    }

    public Exam get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
