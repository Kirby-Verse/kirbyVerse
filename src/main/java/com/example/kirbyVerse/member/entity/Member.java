package com.example.kirbyVerse.member.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "members")
public class Member {
    // 사용자 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 사용자 이름
    @Column(nullable = false)
    private String memberId;

    // 사용자 이메일
    @Column(nullable = false, unique = true)
    private String email;

    // 사용자 비밀번호
    @Column(nullable = false)
    private String password;

    // 탈퇴 여부
    @Column(nullable = false)
    private boolean isDeleted = false;

    // 생성자
    private Member(String memberId, String email, String password){
        this.memberId = memberId;
        this.email = email;
        this.password = password;
    }
}
