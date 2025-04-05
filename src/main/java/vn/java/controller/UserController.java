package vn.java.controller;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.java.dto.request.UserRequestDTO;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public String addUser(@RequestBody UserRequestDTO userRequestDTO) {
        return "User added successfully";
    }
}
