package com.onlineCustomerServiceCenter.solution;

public interface SolutionService {
   Solution createSolution(String solutionDescription) throws SolutionException;
   Solution acceptSolution(Integer  solutionId) throws SolutionException;
}
