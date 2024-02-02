package com.mju.mentoring.exam.board.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class MemberDescription {

    @Column(nullable = false,unique=true,name = "member_Id")
    private String memberId;

    @Column(nullable = false,unique=true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    public MemberDescription(String memberId, String username, String password, String nickname) {
        this.memberId = memberId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
