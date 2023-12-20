package io.vpv.springtestcontainer.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("friends")
public record Friend(
        @Id UUID id,
        String firstName,
        String lastName,
        String email,
        String phone
) {
}
