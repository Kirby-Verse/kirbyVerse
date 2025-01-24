package com.example.kirbyVerse.follow.entity;

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
@Table(name = "follows")
public class Follow {
    // 팔로우 관계 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 팔로우 요청자 ID
    @Column(nullable = false)
    private String follower_id;

    // 팔로우 대상자 ID
    @Column(nullable = false)
    private String following_id;

    // 요청 상태 status enum('Pending', 'Accepted')
    public enum Status {
        PENDING,   // 대기
        ACCEPTED  // 요청 수락
    }

    // 생성 시간
    private String createdAt;

    // 마지막 수정 시간
    private String updatedAt;

    // 생성자
    private Follow(String follower_id, String following_id){
        this.follower_id = follower_id;
        this.following_id = following_id;
    }
}
