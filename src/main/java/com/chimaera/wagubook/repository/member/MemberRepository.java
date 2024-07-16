package com.chimaera.wagubook.repository.member;


import com.chimaera.wagubook.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom  {
    Optional<Member> findByUsername(String username);

    //todo: searchMembers와 차이점?
    Page<Member> findByUsernameContaining(String username, Pageable pageable);
}
