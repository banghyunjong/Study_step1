package com.jojoldu.admin.domain.posts;

import com.jojoldu.admin.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity

public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;
    private String author;

    @Builder
    public Posts(String title, String contents,String author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }
    @Builder
    public void update(String title, String contents) {
        this.title =  title;
        this.contents = contents;
    }



}
