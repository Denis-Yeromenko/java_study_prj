import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private List<T> fruitsBasket;

    public Basket() {
        fruitsBasket = new ArrayList<>();
    }

    public float getWeight() {
        float result = 0;
        for (T fruit : fruitsBasket) {
            result += fruit.getWeight();
        }
        return result;
    }

    public void add(T fruit){
        fruitsBasket.add(fruit);
    }

    public int compare(Basket<?> another){
        return Float.compare(getWeight(), another.getWeight());
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket <? super U> dst){
        dst.fruitsBasket.addAll(src.fruitsBasket);
        src.fruitsBasket.clear();
    }
}
