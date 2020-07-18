package com.cp.shop.service;

import com.cp.shop.dto.MemberDTO;
import com.cp.shop.model.Member;
import com.cp.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    final private MemberRepository memberRepository;
    final private ModelMapper modelMapper;

    @Override
    public Member create(MemberDTO member) {

        return this.memberRepository.save(this.modelMapper.map(member, Member.class));
    }
}
