	.file	"block.c"
	.text
.globl block_prod
	.type	block_prod, @function
block_prod:
.LFB2:
	pushq	%rbp
.LCFI0:
	movq	%rsp, %rbp
.LCFI1:
	subq	$64, %rsp
.LCFI2:
	movl	%edi, -36(%rbp)
	movl	%esi, -40(%rbp)
	movl	%edx, -44(%rbp)
	movl	%ecx, -48(%rbp)
	movl	%r8d, -52(%rbp)
	movl	%r9d, -56(%rbp)
	movl	-44(%rbp), %eax
	movl	%eax, %ecx
	imull	-56(%rbp), %ecx
	movl	-36(%rbp), %eax
	movl	%eax, %esi
	imull	-48(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	zero_matrix
	movq	%rax, -32(%rbp)
	movl	$1, -24(%rbp)
	jmp	.L2
.L3:
	movl	$1, -20(%rbp)
	jmp	.L4
.L5:
	movl	$1, -16(%rbp)
	jmp	.L6
.L7:
	movl	-24(%rbp), %eax
	movl	%eax, -12(%rbp)
	jmp	.L8
.L9:
	movl	-20(%rbp), %eax
	movl	%eax, -8(%rbp)
	jmp	.L10
.L11:
	movl	-16(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L12
.L13:
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-8(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-8(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm1
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	16(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm2
	movl	-4(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-8(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm0
	mulss	%xmm2, %xmm0
	addss	%xmm1, %xmm0
	movss	%xmm0, (%rcx)
	addl	$1, -4(%rbp)
.L12:
	movl	-52(%rbp), %eax
	addl	-16(%rbp), %eax
	cmpl	-4(%rbp), %eax
	jg	.L13
	addl	$1, -8(%rbp)
.L10:
	movl	-56(%rbp), %eax
	addl	-20(%rbp), %eax
	cmpl	-8(%rbp), %eax
	jg	.L11
	addl	$1, -12(%rbp)
.L8:
	movl	-48(%rbp), %eax
	addl	-24(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jg	.L9
	movl	-52(%rbp), %eax
	addl	%eax, -16(%rbp)
.L6:
	movl	-40(%rbp), %eax
	imull	-52(%rbp), %eax
	cmpl	-16(%rbp), %eax
	jg	.L7
	movl	-56(%rbp), %eax
	addl	%eax, -20(%rbp)
.L4:
	movl	-44(%rbp), %eax
	imull	-56(%rbp), %eax
	cmpl	-20(%rbp), %eax
	jg	.L5
	movl	-48(%rbp), %eax
	addl	%eax, -24(%rbp)
.L2:
	movl	-36(%rbp), %eax
	imull	-48(%rbp), %eax
	cmpl	-24(%rbp), %eax
	jg	.L3
	movq	-32(%rbp), %rax
	leave
	ret
.LFE2:
	.size	block_prod, .-block_prod
	.section	.eh_frame,"a",@progbits
.Lframe1:
	.long	.LECIE1-.LSCIE1
.LSCIE1:
	.long	0x0
	.byte	0x1
	.string	"zR"
	.uleb128 0x1
	.sleb128 -8
	.byte	0x10
	.uleb128 0x1
	.byte	0x3
	.byte	0xc
	.uleb128 0x7
	.uleb128 0x8
	.byte	0x90
	.uleb128 0x1
	.align 8
.LECIE1:
.LSFDE1:
	.long	.LEFDE1-.LASFDE1
.LASFDE1:
	.long	.LASFDE1-.Lframe1
	.long	.LFB2
	.long	.LFE2-.LFB2
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI0-.LFB2
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI1-.LCFI0
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE1:
	.ident	"GCC: (GNU) 4.1.2 (Ubuntu 4.1.2-0ubuntu4)"
	.section	.note.GNU-stack,"",@progbits
