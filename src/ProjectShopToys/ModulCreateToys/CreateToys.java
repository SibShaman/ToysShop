package ProjectShopToys.ModulCreateToys;

import ProjectShopToys.ToysInterface;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class CreateToys  extends Toys implements ToysInterface {
    @Override
    public ArrayList<Toys> addToys(ArrayList<Toys> allToys) {

        Toy toy = new Toy();
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название игрушки: ");
        String nameToys = sc.next();

        System.out.println("Введите количество игрушек: ");
        int countToys = sc.nextInt();

        System.out.println("Введите частота выпадения игрушки: ");
        double specificWeight = sc.nextDouble();

        toy.setIdToys(count);
        toy.setNameToys(nameToys);
        toy.setCountToys(countToys);
        toy.setSpecificWeight(specificWeight);

        allToys.add(toy);

        return allToys;
    }
}
