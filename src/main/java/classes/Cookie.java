package classes;


public class Cookie {
    //Class variable
    private String color;

    //METHODS

    //Constructor method (Always has name of class)
    public Cookie(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");
    }
}

   
