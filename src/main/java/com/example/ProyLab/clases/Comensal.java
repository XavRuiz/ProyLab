package com.example.ProyLab.clases;

/**
 * Created by alumno on 12/07/2017.
 */
public class Comensal {

    private String nomComensal;
    private String apeComensal;
    private int visitas;

    public Comensal(String nomComensal, String apeComensal, int visitas) {
        this.nomComensal = nomComensal;
        this.apeComensal = apeComensal;
        this.visitas = visitas;
    }

    public String getNomComensal() {
        return nomComensal;
    }

    public void setNomComensal(String nomComensal) {
        this.nomComensal = nomComensal;
    }

    public String getApeComensal() {
        return apeComensal;
    }

    public void setApeComensal(String apeComensal) {
        this.apeComensal = apeComensal;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }
}
