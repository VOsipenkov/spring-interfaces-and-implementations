package sample.service;

import dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import service.UserMessage;

@Slf4j
@Component
public class UserMessageImplFirst implements UserMessage {
    @Override
    public void message(User user) {
        log.info("First service implementation invoked");
    }
}
