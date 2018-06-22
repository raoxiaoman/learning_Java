package com.raohui.model;

public class Student {
    private String sno;

    private String sname;

    private Integer sage;

    private String sex;

    public Student(String sname, Integer sage, String sex) {
        this.sname = sname;
        this.sage = sage;
        this.sex = sex;
    }

    public Student(String sno, String sname, Integer sage, String sex) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}