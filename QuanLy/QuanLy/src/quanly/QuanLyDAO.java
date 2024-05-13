package quanly;


import java.util.List;
import java.util.ArrayList;
import quanly.NhaTro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class QuanLyDAO {
    List<NhaTro> nhatro = new ArrayList<>();
    
    public int add(NhaTro nt)
    {
        nhatro.add(nt);
        return 1;
    }
    
    public int count()
    {
        return nhatro.size();
    }
    
    public void getAll()
    {
        for(NhaTro nt : nhatro)
        {
            System.out.println(nt.toString());
        }
        System.out.println("--------------------------");
    }
    
    public NhaTro findbyCMND(int cmnd)
    {
        for(NhaTro nt : nhatro)
        {
            if(nt.getCmnd() == cmnd)
            {
                return nt;
            }
        }
        return null;
    }
    
    public int update(NhaTro nt1)
    {
        for(NhaTro nt : nhatro)
        {
            if(nt.getCmnd() == nt1.getCmnd())
            {
                nt.setName(nt1.getName());
                nt.setAge(nt1.getAge());
                nt.setQuequan(nt1.getQuequan());
                nt.setCmnd(nt1.getCmnd());
                nt.setLoaiPhong(nt1.getLoaiPhong());
                return 1;
            }
        }
        return -1;
    }
    
    public int delete(int cmnd)
    {
        NhaTro nt = findbyCMND(cmnd);
        if(nt != null)
        {
            nhatro.remove(nt);
            return 1;
        }
        return -1;
    }
    
    public NhaTro getCustomerByPosition(int pos)
    {
        return nhatro.get(pos);
    }
    

}
