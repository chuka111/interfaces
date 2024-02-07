package ie.atu;

public class OnlineOrderingSystem {

    public static void main(String[] args){
        MenuItem[] menuItems = new MenuItem[]{
            new Burger("Classic burger",8.99,"beef patty,lettuce,tomato,cheese"),
            new Pizza("Margherita Pizza",12.99,"tomato sauce,mozzarella basil"),
                new Salad("Caesar Salad",6.99,"Romaine Lettuce, croutons, Caesar dressing")
        };

        for(MenuItem menuItem : menuItems) {
            System.out.println("Name: " + menuItem.getName() + "\n" + "Description: " + menuItem.getDescription()
                    + "\n" + "Price: " + menuItem.getPrice() + "\n");
        }


        double totalCost = 0;
        for(MenuItem menuItem : menuItems) {
            totalCost += menuItem.getPrice();
        }
              System.out.println("Total Cost: €" + totalCost);
    }








}
