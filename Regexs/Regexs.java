package desafioCadastroAnimais.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {

    public String apenasLetras(String texto) {
        String regex = "([A-Za-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return regex;
    }

    public String nomeComposto(String texto) {
        String regex = "^\\s*[a-zA-Z]+\\s+[a-zA-Z]+\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }

    public String naoInformado(String texto) {
        String regex = "^\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }

    public String filtroRaca(String texto) {
        String regex = "^\\s*[a-zA-Z]+\\s+[a-zA-Z]+\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return regex;
    }
}
