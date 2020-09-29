package com.hoahau.service;

import com.hoahau.model.Miss;

import java.util.List;

public interface IMissService {
    List<Miss> findAll();

    void add(Miss miss);



    Miss findById(int id);

    void  update(int id, Miss miss);

    void remove(int id);

}
