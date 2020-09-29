package com.hoahau.service;

import com.hoahau.model.Miss;
import com.hoahau.model.Provincial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvincialServiceImpl implements IProvicialService {
    private static Map<Integer, Provincial> provincialMap;
    static {
        provincialMap = new HashMap<>();
        provincialMap.put(1,new Provincial(1,"Ha Noi"));
        provincialMap.put(2,new Provincial(2,"Hue"));
        provincialMap.put(3,new Provincial(3,"Da Nang"));
        provincialMap.put(4,new Provincial(4,"Nha Trang"));
        provincialMap.put(5,new Provincial(5,"Vung Tau"));
        provincialMap.put(6,new Provincial(6,"Ho Chi Minh"));
    }

    @Override
    public List<Provincial> findAll()  {
        return new ArrayList<>(provincialMap.values());
    }

    @Override
    public void add(Provincial provincial) {

    }

    @Override
    public Miss findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Provincial provincial) {

    }

    @Override
    public void remove(int id) {

    }
}
