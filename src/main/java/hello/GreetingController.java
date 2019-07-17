package hello;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tbg
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    UserService userService;

    @RequestMapping("/greeting")
    public void greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
        List<UserDetails> users = userService.getUserDetails();
        Date d = new Date();
        users.stream().forEach(u -> {
            System.out.println(d.compareTo(u.getBirth()) == 0);
        });


    }
}
