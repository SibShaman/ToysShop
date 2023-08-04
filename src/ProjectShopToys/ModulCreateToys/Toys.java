package ProjectShopToys.ModulCreateToys;

public abstract class Toys {

    private int idToys;
    private String nameToys;
    private int countToys;
    private double specificWeight;

    public Toys() {
    }
    public Toys(int idToys, String nameToys, int countToys, double specificWeight) {
        this.idToys = idToys;
        this.nameToys = nameToys;
        this.countToys = countToys;
        this.specificWeight = specificWeight;
    }

    public int getIdToys() {
        return idToys;
    }

    public void setIdToys(int idToys) {
        this.idToys = idToys;
    }

    public String getNameToys() {
        return nameToys;
    }

    public void setNameToys(String nameToys) {
        this.nameToys = nameToys;
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }

    public double getSpecificWeight() {
        return specificWeight;
    }

    public void setSpecificWeight(double specificWeight) {
        this.specificWeight = specificWeight;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "idToys=" + idToys +
                ", nameToys='" + nameToys + '\'' +
                ", countToys=" + countToys +
                ", specificWeight=" + specificWeight +
                '}';
    }
}
