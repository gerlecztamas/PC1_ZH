import java.util.Objects;

public class Waiter extends Chef{
    public void modifyPrice(String recipe, int price){
        for(String [] food : recipes){
            if(Objects.equals(food[0],recipe)){
                food[1]=String.valueOf(price);
            }
        }
    }
}
