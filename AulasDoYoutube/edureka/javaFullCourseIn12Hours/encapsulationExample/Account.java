package AulasDoYoutube.edureka.javaFullCourseIn12Hours.encapsulationExample;

public class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public float getAmout() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(1340282876);
        acc.setName("Ravi");
        acc.setEmail("Ravi@gmail.com");
        acc.setAmount(25000f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmout());
    }
}
