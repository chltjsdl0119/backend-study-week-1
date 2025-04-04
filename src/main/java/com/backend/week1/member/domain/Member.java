package com.backend.week1.member.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private Long id;
    private String name;

    public Member(String name) {
        this.name = name;
    }
}
