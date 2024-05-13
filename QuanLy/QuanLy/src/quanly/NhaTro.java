/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import javax.swing.JTextArea;

public class NhaTro {

    private int thangThueTro;
    private int namThueTro;
    private String loaiPhong;
    private int giaPhongA;
    private int giaPhongB;
    private int giaPhongC;
    private String name;
    private String quequan;
    private int age;
    private int cmnd;
    private int ThangTra;
    private int NamTra;
    private int soThang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
    public int getThangTra() {
        return ThangTra;
    }

    public void setThangTra() {
        this.ThangTra = ThangTra;
    }

    public int getNamTra() {
        return NamTra;
    }

    public void setNamTra() {
        this.NamTra = NamTra;
    }

    public int getNamThueTro() {
        return namThueTro;
    }

    public void setNamThueTro(int namThueTro) {
        this.namThueTro = namThueTro;
    }

    public int getThangThueTro() {
        return thangThueTro;
    }

    public void setThangThueTro(int thangThueTro) {
        this.thangThueTro = thangThueTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhongA() {
        return giaPhongA;
    }

    public void setGiaPhongA(int giaPhongA) {
        this.giaPhongA = giaPhongA;
    }

    public int getGiaPhongB() {
        return giaPhongB;
    }

    public void setGiaPhongB(int giaPhongB) {
        this.giaPhongB = giaPhongB;
    }

    public int getGiaPhongC() {
        return giaPhongC;
    }

    public void setGiaPhongC(int giaPhongC) {
        this.giaPhongC = giaPhongC;
    }

    public NhaTro() {
    }

    public NhaTro(int thangThueTro, int namThueTro, String loaiPhong, int giaPhongA, int giaPhongB, int giaPhongC, String name, String quequan, int age, int cmnd, int ThangTra, int NamTra, int soThang) {
        this.thangThueTro = thangThueTro;
        this.namThueTro = namThueTro;
        this.loaiPhong = loaiPhong;
        this.giaPhongA = giaPhongA;
        this.giaPhongB = giaPhongB;
        this.giaPhongC = giaPhongC;
        this.name = name;
        this.quequan = quequan;
        this.age = age;
        this.cmnd = cmnd;
        this.ThangTra = ThangTra;
        this.NamTra = NamTra;
        this.soThang = soThang;
    }

    
    @Override
    public String toString() {
        if(getLoaiPhong().equals("a") || getLoaiPhong().equals("A"))
            return "NhaTro{" + "name=" + name + ", quequan=" + quequan + ", age=" + age + ", cmnd=" + cmnd  + ", thangThueTro=" + getThangThueTro() + ", namThueTro=" + namThueTro + ", loaiPhong=" + loaiPhong + ", giaPhongA=" + "2.500.000" + '}';
        else if(getLoaiPhong().equals("b") || getLoaiPhong().equals("B"))
            return "NhaTro{" + "name=" + name + ", quequan=" + quequan + ", age=" + age + ", cmnd=" + cmnd  + ", thangThueTro=" + thangThueTro + ", namThueTro=" + namThueTro + ", loaiPhong=" + loaiPhong + ", giaPhongB=" + "2.000.000" + '}';
        else if(getLoaiPhong().equals("c") || getLoaiPhong().equals("C"))
            return "NhaTro{" + "name=" + name + ", quequan=" + quequan + ", age=" + age + ", cmnd=" + cmnd  + ", thangThueTro=" + thangThueTro + ", namThueTro=" + namThueTro + ", loaiPhong=" + loaiPhong + ", giaPhongC=" + "1.500.000" + '}';
        else 
            return "Wrong information!!!";
    }


}
