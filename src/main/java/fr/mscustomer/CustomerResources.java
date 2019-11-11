package fr.mscustomer;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResources {


    @GetMapping("/hello-customer")
    String helloEureka(){
        return "hello from customer MS ";
    }
}
