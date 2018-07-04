package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }


    //Cassandra CRUD

    @RequestMapping(value="/java/cassandra/read/{number}", method=RequestMethod.GET)
    public String cassandra(@PathVariable Long number) {
        return "You are asking me to create"+number+" objects ";
    }




//Redis CRUD

    @RequestMapping(value="/java/redis/read/{number}", method=RequestMethod.GET)
    public String redis(@PathVariable Long number) {
        return "You are asking me to create"+number+" objects ";
    }

//Mongo CRUD

    @RequestMapping(value="/java/mongo/read/{number}", method=RequestMethod.GET)
    public String mongo(@PathVariable Long number) {
        return "You are asking me to create"+number+" objects ";
    }






//Dgraph CRUD

    @RequestMapping(value="/java/dgraph/read/{number}", method=RequestMethod.GET)
    public String dgraph(@PathVariable Long number) {
        return "You are asking me to create"+number+" objects ";
    }





    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
