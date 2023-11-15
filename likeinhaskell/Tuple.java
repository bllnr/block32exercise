package likeinhaskell;

import java.lang.*;
import java.io.*;
import java.util.*;
/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.
public class Tuple <T1,T2> {
    T1 t1;
    T2 t2;

    public Tuple(T1 firstThing, T2 secondThing) {
        this.t1 = firstThing;
        this.t2 = secondThing;
    }

    public T1 fst() {
        return this.t1;
    }

    public T2 snd() {
        return this.t2;
    }

    public static void main(String[] args) {
        Tuple<String, Integer> tuple = new Tuple<String, Integer>("Hej", 1);
        Object a = tuple.fst();
        Object b = tuple.snd();

        System.out.println(a);
        System.out.println(b);
    }
}





