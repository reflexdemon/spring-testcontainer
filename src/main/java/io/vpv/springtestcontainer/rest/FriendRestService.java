package io.vpv.springtestcontainer.rest;

import io.vpv.springtestcontainer.dao.FriendRepository;
import io.vpv.springtestcontainer.domain.Friend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FriendRestService {
    private final FriendRepository friendRepository;

    public FriendRestService(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @GetMapping("/friend")
    public Friend findFriendByEmail(String email) {
        log.info("Got request with email {}", email);
        return friendRepository.findFriendByEmail(email);
    }
}
