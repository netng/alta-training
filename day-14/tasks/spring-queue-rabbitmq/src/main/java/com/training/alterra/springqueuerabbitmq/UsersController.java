package com.training.alterra.springqueuerabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private QueuePublisher queuePublisher;

    @PostMapping("/signup")
    public ResponseEntity<String> create(@RequestBody User request) {
        User user = new User();
        user.setUserName(request.getUserName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.save(user);

        queuePublisher.send("Hello from publisher");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("Thank you for signup. We already send email to your email for activation");

    }
}
