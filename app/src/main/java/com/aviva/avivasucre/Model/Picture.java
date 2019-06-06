package com.aviva.avivasucre.Model;

public class Picture {

    private String picture;
    private String userName;
    private String primero;
    private String tiempo;

    public Picture(String picture, String userName, String primero, String tiempo){
        this.picture = picture;
        this.userName = userName;
        this.primero = primero;
        this.tiempo = tiempo;
    }

    public String getPicture(){
        return picture;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPrimero(){
        return primero;
    }
    public void setPrimero(String primero){
        this.primero = primero;
    }
    public String getTiempo(){
        return tiempo;
    }
    public void setTiempo(String tiempo){
        this.tiempo = tiempo;
    }

}