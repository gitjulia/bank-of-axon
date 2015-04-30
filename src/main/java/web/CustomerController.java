package web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.HttpStatus.OK;

@Controller
@EnableAutoConfiguration
public class CustomerController {

    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<String> home() {
        return new ResponseEntity<String>("reply", OK);
    }
}
