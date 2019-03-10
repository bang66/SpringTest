package com.aop_after_returning_annotation;


import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements  UserDao{
    @Override
    public void del() {
        System.out.println("----------del");
    }

    @Override
    public void add() {
        System.out.println("---------------add");
    }
}
