import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChefTest {

    // TODO: Uncomment testcase to test newRecipe method.

    @Test
    public void testNewRecipe() {
        Chef chef = new Chef();
        assertTrue(chef.getMenu().isEmpty());

        String recipeName1 = "Toast";
        chef.newRecipe(recipeName1);
        assertEquals(recipeName1 + " 0", chef.getMenu());

        String recipeName2 = "Hamburger";
        chef.newRecipe(recipeName2);
        assertEquals(recipeName1 + " 0\r\n" + recipeName2 + " 0", chef.getMenu());
    }


    // TODO: Uncomment testcase to test removeRecipe method.

    @Test
    public void testRemoveRecipe() {
        Chef chef = new Chef();
        String recipeName1 = "Toast";
        String recipeName2 = "Hamburger";
        chef.newRecipe(recipeName1);
        chef.newRecipe(recipeName2);

        assertEquals(recipeName1 + " 0\r\n" + recipeName2 + " 0", chef.getMenu());

        chef.removeRecipe(recipeName1);
        assertEquals(recipeName2 + " 0", chef.getMenu());
    }


    // TODO: Uncomment testcase to test modifyPrice method.

    @Test
    public void testWaiter() {
        Waiter waiter = new Waiter();
        String recipeName1 = "Toast";
        String recipeName2 = "Hamburger";
        int price1 = 120;
        int price2 = 500;

        waiter.newRecipe(recipeName1);
        waiter.newRecipe(recipeName2);

        waiter.modifyPrice(recipeName1, price1);
        assertEquals(recipeName1 + " " + price1 + "\r\n" + recipeName2 + " 0", waiter.getMenu());

        waiter.modifyPrice(recipeName2, price2);
        assertEquals(recipeName1 + " " + price1 + "\r\n" + recipeName2 + " " + price2, waiter.getMenu());
    }

}
