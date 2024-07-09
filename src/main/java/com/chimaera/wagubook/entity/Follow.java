package com.chimaera.wagubook.entity;

import jakarta.persistence.*;

import lombok.*;


@Entity
@Getter
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderMethodName = "newBuilder")

public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "follow_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_member_id")
    private Member toMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_member_id")
    private Member fromMember;

    private boolean isEach;

    public void updateEach(boolean isEach) {

        this.isEach = isEach;
    }
}
