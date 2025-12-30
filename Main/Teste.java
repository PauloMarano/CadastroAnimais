package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Regexs.Regexs_Case1;

public class Teste {
    public static void main(String[] args) {
        Regexs_Case1 letras = new Regexs_Case1();
        String texto = "abcdefghijh123456";
        letras.apenasLetras(texto);
    }
}



