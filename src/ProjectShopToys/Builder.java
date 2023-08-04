package ProjectShopToys;

import ProjectShopToys.ModulCreateToys.Toys;

import java.util.ArrayList;
import java.util.Objects;

public class Builder {
    private ToysInterface builder;
    private ArrayList<Toys> listToys;

    public Builder(ToysInterface builder, ArrayList<Toys> listToys) {
        this.builder = builder;
        this.listToys = listToys;
    }

    public ArrayList<Toys> createToys(){
        return builder.addToys(listToys);
    }
}
