package com.onlineCustomerServiceCenter.solution;

public interface SolutionService {
   Solution createSolution(String solutionDescription);
   Solution acceptSolution(String  solutionId);
}
