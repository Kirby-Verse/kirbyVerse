package com.example.kirbyVerse.member.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "members")
public class Member {
    // 사용자 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 사용자 이름
    private String memberId;

    // 사용자 이메일
    private String email;

    // 사용자 비밀번호
    private String password;

    // 탈퇴 여부
    private boolean deleted_at;

    private Member(String memberId, String email, String password){
        this.memberId = memberId;
        this.email = email;
        this.password = password;
    }

    protected Member(){}


}
