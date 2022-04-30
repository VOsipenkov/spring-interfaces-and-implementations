package next.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserMessage;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserMessage userMessage;

    @RequestMapping(value = "/user")
    public void get() {
        log.info("Request get /user");
        userMessage.message(null);
    }
}
