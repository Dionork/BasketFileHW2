package src;

public class Basket {
    private String [] goods;
    private int [] prices;
    private int[] quantities;

    public Basket() {

    }

    public Basket(String [] goods, int [] prices){
        this.goods = goods;
        this.prices = prices;
        this.quantities = new int[goods.length];
    }

    public void addToCard(int productNum, int amount) {quantities[productNum] += amount;}

    public void printCart(){
        int totalPrice = 0;
        System.out.println("Список покупок:");
        for (int i=0; i< goods.length; i++){
            if (quantities[i]>0){
                int currentPrice = prices[i] * quantities[i];
                totalPrice += currentPrice;
                System.out.printf("%15s%4d р/шт%4d шт%6d p%n", goods[i],prices[i],quantities[i], currentPrice);
            }
        }
        System.out.printf("Итого: %dp", totalPrice);
    }
}
