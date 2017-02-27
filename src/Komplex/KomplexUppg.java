package Komplex;

/**
 * Created by olal15 on 2017-02-27.
 */
import Komplex.Komplex;

public class KomplexUppg {
    public static void main(String[] args) {
        Komplex komplex1 = new Komplex( 2,  2);
        Komplex komplex2 = new Komplex( 4,  4);

        Komplex komplex3 = komplex1.add(komplex1, komplex2);

        System.out.println(komplex3.toString());
    }
}
