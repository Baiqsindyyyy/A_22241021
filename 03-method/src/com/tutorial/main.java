package com.tutorial;

import java.net.NetworkInterface;

class Mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;


    // construktor dengan parameter
    Mahasiswa(String Nama, String Nim, String Prodi){
        this.nama = Nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    //method tanpa parameter dan tanpa return
    void show() {
       System.out.println("Nama : " + this.nama);
       System.out.println("NIM : " + this.nim);
       System.out.println("prodi : " + this.prodi);
    }

    // method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    // method dengan return dan parameter
    String sayHi(String pesan){
        return pesan + "halo" + this.nama;
    }


}
public class main {


public static void main(String[] args){
    // instansi objek
    Mahasiswa mhs1 = new Mahasiswa("sindy", "22241021s", "pti");
    
    mhs1.show();
    mhs1.setNama("sindy");
    mhs1.show();
    System.out.println(mhs1.getNama());

       String pesan = mhs1.sayHi("hai");
       System.out.println(pesan);

    

}
}


        
    

