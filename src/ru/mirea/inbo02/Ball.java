package ru.mirea.inbo02;
import javax.print.DocFlavor;
import java.lang.*;

public class Ball {
    String model;
    String color;
    int size;

    public Ball(String m, String c, int s){
        model = "Не указано";
        color = c;
        size = s;
    }

    public Ball(String m){
        model = m;
        color = "Не указано";
        size = 0;
    }

    public Ball(String m, String c ){
        model = m;
        color = c;
        size = 0;
    }

    public Ball(int s){
        model = "Не указано";
        color = "Не указано";
        size = s;
    }

    public Ball(){
        model = "Не указано";
        color = "Не указано";
        size = 0;
    }

    /////////

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

//////////////

    public int getSize(){
        return size;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

/////////////
    public void getALL (){
        System.out.println("Модель: "+model+"Цвет: "+color+"Размер "+size);
    }
}


