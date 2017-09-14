import java.util.Random;

public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        String[] fortunes = new String [3];
        fortunes[0] = "go fortune";
        fortunes[1] = "go go fortune";
        fortunes[2] = "go go go fortune";
        Random random = new Random();
        return fortunes[random.nextInt(3)];
    }
}
