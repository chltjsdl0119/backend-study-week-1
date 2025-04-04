package com.backend.week1.member.application.interfaces;

import com.backend.week1.member.domain.Member;

import java.util.Optional;

public interface MemberRepository {

    Optional<Member> save(Member member);
}
