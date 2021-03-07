package PRG3x1_Project.BusinessAccessLayer;

import java.util.Scanner;

public class FoodMenu 
{
      // here we need 3 methods that will have the choices of food
    // the fields here are for the users selections only
    String kidsmeal;
    String Adultsmeal;
    String Desert;
    String fullCource;

    public String adultsMenu() {

        Scanner sn = new Scanner(System.in);

        System.out.println("\n---------------------------------------------------------");
        System.out.println("Please select any of the following items for adults menu:");
        System.out.println("\n--------------------------------------------------------\n");

        // options here
        System.out.println(
                "1. Portable Shrimp and Grits. \n2. kimchi. \n3. Tacos and Mini Margaritas. \n4. Sushi Rainbow. \n5. Pork Chops with Fig and Grape Agrodolce. \n6. Cauliflower Bolognese (vegeterian).");
        Integer mainchoice = sn.nextInt();

        switch (mainchoice) {
            case 1:
                Adultsmeal = "Shrimps";
                break;
            case 2:
                Adultsmeal = "kimchi";
                break;
            case 3:
                Adultsmeal = "Tacos and Margaritas";
                break;
            case 4:
                Adultsmeal = "Sushi";
                break;
            case 5:
                Adultsmeal = "Pork Chops and Grape Agrodolce";
                break;
            case 6:
                Adultsmeal = "Cauliflower Bolognese";
                break;
            default:
                System.out.println("This selection automatically selects number 1 from menu");
                Adultsmeal = "Shrimp and Grits";
        }

        return Adultsmeal;

    }

    public String kidsMenu() {

        Scanner sn = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("Please select any of the following items for children menu:");
        System.out.println("--------------------------------------------------------\n");

        // options here
        System.out.println(
                "1. Mini Pizzas. \n2. kimchi. \n3. Taco Bar. \n4. Colorful Pretzel Wands. \n5. Pork Chops. \n6. Cauliflower Bolognese (vegeterian).");
        Integer mainchoice = sn.nextInt();

        switch (mainchoice) {
            case 1:
                kidsmeal = "Pizza";
                break;
            case 2:
                kidsmeal = "kimchi";
                break;
            case 3:
                kidsmeal = "Tacos";
                break;
            case 4:
                kidsmeal = "Pretzel Wands";
                break;
            case 5:
                kidsmeal = "Pork Chops";
                break;
            case 6:
                kidsmeal = "Cauliflower Bolognese";
                break;
            default:
                System.out.println("This selection automatically selects number 1 from menu");
                kidsmeal = "Shrimp and Grits";
        }

        return kidsmeal;
    }

    public String desrt() {

        Scanner sa = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("Please select any of the following items for desert:");
        System.out.println("--------------------------------------------------------\n");

        // options here
        System.out.println(
                "1. Apple Nacho Bar. \n2. Fruit Tree. \n3. Walking Ice Cream Servers. \n4. Cookie Stacks. \n5. Carrot cake. \n6. Donut Ice Cream Cone.");
        Integer mainchoice = sa.nextInt();

        switch (mainchoice) {
            case 1:
            Desert = "Nacho Bar";
                break;
            case 2:
            Desert = "Fruit Tree";
                break;
            case 3:
            Desert = "Ice Cream";
                break;
            case 4:
            Desert = "Cookies";
                break;
            case 5:
            Desert = "Carrot cake";
                break;
            case 6:
            Desert = "Donut Ice Cream Cone";
                break;
            default:
                System.out.println("This selection automatically selects number 1 from menu");
                Desert = "Apple Nacho Bar";
        }

        return Desert;
    }

    public String fullMenu()
    {
        return Adultsmeal +"@"+ kidsmeal +"@"+ Desert;
    }
    @Override
    public String toString() {
        return Adultsmeal + "@" + Desert + "@" + kidsmeal;
    }
}
