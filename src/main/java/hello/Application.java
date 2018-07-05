package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController

public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    //HTTP method WriteOperation

    //Cassandra CRUD

    @PostMapping(value="/java/cassandra/write/{number}")
    public String postCassandra(@PathVariable Long number) { return "You are asking me to write "+number+" objects ";
    }

//Redis CRUD

    @PostMapping(value="/java/redis/write/{number}")
    public String postRedis(@PathVariable Long number) { return "You are asking me to write "+number+" objects ";
    }

//Mongo CRUD

    @PostMapping(value="/java/mongo/write/{number}")
    public String postMongo(@PathVariable Long number) { return "You are asking me to write "+number+" objects ";
    }


    //Dgraph CRUD
    @PostMapping(value="/java/dgraph/write/{number}")
    public String postDgraph(@PathVariable Long number) { return "You are asking me to write "+number+" objects ";
    }




// HTTP method ReadOperation

    //Cassandra CRUD

    @RequestMapping(value="/java/cassandra/read/{number}", method=RequestMethod.GET)
    public String getCassandra(@PathVariable Long number) { return "You are asking me to read "+number+" objects ";
    }


//Redis CRUD

    @RequestMapping(value="/java/redis/read/{number}", method=RequestMethod.GET)
    public String getRedis(@PathVariable Long number) { return "You are asking me to read "+number+" objects ";
    }

//Mongo CRUD

    @RequestMapping(value="/java/mongo/read/{number}", method=RequestMethod.GET)
    public String getMongo(@PathVariable Long number) { return "You are asking me to read "+number+" objects ";
    }

//Dgraph CRUD

    @RequestMapping(value="/java/dgraph/read/{number}", method=RequestMethod.GET)
    public String getDgraphR(@PathVariable Long number) { return "You are asking me to read "+number+" objects ";
    }


//HTTP method DeleteOperation

// Cassandra CRUD

    @DeleteMapping(value="/java/cassandra/delete/{number}")
    public String deleteCassandra(@PathVariable Long number) { return "You are asking me to delete "+number+" objects ";
    }


//Redis CRUD

    @DeleteMapping(value="/java/redis/write/{number}")
    public String deleteRedis(@PathVariable Long number) { return "You are asking me to delete "+number+" objects ";
    }

//Mongo CRUD

    @DeleteMapping(value="/java/mongo/write/{number}")
    public String deleteMongo(@PathVariable Long number) { return "You are asking me to delete "+number+" objects ";
    }

    //Dgraph CRUD
    @DeleteMapping(value="/java/dgraph/write/{number}")
    public String deleteDgraph(@PathVariable Long number) { return "You are asking me to delete "+number+" objects ";
    }



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
