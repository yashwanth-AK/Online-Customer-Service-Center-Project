package com.onlineCustomerServiceCenter.operator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private OperatorRespository operatorRespository;


    @Override
    public String loginOperator(String email, String password) {

        Optional<OperatorLoginDto> foundOperator= this.operatorRespository.findOperatorByEmail(email);
        if(foundOperator.isPresent()){
                if(foundOperator.get().getPassword().equals(password)){
                    return "Login Successfull";
                }else{
                    return "Password is Wrong";
                }

        }else {
            return "Account does not exits";
        }
    }

    @Override
    public Operator updateOperatorProfile(Operator updatedoperator) {
        return this.operatorRespository.save(updatedoperator);
    }
}
