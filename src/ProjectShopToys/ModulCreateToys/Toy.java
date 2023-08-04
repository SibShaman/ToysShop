package ProjectShopToys.ModulCreateToys;

public class Toy extends Toys {
    public Toy() {
        super();
    }

    public Toy(int idToys, String nameToys, int countToys, double specificWeight) {
        super(idToys, nameToys, countToys, specificWeight);
    }

    @Override
    public int getIdToys() {
        return super.getIdToys();
    }

    @Override
    public void setIdToys(int idToys) {
        super.setIdToys(idToys);
    }

    @Override
    public String getNameToys() {
        return super.getNameToys();
    }

    @Override
    public void setNameToys(String nameToys) {
        super.setNameToys(nameToys);
    }

    @Override
    public int getCountToys() {
        return super.getCountToys();
    }

    @Override
    public void setCountToys(int countToys) {
        super.setCountToys(countToys);
    }

    @Override
    public double getSpecificWeight() {
        return super.getSpecificWeight();
    }

    @Override
    public void setSpecificWeight(double specificWeight) {
        super.setSpecificWeight(specificWeight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
