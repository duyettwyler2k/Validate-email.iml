public class Main {

    public static final String[] validEmail=new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail=new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
       EmailExemple emailExemple=new EmailExemple();
       for (String email:validEmail){
           boolean isvalid=emailExemple.validate(email);
           System.out.println("email is"+email+"is valid "+isvalid );
       }
       for (String email:invalidEmail){
           boolean isvalid=emailExemple.validate(email);
           System.out.println("email is"+email+"is valid "+isvalid );
       }
    }
}
