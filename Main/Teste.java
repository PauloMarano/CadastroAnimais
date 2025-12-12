package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Regexs.Regexs;

public class Teste {
    public static void main(String[] args) {
        Regexs letras = new Regexs();
        String texto = "abcdefghijh123456";
        letras.apenasLetras(texto);
    }
}



