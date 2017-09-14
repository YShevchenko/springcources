import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach =  ctx.getBean("myCoach", Coach.class);
        System.out.println(myCoach.getMyWorkOut());
        System.out.println(myCoach.getDailyFortune());
    }
}
