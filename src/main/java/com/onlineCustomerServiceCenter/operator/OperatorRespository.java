package com.onlineCustomerServiceCenter.operator;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OperatorRespository extends JpaRepository<Operator,Integer> {
    Optional< OperatorLoginDto> findOperatorByEmail(String email);
}
