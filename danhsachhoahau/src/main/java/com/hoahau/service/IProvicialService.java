package com.hoahau.service;

import com.hoahau.model.Miss;
import com.hoahau.model.Provincial;

import java.util.List;

public interface IProvicialService {
    List<Provincial> findAll();

    void add(Provincial provincial);


    Miss findById(int id);

    void  update(int id, Provincial provincial);

    void remove(int id);
}
