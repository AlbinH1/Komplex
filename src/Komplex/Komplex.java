package Komplex;

/**
 * Created by olal15 on 2017-02-27.
 */
public class Komplex {
    private int a; //Reel
    private int b; //Imagi


    Komplex(int input1, int input2) {
        this.a = input1;
        this.b = input2;
    }

    public String toString() {
        return ""+a+"+"+b+"i";
    }

    public Komplex add(Komplex add, Komplex add2) {
        //(a + bi) + (c + di) = (a + c) + (b + d)i
        return new Komplex(add2.a + add.a, add2.b + add.b);
    }

    public Komplex mult(Komplex mult, Komplex mult2) {
        //(a + bi) (c + di) = ac + bci + adi + bd^2 =
                //(ac - bd) + (bc + ad)i
        //int ans = ((mult.a * mult2.a) - (mult.b * mult2.b)) + ((mult.b * mult2.b) + (mult.a * mult2.a))
        return new Komplex(((mult.a * mult2.a) - (mult.b * mult2.b)), ((mult.b * mult2.b) + (mult.a * mult2.a)));
    }

}
