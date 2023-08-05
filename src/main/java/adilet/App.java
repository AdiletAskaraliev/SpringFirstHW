package adilet;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        SedanCar sedanCar =applicationContext.getBean("sedanCar", SedanCar.class);
        System.out.println(sedanCar);

        RestylingCar restylingCar = applicationContext.getBean("restylingCar", RestylingCar.class);
        System.out.println(restylingCar);

        HatchbackCar hatchbackCar = applicationContext.getBean("hatchbackCar", HatchbackCar.class);
        System.out.println(hatchbackCar);

        Car car = applicationContext.getBean("car", Car.class);
        car.getSalon().price();
        System.out.println(car);

        

        applicationContext.close();
    }
}
