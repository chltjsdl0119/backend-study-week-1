package com.backend.week1.member.application.repository;

import com.backend.week1.member.application.interfaces.MemberRepository;
import com.backend.week1.member.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @Override
    public Optional<Member> save(Member member) {
        // TODO 저장 로직 구현
        return Optional.empty();
    }
}
