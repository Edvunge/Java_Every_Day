package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.S_formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePT);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}