package DecoratorPattern;

public class PizzaHut {
    public static void main(String[] args) {
        BasePizza pizza= new ExtraCheese(new VeggePizza());
        System.out.println(pizza.cost());
    }
}
