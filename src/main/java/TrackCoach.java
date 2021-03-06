public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getMyWorkOut() {
        return "run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
