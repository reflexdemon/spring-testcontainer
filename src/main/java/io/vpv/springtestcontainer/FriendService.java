package io.vpv.springtestcontainer;

import io.vpv.springtestcontainer.dao.FriendRepository;
import io.vpv.springtestcontainer.domain.Friend;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class FriendService {
    private final FriendRepository friendRepository;

    public Friend findFriendByEmail(String email) {
        return friendRepository.findFriendByEmail(email);
    }

    public Friend saveFriend(Friend friend) {
        return friendRepository.save(friend);
    }
}
