import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String departement;
    private int passwordLength = 10;
    private int mailboxCapacity = 0;
    private String password;

    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED\t: " + this.firstname + " " + this.lastname );
        this.departement = setDepartement();
        System.out.println("DEPARTEMENT\t:" + this.departement);
        this.password = randomPassword(passwordLength);
        System.out.println("PASSWORD\t:" + this.password);
        this.
    }
    public String setDepartement(){
        System.out.println("SELECT DEPARTEMENT\t:\n1.SALES\n2.DEVELOPMENT\n3.ASSISTANT\n0.NONE");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        if(choose == 1){
            return "SALES";
        }else if(choose == 2){
            return "DEVELOPMENT";
        }else if(choose == 3){
            return "ASSISTANT";
        }else {
            return "";
        }
    }
    public String randomPassword(int length){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM12345678!@#$%^&*";
        char [] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int) (Math.random()*passwordSet.length());
            password [i] =passwordSet.charAt(rand);
        }
        return new String(password);

    }
    
}
