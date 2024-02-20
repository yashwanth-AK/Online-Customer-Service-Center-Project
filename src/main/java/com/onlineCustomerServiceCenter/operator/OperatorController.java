package com.onlineCustomerServiceCenter.operator;

import com.onlineCustomerServiceCenter.customer.Customer;
import com.onlineCustomerServiceCenter.issue.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OperatorController {
    @Autowired
    private OperatorService operatorService;
    @GetMapping("operator")
    public String loginOperator(@RequestParam OperatorLoginDto operatorLoginDto){
        return this.operatorService.loginOperator(operatorLoginDto.getEmail(),operatorLoginDto.getPassword());
    }
    @PutMapping("operator")
    public Operator updateOperatorProfile(@RequestBody Operator updatedoperator){
        return this.operatorService.updateOperatorProfile(updatedoperator);
    }
    @PostMapping("operator/solution")
    public Issue addIssueSolution(@RequestBody IssueSolutionDto issueSolutionDto){
        return this.operatorService.addIssueSolution(issueSolutionDto.getIssueId(),issueSolutionDto.getSolutionDescription());
    }

}
