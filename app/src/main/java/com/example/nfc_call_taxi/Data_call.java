package com.example.nfc_call_taxi;

public class Data_call {

    String name,phonenumber,time,Latitude,Longitude;
    String taxi_name,taxi_phonenumber,taxi_number;
    Data_call(){}
    Data_call(String name,String phonenumber,String time,String Latitude,String Longitude,String taxi_name,String taxi_phonenumber,String taxi_number){
        this.name=name;
        this.phonenumber=phonenumber;
        this.time = time;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.taxi_name=taxi_name;
        this.taxi_phonenumber=taxi_phonenumber;
        this.taxi_number=taxi_number;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getTime() {
        return time;
    }

    public String getTaxi_name() {
        return taxi_name;
    }

    public String getTaxi_number() {
        return taxi_number;
    }

    public String getTaxi_phonenumber() {
        return taxi_phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTaxi_name(String taxi_name) {
        this.taxi_name = taxi_name;
    }

    public void setTaxi_number(String taxi_number) {
        this.taxi_number = taxi_number;
    }

    public void setTaxi_phonenumber(String taxi_phonenumber) {
        this.taxi_phonenumber = taxi_phonenumber;
    }
}