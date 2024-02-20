package com.onlineCustomerServiceCenter.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolutionServiceImpl implements SolutionService{

    @Autowired
    private  SolutionRepository solutionRepository;


    @Override
    public Solution createSolution(String solutionDescription) {
        Solution solution=new Solution(solutionDescription);
        return this.solutionRepository.save(solution);
    }

    @Override
    public Solution acceptSolution(String solutionId) {
        Optional<Solution> foundSolution= this.solutionRepository.findById(Integer.parseInt(solutionId));
        if(foundSolution.isPresent()){
            Solution solution=foundSolution.get();
            solution.setSolutionAccepted(true);
            return this.solutionRepository.save(solution);
        }
        return null;
    }
}
