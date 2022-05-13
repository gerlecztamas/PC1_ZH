import java.util.ArrayList;
import java.util.Objects;

public class Chef {
    public Chef() {
    }

    public static ArrayList<String[]> recipes = new ArrayList<>();

    public void newRecipe(String recipe){
        String[] food = new String[2];
        food[0]=recipe;
        food[1]="0";
        recipes.add(food);
    }

    public void removeRecipe(String recipe){
        for (int i = 0; i < recipes.size(); i++) {
            if(Objects.equals(recipes.get(i)[0], recipe))
            {
                recipes.remove(i);
            }
        }
    }

    public String getMenu(){
        String result = "";
        if(recipes.size() != 0){
            for(int i = 0; i < recipes.size(); i++){
                if(recipes.get(i)[1]== " -"){
                    result += recipes.get(i)[0]+ "" +recipes.get(i)[1];
                    if(i != recipes.size() - 1) result += "\r\n";
                }
                else {
                    result += recipes.get(i)[0]+ " " +recipes.get(i)[1];
                    if(i != recipes.size() - 1) result += "\r\n";
                }
            }
        }
        return result;
    }
}
