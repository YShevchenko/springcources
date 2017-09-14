public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getMyWorkOut() {
        return "do some baseball";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
