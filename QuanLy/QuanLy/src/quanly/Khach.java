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
import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Khach {
    private String name;
    private String quequan;
    private int age;
    private int cmnd;

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

    public Khach() {
    }

    public Khach(String name, int age, String quequan, int cmnd) {
        this.name = name;
        this.quequan = quequan;
        this.age = age;
        this.cmnd = cmnd;
    }

//    public void inputKhach()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ho va ten: ");
//        name = sc.nextLine();
//        System.out.print("Nhap tuoi: ");
//        age = sc.nextInt();
//        System.out.print("Que quan: ");
//        sc.nextLine();
//        quequan = sc.nextLine();
//        System.out.print("Nhap CMND: ");
//        cmnd = sc.nextInt();
//    }
//
//    public void outputKhach()
//    {
//        System.out.println("Ho va ten khach hang: " + name);
//        System.out.println("Tuoi: " + age);
//        System.out.println("Que quan: " + quequan);
//        System.out.println("So CMND: " + cmnd);
//    }

    
    public String output() {
        return "Ten=" + name + ", quequan=" + quequan + ", age=" + age + ", cmnd=" + cmnd + ',';
    }
    
}
