package com.onlineCustomerServiceCenter.solution.service;

import com.onlineCustomerServiceCenter.solution.entity.Solution;
import com.onlineCustomerServiceCenter.solution.exceptions.SolutionException;

public interface SolutionService {
   Solution createSolution(String solutionDescription) throws SolutionException;
   Solution acceptSolution(String  solutionId) throws SolutionException;
}
