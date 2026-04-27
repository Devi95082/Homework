package com.mycompany.transportsystem;

public class Delivery 
{   
    String shopName;
    int distance;
    String status;

    public Delivery(String shopName, int distance)
    {
        this.shopName = shopName;
        this.distance = distance;
        this.status = "pending";
    }
}
