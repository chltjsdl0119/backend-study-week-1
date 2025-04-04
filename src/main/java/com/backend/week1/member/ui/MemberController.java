package com.backend.week1.member.ui;

import com.backend.week1.member.application.MemberService;
import com.backend.week1.member.application.dto.MemberRequest;
import com.backend.week1.member.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(Model model) {
        model.addAttribute("memberForm", new MemberRequest());
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(@ModelAttribute("memberForm") MemberRequest dto) {
        Member member = new Member(dto.getName());

        memberService.join(member);
        return "redirect:/";
    }
}
