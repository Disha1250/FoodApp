package hello;


import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {

    //attributes
    private String name;
    private String address;
    private String category;
    private String username;
    private String password;
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    private double revenue;
    private ArrayList<Review> reviews;
    private float ratingAvg;

    //default constructor
    public Restaurant(){
        name = "";
        address = "";
        category = "";
        username = "";
        password = "";
        menu = new ArrayList<Item>();
        revenue = 0;
        reviews = new ArrayList<Review>();
        ratingAvg = 0;
    }

    //copy constructor
    public Restaurant(String name, String address, String category, String username, String password, ArrayList<Item> menu, double revenue, ArrayList<Review> reviews, float ratingAvg){
        this.name = name;
        this.address = address;
        this.category = category;
        this.username = username;
        this.password = password;
        this.menu = menu;
        this.revenue = revenue;
        this.reviews = reviews;
        this.ratingAvg = ratingAvg;
    }

    //get methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public ArrayList<Item> getMenu(){
        return menu;
    }
    
    public ArrayList<Order> getOrders(){
        return orders;
    }
    
    public double getRevenue(){
        return revenue;
    }
    
    public ArrayList<Review> getReviews(){
        return reviews;
    }
    
    public float getRatingAvg(){
        return ratingAvg;
    }

    //method for creating the menu and filling it with items
    public void createMenu(ArrayList<Item> newItems){

    }

    //method to change/update the restaurant informtion
    public void updateRestaurantInfo(String newName, String newAddress, String newCategory, ArrayList<Item> newItems){

    }

    //method to update the total revenue of the restaurant
    public void updateRevenue(double newRevenue){

    }

    //method to initialise the ArrayList of reviews
    public void createReviewList(ArrayList<Review> newReviews){

    }

    //method to update review score average
    public void updateRatingAvg(float newRatingAvg){

    }

    //method to accept an order from a customer
    public void acceptOrder(){

    }

    //method to set an order as ready for pickup
    public void finishOrder(){

    }
}

