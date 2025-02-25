	.text
	.file	"example1.ll"
	.globl	main                            # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
# %bb.0:
	pushq	%rbx
	subq	$16, %rsp
	movl	$4, (%rsp)
	movabsq	$4607182418800017408, %rax      # imm = 0x3FF0000000000000
	movq	%rax, 8(%rsp)
	movq	b@GOTPCREL(%rip), %rcx
	movl	$4, (%rcx)
	movq	c@GOTPCREL(%rip), %rbx
	movq	%rax, (%rbx)
	movq	strp@GOTPCREL(%rip), %rdi
	movl	$4, %esi
	xorl	%eax, %eax
	callq	printf@PLT
	movsd	(%rbx), %xmm0                   # xmm0 = mem[0],zero
	movq	strf@GOTPCREL(%rip), %rdi
	movb	$1, %al
	callq	printf@PLT
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbx
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
                                        # -- End function
	.type	strp,@object                    # @strp
	.section	.rodata,"a",@progbits
	.globl	strp
strp:
	.asciz	"%d\n"
	.size	strp, 4

	.type	strs,@object                    # @strs
	.globl	strs
strs:
	.asciz	"%d"
	.size	strs, 3

	.type	strf,@object                    # @strf
	.globl	strf
strf:
	.asciz	"%f\n"
	.size	strf, 4

	.type	strd,@object                    # @strd
	.globl	strd
strd:
	.asciz	"%lf"
	.size	strd, 4

	.type	strl,@object                    # @strl
	.globl	strl
strl:
	.asciz	"%lld\n"
	.size	strl, 6

	.type	b,@object                       # @b
	.bss
	.globl	b
	.p2align	2
b:
	.long	0                               # 0x0
	.size	b, 4

	.type	c,@object                       # @c
	.globl	c
	.p2align	3
c:
	.quad	0x0000000000000000              # double 0
	.size	c, 8

	.section	".note.GNU-stack","",@progbits
