package com.android.learn.embed;

public class QuizHelp {

    public String aSoal [] = {
            "Manakah manfaat yang didapat dari Internet of Things?",
            "Berikut adalah beberapa mikrokontroller yang sering digunakan dalam embedded system, kecuali : ",
            "Berikut adalah beberapa teknik Image Processing yang biasa digunakan dalam pengenalan pola gambar, Kecuali : ",
            "Diantara Mikrokontroller berikut manakah Mikrokontroller yang cocok digunakan untuk pengolahan citra atau image dengan ukuran besar dan data rate yang tinggi?",
            "Jika hendak menguji sensor photodiode untuk mendeteksi garis pada aplikasi robot line follower, maka digunakan komponen apakah yang bertindak sebagai pemancarnya?"
    };

    public String aPilihan [][] = {
            {"Traffic and Transport System","School System","Agriculture System","Semua jawaban benar"},
            {"Arduino Uno","Raspberry Pi","Xilink","Arduino Lolipop"},
            {"Template Machin","PCA","eigenface","AADC"},
            {"Raspberry Pi","Arduino Uno","Intel Galilei","Arduino Nano"},
            {"Resistor","RTD","Dioda","Termisto"}
    };

    public String aJawaban [] = {
        "Semua jawaban benar","Arduino Lolipop","AADC","Raspberry Pi","Dioda"
    };

    public String getSoal(int a){
        String soal = aSoal[a];
        return soal;
    };

    public String getPilihan1 (int a){
        String pilihan1 = aPilihan[a][0];
        return pilihan1;
    };

    public String getPilihan2 (int a){
        String pilihan1 = aPilihan[a][1];
        return pilihan1;
    };

    public String getPilihan3 (int a){
        String pilihan1 = aPilihan[a][2];
        return pilihan1;
    };

    public String getPilihan4 (int a){
        String pilihan1 = aPilihan[a][3];
        return pilihan1;
    };

    public String getJawaban (int a){
        String jawaban = aJawaban[a];
        return jawaban;
    };

}
