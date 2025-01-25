package com.example.kirbyVerse.member.controller;

import com.example.kirbyVerse.member.dto.MemberCreateRequestDto;
import com.example.kirbyVerse.member.dto.MemberCreateResponseDto;
import com.example.kirbyVerse.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
@Validated
public class MemberController {
    private final MemberService memberService;

    /*
    * 사용자 생성 API
    * */
    @PostMapping("/signup")
    public ResponseEntity<MemberCreateResponseDto> createMember(
            @Valid @ResponseBody MemberCreateRequestDto dto) {
        this.memberService.checkRegisteredMember(dto.getEmail);

        MemberCreateResponseDto memberCreateResponseDto = this.memberService.createMember(
                dto.getMemberId(),
                dto.getPassword());
        return new ResponseEntity<>(memberCreateResponseDto, HttpStatus.CREATED);
    }
}
