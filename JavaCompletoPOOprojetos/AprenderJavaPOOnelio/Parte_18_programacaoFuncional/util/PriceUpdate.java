package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_18_programacaoFuncional.util;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_17_generics_set_map.set.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
