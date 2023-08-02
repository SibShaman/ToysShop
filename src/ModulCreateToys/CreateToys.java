package ModulCreateToys;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class CreateToys {
    public ArrayList<Toys> addToys(ArrayList<Toys> allToys){

        Toys toys = new Toys();

        int count = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название игрушки: ");
        String nameToys = sc.next();

        System.out.println("Введите количество игрушек: ");
        int countToys = sc.nextInt();

        System.out.println("Введите частота выпадения игрушки: ");
        int specificWeight = sc.nextInt();

        return allToys;
    }
}
