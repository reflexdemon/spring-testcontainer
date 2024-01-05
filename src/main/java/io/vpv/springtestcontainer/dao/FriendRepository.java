package io.vpv.springtestcontainer.dao;

import io.vpv.springtestcontainer.domain.Friend;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FriendRepository extends MongoRepository<Friend, String> {
    Friend findFriendByEmail(String email);
}
