package com.cp.shop.service;

import com.cp.shop.dto.MemberDTO;
import com.cp.shop.model.Member;

public interface MemberService {
    Member create(MemberDTO member);
}
