import ProjectShopToys.Builder;
import ProjectShopToys.ModulCreateToys.CreateToys;
import ProjectShopToys.ModulCreateToys.Toys;
import ProjectShopToys.ToysInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toys> allToys = new ArrayList<>();
        ToysInterface toys = new CreateToys() {};
        Builder builder = new Builder(toys, allToys);
        builder.createToys();
        System.out.println(allToys);

    }
}