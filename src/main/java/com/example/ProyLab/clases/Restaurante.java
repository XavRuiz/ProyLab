package com.example.ProyLab.clases;

import java.util.ArrayList;

/**
 * Created by alumno on 12/07/2017.
 */
public class Restaurante {

    private String nomRes;
    private String dirRes;
    private int trabRes;
    private int comensalesSimul;
    private boolean niños;
    private float catRes;

    private ArrayList<Comensal> comensalArrayList = null;

    public Restaurante (){
        comensalArrayList = new ArrayList<Comensal>();
    }

    public Restaurante(String nomRes, String dirRes, int trabRes, int comensalesSimul, boolean niños, float catRes) {
        this.nomRes = nomRes;
        this.dirRes = dirRes;
        this.trabRes = trabRes;
        this.comensalesSimul = comensalesSimul;
        this.niños = niños;
        this.catRes = catRes;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public String getDirRes() {
        return dirRes;
    }

    public void setDirRes(String dirRes) {
        this.dirRes = dirRes;
    }

    public int getTrabRes() {
        return trabRes;
    }

    public void setTrabRes(int trabRes) {
        this.trabRes = trabRes;
    }

    public int getComensalesSimul() {
        return comensalesSimul;
    }

    public void setComensalesSimul(int comensalesSimul) {
        this.comensalesSimul = comensalesSimul;
    }

    public boolean isNiños() {
        return niños;
    }

    public void setNiños(boolean niños) {
        this.niños = niños;
    }

    public float getCatRes() {
        return catRes;
    }

    public void setCatRes(float catRes) {
        this.catRes = catRes;
    }

    //Cálculo de impuesto

    public float impuesto(){
        float imp=0;

        /*for (Comensal comensal : comensalArrayList) {

            imp += comensal.getNomComensal();
        }*/
       //return (imp = comensalArrayList.size());

       return (imp=comensalesSimul*catRes);
    }

}
