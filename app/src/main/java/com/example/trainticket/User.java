package com.example.trainticket;
import java.io.Serializable;

public class User implements Serializable {

    // поля
    private String nameId;
    private String depPoint;
    private String arrPoint;
    private String depTime;
    private String arrTime;
    private String ticketPrice;

    // конструктор


    public User(String nameId, String depPoint, String arrPoint, String depTime, String arrTime, String ticketPrice) {
        this.nameId = nameId;
        this.depPoint = depPoint;
        this.arrPoint = arrPoint;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.ticketPrice = ticketPrice;
    }

    // переопределение метода toString


    @Override
    public String toString() {
        return  "Вы успешно оформили железнодорожный билет \n" + "\n" +
                "Данные Вашего железнодорожного билета: \n" + "\n" +
                "Идентификатор пассажира:  " + nameId + "\n" + "\n" +
                "Место отправления поезда:  " + depPoint + "\n" +
                "Место прибытия поезда:  " + arrPoint + "\n" + "\n" +
                "Время отправления поезда:  " + depTime + "\n" +
                "Время прибытия поезда:  " + arrTime + "\n" + "\n" +
                "Стоимость билета - " + ticketPrice;
    }
}