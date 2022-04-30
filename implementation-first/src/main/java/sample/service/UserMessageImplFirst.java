package sample.service;

import dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import service.UserMessage;

@Slf4j
@Component("userMessage")
@Profile("first")
public class UserMessageImplFirst implements UserMessage {
    @Override
    public void message(User user) {
        log.info("First service implementation invoked");
    }
}
