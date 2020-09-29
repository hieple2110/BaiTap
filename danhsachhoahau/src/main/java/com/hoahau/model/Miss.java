package com.hoahau.model;

public class Miss {
    private int id;
    private String name;
    private String brithday;
    private String address;
    private String phone;
    private String email;
    private String passport;
    private String job;
    private String educational;
    private String nation;
    private String studyunit;
    private float heigth;
    private float weigth;
    private String gift;
    private String image;
    private String provincial;
    private String approval="No";
    public Miss() {
    }

    public Miss(int id, String name, String brithday, String address, String phone, String email, String passport, String job, String educational, String nation, String studyunit, float heigth, float weigth, String gift, String image, String provincial,String approval) {
        this.id = id;
        this.name = name;
        this.brithday = brithday;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.passport = passport;
        this.job = job;
        this.educational = educational;
        this.nation = nation;
        this.studyunit = studyunit;
        this.heigth = heigth;
        this.weigth = weigth;
        this.gift = gift;
        this.image = image;
        this.provincial = provincial;
        this.approval = approval;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStudyunit() {
        return studyunit;
    }

    public void setStudyunit(String studyunit) {
        this.studyunit = studyunit;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }
}
