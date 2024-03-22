package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.application;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entities.Account;
import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entities.SavingsAccount;

public class ProgramPoli {
    Account x = new Account(1020, "Alex", 1000.0);
    Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);


}
