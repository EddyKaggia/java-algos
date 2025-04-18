package strings;

public class Greeting {
    public static String greeting(String name) {
	  if(name == "Mubashir") {
    		return "Hello, my Love!";
  		} else {
            return "Hello, " + name + "!";  
        }
	}

    public static void main(String[] args) {
        System.out.println(greeting("Matt"));
        System.out.println(greeting("Helen"));
        System.out.println(greeting("Mubashir"));
    }
}
