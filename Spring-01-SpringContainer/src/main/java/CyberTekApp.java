import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CyberTekApp {

    public static void main(String[] args) {

       // BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        //Mentor mentor = (Mentor) container.getBean("partTimeMentor"); // you need to casted in this way.
        Mentor mentor = container.getBean("fullTimeMentor" ,Mentor.class); // you dont need to casting in this way


        mentor.createAccount();


    }
}
