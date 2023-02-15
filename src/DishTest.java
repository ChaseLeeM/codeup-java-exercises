

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.setCostInCents(500);
        dish1.setNameOfDish("Pizza");
        dish1.isWouldRecommend(true);
        dish1.printSummary();


        Dish dish2 = new Dish();
        dish2.setCostInCents(2500);
        dish2.setNameOfDish("Steak");
        dish2.isWouldRecommend(true);
        dish2.printSummary();



    }



}

//    Refactor your Dish and DishTest classes...
//        1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//          3) Refactor code as needed in DishTest to access and modify dish object property values
//          4) Add a constructor method to Dish that will assign all properties
//          5) Refactor DishTest again to use the constructor to set all property values rather than setter methods