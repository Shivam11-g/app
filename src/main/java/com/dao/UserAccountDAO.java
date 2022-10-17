package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Item;
import com.model.UserAccount;

@Repository
public interface UserAccountDAO  extends JpaRepository<UserAccount,Integer> {

}
