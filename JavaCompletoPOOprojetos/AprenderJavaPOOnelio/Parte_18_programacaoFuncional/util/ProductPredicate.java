package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_18_programacaoFuncional.util;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_17_generics_set_map.set.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
