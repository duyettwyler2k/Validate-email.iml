import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExemple {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String OPG= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExemple(){
        pattern=Pattern.compile(OPG);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
