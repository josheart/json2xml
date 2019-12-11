package service;

import model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    @Autowired
    private Candidate candidate;

    public void printCandidateName(){
        candidate.setName("Omr");
        System.out.println(candidate.getName());
    }
}
