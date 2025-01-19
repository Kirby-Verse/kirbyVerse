package com.example.kirbyVerse.post.entity;

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
@Table(name = "posts")
public class Post{
    // 게시글 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 작성자 이름
    private String memberId;

    // 게시글 제목
    private String title;

    // 게시글 내용
    private String content;

    // 게시글 생성 시간
    private String createdAt;

    // 게시글 마지막 수정 시간
    private String updatedAt;

    // 삭제된 시간
    private String deletedAt;

    // 생성자
    private Post(String memberId, String title, String content){
        this.memberId = memberId;
        this.title = title;
        this.content = content;
    }
}
