package io.vpv.springtestcontainer.rest;

import io.vpv.springtestcontainer.FriendService;
import io.vpv.springtestcontainer.dao.FriendRepository;
import io.vpv.springtestcontainer.domain.Friend;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class FriendRestService {
    private final FriendService friendService;


    @GetMapping("/friend")
    public Friend findFriendByEmail(String email) {
        log.info("Got request with email {}", email);
        return friendService.findFriendByEmail(email);
    }

    @PostMapping("/friend")
    public Friend saveFriend(@RequestBody Friend friend) {
        return friendService.saveFriend(friend);
    }

}
