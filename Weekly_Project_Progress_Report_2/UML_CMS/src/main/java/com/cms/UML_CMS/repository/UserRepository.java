package com.cms.UML_CMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.UML_CMS.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
