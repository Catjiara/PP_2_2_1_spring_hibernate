package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
/*
      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      CarService carService = context.getBean(CarService.class);
      carService.add(new Car("BMW", 5, new User("Vania", "Ivanov", "vania@mail.ru")));
      carService.add(new Car("Volga", 21, new User("Petia", "Petrov", "petia@yahoo.com")));
      carService.add(new Car("Citroen", 5, new User("Sidor", "Sidorov", "sidor@yandex.ru")));

      List<Car> cars = carService.listCars();
      for (Car car: cars) {
          System.out.printf("Car id %s, model %s %s, owner %s %s (email %s)\n", car.getId(), car.getModel(), car.getSeries(),
                  car.getUser().getFirstName(), car.getUser().getLastName(), car.getUser().getEmail() );
      }
*/
       userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("BMW", 5)));

      context.close();
   }
}
