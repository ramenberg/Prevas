package ProblemA;

import java.util.List;
import java.util.Scanner;

public class ProblemA {

//    Sample system in
//    2
//    6 4 20
//    oliveoil 50.9 11.2
//    garlic 12.0 2.7
//    beef 453.6 100.0
//    onions 1134.0 250.0
//    raisins 82.5 18.2
//    bouillon 10.0 2.2
//            4 5 8
//    Milk 265.0 93.0
//    SodiumCitrate 11.0 4.0
//    WhiteCheddar 285.0 100.0
//    DryMacaroni 240.0 84.0

    public int numOfRecipes;


//    public ProblemA(String ingredient, double weight, double percentage) {
//        this.ingredient = ingredient;
//        this.weight = weight;
//        this.percentage = percentage;
//    }

   // public String ingredient;
    public double weight;
    public double percentage;

    String oneLine;

    Ingredient ingredient;


    public List<Ingredient> allIngredients;


    Scanner sc = new Scanner(System.in);

    public void ProblemA() {

        numOfRecipes = sc.nextInt();
        int readRecipes = 1;
        while (readRecipes <= numOfRecipes) {
            int numOfIngredients = sc.nextInt();
            int numOfServings = sc.nextInt();
            int numOfWantedServings = sc.nextInt();
            for (int i = 0; i < numOfIngredients; i++) {
                String temp = sc.nextLine();
                Ingredient tempIngredient = new Ingredient(temp);
                allIngredients.add(tempIngredient);
                // ska vi leta efter main ingredient och göra något
                // index 2 i vår lista.
                double scaling = numOfWantedServings / numOfServings;
            }
            readRecipes++;
        }
        System.out.println("Läst klart");
    }


    public class Ingredient {
        private String ingredientName;
        private double amount;
        private double percentage;

        public Ingredient(String fullInformation) {
            String[] temp = fullInformation.split(" ");
            this.ingredientName = temp[0].trim();
            this.amount = Double.parseDouble(temp[1].trim());
            this.percentage = Double.parseDouble(temp[2].trim());
        }

        public String getIngredientName() {
            return ingredientName;
        }

        public double getAmount() {
            return amount;
        }

        public double getPercentage() {
            return percentage;
        }
    }

    public static void main(String[] args) {

    }
}


