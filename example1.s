	.text
	.file	"example1.ll"
	.globl	an                              # -- Begin function an
	.p2align	4, 0x90
	.type	an,@function
an:                                     # @an
# %bb.0:
	movl	$10, -8(%rsp)
	movl	$100, -4(%rsp)
	movl	$100, %eax
	retq
.Lfunc_end0:
	.size	an, .Lfunc_end0-an
                                        # -- End function
	.globl	main                            # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
# %bb.0:
	pushq	%rbx
	subq	$16, %rsp
	movq	a@GOTPCREL(%rip), %rbx
	movabsq	$4622382067542392832, %rax      # imm = 0x4026000000000000
	movq	%rax, (%rbx)
	callq	an@PLT
	movl	%eax, 12(%rsp)
	movsd	(%rbx), %xmm0                   # xmm0 = mem[0],zero
	movq	strf@GOTPCREL(%rip), %rdi
	movb	$1, %al
	callq	printf@PLT
	movl	12(%rsp), %esi
	movq	strp@GOTPCREL(%rip), %rdi
	xorl	%eax, %eax
	callq	printf@PLT
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbx
	retq
.Lfunc_end1:
	.size	main, .Lfunc_end1-main
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

	.type	a,@object                       # @a
	.bss
	.globl	a
	.p2align	3
a:
	.quad	0x0000000000000000              # double 0
	.size	a, 8

	.section	".note.GNU-stack","",@progbits
