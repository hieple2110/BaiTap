package com.hoahau.service;

import com.hoahau.model.Miss;
import com.hoahau.model.Provincial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissServiceImpl implements IMissService {
    private static Map<Integer, Miss> misss;


    static {
        misss = new HashMap<>();
        misss.put(1, new Miss(1, "dao ha", "12/10/2000", "Ha Noi", "09812345678", "dao@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "daoha.jpg", "Ha Noi","No"));
        misss.put(2, new Miss(2, "hoang phuong", "01/10/2000", "Hue", "0985555555", "phuong@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "hoang phuong.jpg", "Hue","No"));
        misss.put(3, new Miss(3, "huong ly", "12/09/2000", "Da Namg", "09866666666", "ly@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "huong ly.jpg", "Da Nang","No"));
        misss.put(4, new Miss(4, "kim duyen", "14/2/2000", "Nha Trang", "09877777777", "duyen@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "kimduyen.jpg", "Nha Trang","No"));
        misss.put(5, new Miss(5, "thu trang", "12/7/2000", "Vung Tau", "09877766655", "trang@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "thutrang.jpg", "Vung tau","No"));
        misss.put(6, new Miss(6, "thuy van", "12/6/2000", "Ho Chi Minh", "09812345678", "van@gmail.com", "123456789", "Sinh vien", "Dai hoc", "Kinh", "DHHue", 178, 45, "Ca hat", "thuyvan.jpg", "Ho Chi Minh","No"));
    }


    @Override
    public List<Miss> findAll() {
        return new ArrayList<>(misss.values());
    }


    @Override
    public void add(Miss miss) {
        misss.put(miss.getId(), miss);
    }

    @Override
    public Miss findById(int id) {
        return misss.get(id);
    }

    @Override
    public void update(int id, Miss miss) {
        misss.put(id, miss);

    }

    @Override
    public void remove(int id) {
     Miss m = misss.get(id);
     if (m.getApproval().equals("No")){
         misss.remove(id);
     }
    }



}
