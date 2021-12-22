package co.mil.fac.cetad.apidemo;

import co.mil.fac.cetad.apidemo.repositories.User;
import co.mil.fac.cetad.apidemo.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDemoApplication implements CommandLineRunner {

    private final UserService userService;

    public ApiDemoApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setFirstName("Paula");
        user.setLastName("Garizao");
        user.setNui("1033050393");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName() + " Nui: " + user.getNui());
        userService.createUser(user);

        User user2 = new User();
        user2.setFirstName("Manuela");
        user2.setLastName("Garizao");
        user2.setNui("10330503934");
        userService.createUser(user2);

        System.out.println("*** Probando creacion y listar");

        userService.listAllUser().forEach(u -> {
            System.out.println(u);
        });

        System.out.println("*** Probando editar y listar");
        user.setFirstName("Paula Sofia");
        userService.editUser(user);

        userService.listAllUser().forEach(u -> {
            System.out.println(u);
        });

        System.out.println("*** Probando eliminar y listar");
        userService.deleteUserById(user2.getNui());
        userService.listAllUser().forEach(u -> {
            System.out.println(u);
        });

    }
}
