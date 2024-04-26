public class Item {

    //attributes
    private String name;
    private double price;
    private int quant;
    private String desc;
    // private i image;

    //default constructor
    public Item(){
        name = "";
        price = 0;
        quant = 0;
        desc = "";
        //image = 0;
    }

    //copy constructor
    //public Item(String name, double price, int quant, String desc, i image){
    public Item(String name, double price, int quant, String desc){
        this.name = name;
        this.price = price;
        this.quant = quant;
        this.desc = desc;
        //this.image = image;
    }

    //get methods
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuant(){
        return quant;
    }

    public String getDesc(){
        return desc;
    }

    //public i getImage(){
     //   return image;
    //}

    //method for updating info of an item
    //public void updateItem(String newName, double newPrice, String newDesc, i newImage){
    public void updateItem(String newName, double newPrice, String newDesc){
    }

    //method for updating the quantity of an item
    public void updateQuant(int newQuant){

    }
}
