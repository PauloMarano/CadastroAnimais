package desafioCadastroAnimais.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {
    public String apenasLetras (String texto){
        String regex = "([A-Za-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return regex;
    }
    public String semLetras (String texto){
        String regex = "([A-Za-z])\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }
    public String nomeComposto(String texto){
        String regex = "([A-Za-z])\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }
    public String naoInformado(String texto){
        String regex = "([A-Za-z])\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }
}
