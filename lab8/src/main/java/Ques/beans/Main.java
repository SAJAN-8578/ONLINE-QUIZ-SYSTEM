package Ques.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.bs.beans.Stamp;
public class Main {
 public static void main(String[] args)
 {
 String config_loc="/in/bs/resources/applicationContext.xml";
 ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
 System.out.println("STAMP COLLECTION FROM DIFFERENT COUNTRIES");
 System.out.println("==================================================");
 Stamp std = (Stamp) context.getBean("stampID1");
 std.display();
 Stamp std1 = (Stamp) context.getBean("stampID2");
 std1.display();
 Stamp std2 = (Stamp) context.getBean("stampID3");
 std2.display();
 Stamp std3 = (Stamp) context.getBean("stampID4");
 std3.display();
 }
}
