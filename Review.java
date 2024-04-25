public class Review {
    
    //attributes
    private int rating;
    private String feedback;

    //default constructor
    public Review(){
        rating = 0;
        feedback = "";
    }

    //copy constructor
    public Review(int rating, String feedback){
        this.rating = rating;
        this.feedback = feedback;
    }

    //get methods
    public int getRating(){
        return rating;
    }

    public String getFeedback(){
        return feedback;
    }
}
