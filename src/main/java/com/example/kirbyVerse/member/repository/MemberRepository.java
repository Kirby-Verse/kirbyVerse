package com.example.kirbyVerse.member.repository;

import com.example.kirbyVerse.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
