package com.example.kirbyVerse.member.dto;

import com.example.kirbyVerse.member.entity.Member;
import java.time.format.DateTimeFormatter;
import lombok.Getter;

@Getter
public class MemberCreateRequestDto {

    // 사용자 이름
    private final String memberId;

    // 사용자 이메일
    private final String email;

    // 생성일
    private final String createdAt;

    // 수정일
    private final String updatedAt;

    private MemberCreateResponseDto(String memberId, String email, String createdAt, String updatedAt) {
        this.memberId = memberId;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private static MemberCreateResponseDto of(Member member) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return new MemberCreateResponseDto(
                member.getMemberId(),
                member.getEmail(),
                member.getCreatedAt().format(dtf),
                member.getUpdatedAt().format(dtf)
        );
    }



}
