package books.JavaComoProgramar_Deitel_editora.sect03_introductionClassesObjetos_AND_strings.questoes.loja_Informatica;

public class Invoice {
    public String number;
    public String desciption;
    public int quantityItem;
    public double priceForItem;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public double getPriceForItem() {
        return priceForItem;
    }

    public void setPriceForItem(double priceForItem) {
        this.priceForItem = priceForItem;
    }

    void getInvoiceAmount() {
        
    }

    /*
        (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática
        a utilize para representar uma fatura de um item vendido nela.
        Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
        número (tipo String), a descrição (tipo String),
        a quantidade comprada de um item (tipo int) e o preço por item (double).
        Sua classe deve ter um construtor que inicializa as quatro variáveis de instância.

        Forneça um método set e um get para cada variável de instância.
        Além disso, forneça um método chamado getInvoiceAmount que calcula o
        valor de fatura (isto é, multiplica a quantidade pelo preço por item) e
        depois retorna esse valor como double.
        Se a quantidade não for positiva, ela deve ser configurada como 0.
        Se o preço por item não for positivo, ele deve ser configurado como 0.0.
        Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
        capacidades da classe Invoice.
    */
}
