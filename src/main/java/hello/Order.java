package hello;
import java.util.Scanner;
import java.util.ArrayList;

public class Order {
    
    //attributes
    private ArrayList<Item> cart;
    private double priceTotal;
    private double serviceFee;
    private String orderName;

    //default constructor
    public Order(){
        cart = new ArrayList<Item>();
        priceTotal = 0;
        serviceFee = 0;
        orderName = "";
    }

    //copy constructor
    public Order(ArrayList<Item> cart, double priceTotal, double serviceFee, String orderName){
        this.cart = cart;
        this.priceTotal = priceTotal;
        this.serviceFee = serviceFee;
        this.orderName = orderName;
    }

    //get methods
    public ArrayList<Item> getCart(){
        return cart;
    }

    public double getPriceTotal(){
        return priceTotal;
    }
    
    public double getServiceFee(){
        return serviceFee;
    }
    
    public String getOrderName(){
        return orderName;
    }

    //method to add a new item to the cart
    public void addToCart(Item newItem){

    }

    //method to remove an item from the cart
    public void removeFromCart(ArrayList<Item> cart){

    }

    //method to clear the cart
    public void clearCart(ArrayList<Item> cart){

    }

    //method to update the running price total of the cart
    public void updatePriceTotal(){

    }

    //method to update the running service fee total
    public void updateServiceFee(){

    }
}
