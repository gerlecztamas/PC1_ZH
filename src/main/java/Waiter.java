import java.util.Objects;

public class Waiter extends Chef{

    public void modifyPrice(String recipe, int price){
        for(String [] fogas : recipes){
            if(Objects.equals(fogas[0],recipe)){
                fogas[1]=String.valueOf(price);
            }
        }
    }
}
