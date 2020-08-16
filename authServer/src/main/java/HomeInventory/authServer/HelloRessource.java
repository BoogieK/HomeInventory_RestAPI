package HomeInventory.authServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/hello")
public class HelloRessource {

    @GetMapping
    public String Hello() {
        return "Hello World!";
    }
}
