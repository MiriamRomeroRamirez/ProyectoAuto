package com.example.autos;
import java.time.LocalDate;

public class auto {
    private String brand, model;
    private Integer year;


    public auto (String brand_, String model_, Integer year_) {
        this.brand = brand_;
        this.model = model_;
        this.year = year_;
    }

    public auto(){
        this.brand = "VW";
        this.model = "Sedan";
        this.year = 1968;
    }


    public String toString() {
        return "\nInfo automovil: " +
                "\n\tMarca: " + brand +
                "\n\tModelo: " + model +
                "\n\tAnio: " + year;
    }

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if(this.year<year){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
}