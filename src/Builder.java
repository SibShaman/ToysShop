import java.util.ArrayList;
import java.util.Objects;

public class Builder {
    private ToysInterface builder;
    private ArrayList<Objects> listToys;

    public Builder(ToysInterface builder, ArrayList<Objects> listToys) {
        this.builder = builder;
        this.listToys = listToys;
    }

    public ArrayList<Objects> createToys(){
        return builder.addToys(listToys);
    }
}
