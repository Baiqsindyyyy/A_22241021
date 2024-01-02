package com.tutorial;

// class tanpa konstuktor
class Polos {
        String dataString;
    int dataInteger;
}


// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    
    // // Membuat konstruktor
    // Mahasiswa() {
        
    // }

    //membuat konstruktor dengan parameter
    Mahasiswa( String inputNama, String inputNIM, String inputProdi) {
     nama = inputNama;
     nim = inputNIM;
     prodi = inputProdi; 
     
     System.out.println("Nama : " + nama) ;
     System.out.println("NIM :" + nim) ;
     System.out.println("Prodi :" + prodi) ;
    }
     
    
} 





public class Main {
        public static void main(String args []) {
             // intansiasi objek dari class polos
    //     Polos pls = new Polos ();
       
    //    // isi ciri pada objek polos

    //   pls.dataString = "POLOS";
    //   pls.dataInteger = 10;

    //    // cetak data
    //  System.out.println("Isi Data Staring :" + pls.dataString);
    //  System.out.println("Isi Data Integer :" + pls.dataInteger);
     
        
     Mahasiswa mhs1 = new Mahasiswa("sindy", "22241021", "pti");


      // memanggil konstruktor

    }
   
 
}

