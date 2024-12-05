/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Network {
  
    private String networkName; // Name of the network
    private List<Enterprise> enterprises; // List of enterprises in the network

    // Constructor to initialize the network
    public Network(String networkName) {
        this.networkName = networkName;
        this.enterprises = new ArrayList<>(); // Initialize with an empty list
    }

    // Getter and Setter for networkName
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    // Getter for enterprises
    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    // Method to add an enterprise to the network
    public void addEnterprise(Enterprise enterprise) {
        this.enterprises.add(enterprise);
    }

    // Override toString method for debugging and display purposes
    @Override
    public String toString() {
        return "Network{" +
                "networkName='" + networkName + '\'' +
                ", enterprises=" + enterprises +
                '}';
    }
}

    