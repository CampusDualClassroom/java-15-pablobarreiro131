package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private String localizacion;
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ").append(getLocation()).append(", Caducidad: ").append(getFormattedDate(getExpirationDate()));
        return builder.toString();
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Object getExpirationDate() {
        return this.expirationDate;
    }

    public String getFormattedDate(Object expirationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(expirationDate);
    }
}
