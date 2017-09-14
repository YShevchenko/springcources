public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: Inside no arg constructor");
    }

    @Override
    public String getMyWorkOut() {
        return "Practice fash bowling for 15 minutes/day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setUp(){
        System.out.println("set up 1");
    }

    public void tearDown(){
        System.out.println("tear down 1");
    }
}
