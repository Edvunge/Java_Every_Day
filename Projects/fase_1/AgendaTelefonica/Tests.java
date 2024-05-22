package Projects.fase_1.AgendaTelefonica;

public class Tests {
    public static void main(String[] args) {
        // busca por um determinado nome , numa lista de arrays
        String names[] = {"Beach","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        String searchName = "Nico";
        boolean foundName = false;

        for(int i =0; i < names.length;i++){
            if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }
        if(foundName){
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}
