package com.onlineCustomerServiceCenter.solution;

public interface SolutionService {

   Solution createSolution(Solution newsolution);

   Solution createSolution(String solutionDescription);
   Solution acceptSolution(String  solutionId);

}