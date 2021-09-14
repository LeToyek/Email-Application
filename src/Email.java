import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String departement;
    private int passwordLength = 10;
    private int mailboxCapacity ;
    private String alternateEmail;
    private String password;

    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("ACCOUNT\t: " + this.firstname + " " + this.lastname );
        this.departement = setDepartement();
        this.password = randomPassword(passwordLength);
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

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String showInfo() {
        return "FIRST NAME\t\t\t: " + this.firstname +
                "\nLAST NAME\t\t\t: " + this.lastname +
                "\nDEPARTEMENT\t\t\t: " +this.departement +
                "\nEMAIL\t\t\t\t: " + this.firstname + "_" + this.lastname + "@company.com" +
                "\nPASSWORD\t\t\t: " + this.password +
                "\nMAILBOX CAPACITY\t: " +this.mailboxCapacity +"mb";
    }
    public void display(){
        System.out.println(showInfo());
    }
}
