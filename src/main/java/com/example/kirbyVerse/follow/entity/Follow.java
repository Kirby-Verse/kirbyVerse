package com.example.kirbyVerse.follow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "follows")
public class Follow {
    // 팔로우 관계 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 팔로우 요청자 ID
    private String follower_id;

    // 팔로우 대상자 ID
    private String following_id;

    // 요청 상태 status enum('Pending', 'Accepted', 'Rejected')


    // 생성 시간
    private String created_at;

    // 마지막 수정 시간
    private String updated_at;

    private Follow(String follower_id, String following_id){
        this.follower_id = follower_id;
        this.following_id = following_id;
    }

    protected Follow(){}
}
