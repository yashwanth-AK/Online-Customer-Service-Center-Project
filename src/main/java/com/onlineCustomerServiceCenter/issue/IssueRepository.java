package com.onlineCustomerServiceCenter.issue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {

    //public List<Issue> findAllByType(String type);

}
