package com.pluralsight;

class CellPhoneService {

    public static <Public> void main(String[] args) {

        CellPhoneService phone = new CellPhoneService();

        Public cellphone;{
            phone.serialNumber = 0;
            phone.model = "";
            phone.carrier = "";
            phone.phoneNumber = "";
            phone.owner = "";
        }
        System.out.println("Serial Number: " + phone.serialNumber);
        System.out.println("Model: " + phone.model);
        System.out.println("Carrier: " + phone.carrier);
        System.out.println("Phone Number: " + phone.phoneNumber);
        System.out.println("Owner: " + phone.owner);
    }

    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;
}




