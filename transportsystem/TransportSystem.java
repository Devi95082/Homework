
package com.mycompany.transportsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TransportSystem 
{

  
    static Company company;
    static Vehicle vehicle;
    static Driver driver;
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Delivery> deliveries = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Transport Menu ---");
            System.out.println("1. Add Company");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Add Driver");
            System.out.println("4. Add Product Load");
            System.out.println("5. Add Shop Delivery");
            System.out.println("6. View All Trip Details");
            System.out.println("7. View Pending Deliveries");
            System.out.println("8. Mark Delivery Completed");
            System.out.println("9. Calculate Trip Amount");
            System.out.println("10. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Company Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String addr = sc.nextLine();
                    company = new Company(cname, addr);
                    break;

                case 2:
                    System.out.print("Enter Vehicle No: ");
                    String vno = sc.nextLine();
                    System.out.print("Enter Type: ");
                    String type = sc.nextLine();
                    vehicle = new Vehicle(vno, type);
                    break;

                case 3:
                    System.out.print("Enter Driver Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter License No: ");
                    String lic = sc.nextLine();
                    driver = new Driver(dname, lic);
                    break;

                case 4:
                    System.out.print("Enter Product Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    products.add(new Product(pname, qty));
                    break;

                case 5:
                    System.out.print("Enter Shop Name: ");
                    String shop = sc.nextLine();
                    System.out.print("Enter Distance (KM): ");
                    int km = sc.nextInt();
                    sc.nextLine();
                    deliveries.add(new Delivery(shop, km));
                    break;

                case 6:
                    System.out.println("\n--- Trip Details ---");
                    if (company != null)
                        System.out.println("Company: " + company.name);

                    if (vehicle != null)
                        System.out.println("Vehicle: " + vehicle.vehicleno);

                    if (driver != null)
                        System.out.println("Driver: " + driver.Name);

                    for (Delivery d : deliveries) {
                        System.out.println(d.shopName + " - " + d.distance + " KM - " + d.status);
                    }
                    break;

                case 7:
                    System.out.println("\nPending Deliveries:");
                    for (Delivery d : deliveries) {
                        if (d.status.equals("Pending")) {
                            System.out.println(d.shopName);
                        }
                    }
                    break;
                    
                case 8:
                    System.out.print("Enter Shop Name to Mark Completed: ");
                    String s = sc.nextLine();
                    for (Delivery d : deliveries) {
                        if (d.shopName.equalsIgnoreCase(s)) {
                            d.status = "Completed";
                            System.out.println("Updated!");
                        }
                    }
                    break;

                case 9:
                    System.out.print("Enter Rate per KM: ");
                    int rate = sc.nextInt();

                    int totalKM = 0;
                    for (Delivery d : deliveries) {
                        totalKM += d.distance;
                    }

                    int totalAmount = totalKM * rate;
                    System.out.println("Total Trip Amount: " + totalAmount);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 10);
    }
}

