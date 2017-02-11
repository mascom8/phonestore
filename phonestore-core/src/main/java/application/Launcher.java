package application;


import domain.Address;
import domain.User;
import repository.UserRepository;
import service.UserService;
import service.impl.UserServiceImpl;

public class Launcher {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserServiceImpl(userRepository);

        Address address = new Address();
        address.setId(1L);
        address.setAddressNumber(12);
        address.setStreet("Rue de Paris");
        address.setZipCode(75000L);
        address.setCity("Paris");
        address.setCountry("France");

        User user = new User();
        user.setId(1L);
        user.setName("User1");
        user.setAge(26);
        user.setAddress(address);

        userService.create(user);
    }
}
