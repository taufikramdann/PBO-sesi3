impor  jawa . util . Pemindai ;
 kelas  publik Sesi3 {
    public  static  void  main ( String [] args ){

        String  nama , nim ;

        nilai  ; _
        
         kelas karakter ;
         Masukan pemindai = Pemindai baru  ( Sistem . in );

  Sistem . keluar . println ( "====== Menghitung Nilai Mahasiswa======\n" );

        Sistem . keluar . print ( "Masukan Nama : " );

        nama = masukan . baris berikutnya ();

        Sistem . keluar . print ( "Masukan NIM : " );

        nim = masukan . baris berikutnya ();

        Sistem . keluar . print ( "Nilai tugas : " );

        nilai = masukan . nextInt ();
        if ( nilai >= 85 && nilai <= 100 ){
            nilai = 'A' ;
        }
        lain  jika ( nilai > 75 && nilai < 85 ){
            nilai = 'B' ;
        }
        lain  jika ( nilai > 65 && nilai < 75 ){
            nilai = 'C' ;
        }
        lain  jika ( nilai > 50 && nilai < 65 ){
            nilai = 'D' ;
        }
        lain {
            nilai = 'E' ;
        }
        if ( nilai == 'A' || nilai == 'B' || nilai == 'C' ){
            Sistem . keluar . println ( "\n" + nama + " dengan NIM " + nim + " memiliki nilai akhir " + nilai + " = (" + grade + ")" + ""
                    + "\n dan dinyatakan Lulus" );
        }
        lain {
            Sistem . keluar . println ( "\n" + nama + " dengan NIM " + nim + " memiliki nilai akhir " + nilai + " = (" + grade + ")" + ""
                    + "\n dan dinyatakan Tidak Lulus" );
        }  
    }

}
