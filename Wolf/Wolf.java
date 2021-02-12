 public class Wolf {
   String name;
   String type;
   String color; 
   

 public Wolf(String wName, String wType, String wColor) {
   name = wName;
   type = wType;
   color = wColor;
   
}

public String toString() {
return "This is a " + type + " Wolf called " + name + ". " + name + " is 12 years old and is the color " + color;
}

 public static void main(String[] args) {
   Wolf Snow = new Wolf("Snow", "Artic", "White");
   System.out.println(Snow);

 }
}












