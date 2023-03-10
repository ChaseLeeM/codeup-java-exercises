public class Dish {

        private int costInCents;
        private String nameOfDish;
        private boolean wouldRecommend;

        public Dish() {

        }

        public int getCostInCents() {
            return costInCents;
        }
        public void setCostInCents(int costInCents) {
                this.costInCents = costInCents;
        }
        public String getNameOfDish() {
            return nameOfDish;
        }
        public void setNameOfDish(String nameOfDish) {
                this.nameOfDish = nameOfDish;
        }
        public boolean getWouldRecommend() {
            return wouldRecommend;
        }
        public void isWouldRecommend(boolean wouldRecommend) {
                this.wouldRecommend = wouldRecommend;
        }


        public void printSummary() {
            System.out.printf("\n Cost: %d \n Name: %s \n Recommended: %s \n", costInCents, nameOfDish, wouldRecommend);
        }

}




//-- OOP SHORT ASSIGNMENT #1 --
//        Create a class called MiniExercises.Dish. This class will represent various restaurant dishes.
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//        Add a main method and inside the method...
//        1) instantiate a MiniExercises.Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed


//    Refactor your Dish and DishTest classes...
//        1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//          3) Refactor code as needed in DishTest to access and modify dish object property values
//          4) Add a constructor method to Dish that will assign all properties
//          5) Refactor DishTest again to use the constructor to set all property values rather than setter methods