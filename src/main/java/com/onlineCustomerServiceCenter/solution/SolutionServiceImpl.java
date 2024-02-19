package com.onlineCustomerServiceCenter.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService{

    @Autowired
    private  SolutionRepository solutionRepository;

    @Override
    public Solution createSolution(Solution newsolution) {
        return this.solutionRepository.save(newsolution);
    }

}
