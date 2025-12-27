package desafioCadastroAnimais.Main;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test02 {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmm-");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }

}
