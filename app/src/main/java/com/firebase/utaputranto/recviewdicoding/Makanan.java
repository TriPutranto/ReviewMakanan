package com.firebase.utaputranto.recviewdicoding;

public class Makanan {
    private String nama, asal, profilImg, backdropImg,
            porsi, kalori, karbo, lemak, protein;

    public Makanan(String nama, String asal, String profilImg, String backdropImg, String porsi, String kalori, String karbo, String lemak, String protein) {
        this.nama=nama;
        this.asal=asal;
        this.profilImg=profilImg;
        this.backdropImg=backdropImg;
        this.porsi=porsi;
        this.kalori=kalori;
        this.karbo=karbo;
        this.lemak=lemak;
        this.protein=protein;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getProfilImg() {
        return profilImg;
    }

    public void setProfilImg(String profilImg) {
        this.profilImg = profilImg;
    }

    public String getBackdropImg() {
        return backdropImg;
    }

    public void setBackdropImg(String backdropImg) {
        this.backdropImg = backdropImg;
    }

    public String getPorsi() {
        return porsi;
    }

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    public String getKalori() {
        return kalori;
    }

    public void setKalori(String kalori) {
        this.kalori = kalori;
    }

    public String getKarbo() {
        return karbo;
    }

    public void setKarbo(String karbo) {
        this.karbo = karbo;
    }

    public String getLemak() {
        return lemak;
    }

    public void setLemak(String lemak) {
        this.lemak = lemak;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
}
