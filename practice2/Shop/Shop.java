package practice2.Shop;

public class Shop {
    String[] stock = new String[3];{
        stock[0]="HP";
        stock[1]="Apple";
        stock[2]="LG";
    }

    public String getComputers(int index) {
        return stock[index];
    }

    public String search(String computer) {
        for (int index =0;index< stock.length;index++) {
            if(stock[index]==computer)
                return stock[index];
        }
        return "U nas netu. ";
    }
}
