package season;

public class Apple extends Fruit {
	
	    public void eat () {
	        name = "Apple";
	        taste = "sweet";
	    }
	    
	    @Override
	        System.out.println("Fruit: " + name + " | Taste: " + taste);
	    }
	}