package books.JavaGenerics_and_Collections.Part1_Generics.chapter1_introdution;

import java.util.Iterator;
import java.util.List;

public class Product_of_TwoVectors {

    public static double dot(List<Double> u, List<Double> v) {
        if (u.size() != v.size())
            throw new IllegalArgumentException("different sizes");
        double d = 0;
        Iterator<Double> ult = u.iterator();
        Iterator<Double> vlt = v.iterator();

        while (ult.hasNext()) {
            assert ult.hasNext() && vlt.hasNext();
            d += ult.next() * vlt.next();
        }
        assert !ult.hasNext() && !vlt.hasNext();
        return d;
    }
}

