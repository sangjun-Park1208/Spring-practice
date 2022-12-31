package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) { // 회원가입
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) { // 회원조회
        return memberRepository.findById(memberId);
    }
}
