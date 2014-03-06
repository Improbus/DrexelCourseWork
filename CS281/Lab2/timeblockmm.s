	.file	"timeblockmm.c"
	.section	.rodata
	.align 8
.LC0:
	.long	0
	.long	1093567616
	.text
.globl get_seconds
	.type	get_seconds, @function
get_seconds:
.LFB2:
	pushq	%rbp
.LCFI0:
	movq	%rsp, %rbp
.LCFI1:
	subq	$32, %rsp
.LCFI2:
	call	clock
	movq	%rax, -8(%rbp)
	cvtsi2sdq	-8(%rbp), %xmm1
	movsd	.LC0(%rip), %xmm0
	movapd	%xmm1, %xmm2
	divsd	%xmm0, %xmm2
	movapd	%xmm2, %xmm0
	movsd	%xmm0, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, -24(%rbp)
	movsd	-24(%rbp), %xmm0
	leave
	ret
.LFE2:
	.size	get_seconds, .-get_seconds
	.section	.rodata
.LC1:
	.string	"Enter n1:  "
.LC2:
	.string	"%d"
.LC3:
	.string	"n1 = %d\n"
.LC4:
	.string	"Enter n2:  "
.LC5:
	.string	"n2 = %d\n"
.LC6:
	.string	"n = %d X %d = %d\n"
	.align 8
.LC7:
	.string	"Time for matrix_prod = %f sec\n"
.LC8:
	.string	"Time for block_prod = %f sec\n"
	.text
.globl main
	.type	main, @function
main:
.LFB3:
	pushq	%rbp
.LCFI3:
	movq	%rsp, %rbp
.LCFI4:
	subq	$96, %rsp
.LCFI5:
	movl	$.LC1, %edi
	movl	$0, %eax
	call	printf
	leaq	-16(%rbp), %rsi
	movl	$.LC2, %edi
	movl	$0, %eax
	call	scanf
	movl	-16(%rbp), %esi
	movl	$.LC3, %edi
	movl	$0, %eax
	call	printf
	movl	$.LC4, %edi
	movl	$0, %eax
	call	printf
	leaq	-20(%rbp), %rsi
	movl	$.LC2, %edi
	movl	$0, %eax
	call	scanf
	movl	-20(%rbp), %esi
	movl	$.LC5, %edi
	movl	$0, %eax
	call	printf
	movl	-16(%rbp), %edx
	movl	-20(%rbp), %eax
	imull	%edx, %eax
	movl	%eax, -12(%rbp)
	movl	-20(%rbp), %edx
	movl	-16(%rbp), %esi
	movl	-12(%rbp), %ecx
	movl	$.LC6, %edi
	movl	$0, %eax
	call	printf
	movl	-12(%rbp), %ecx
	movl	-12(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	matrix
	movq	%rax, -64(%rbp)
	movl	$1, -8(%rbp)
	jmp	.L4
.L5:
	movl	$1, -4(%rbp)
	jmp	.L6
.L7:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-64(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	addq	%rax, %rdx
	movl	-4(%rbp), %eax
	addl	-8(%rbp), %eax
	cvtsi2ss	%eax, %xmm0
	movss	%xmm0, (%rdx)
	addl	$1, -4(%rbp)
.L6:
	movl	-4(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jle	.L7
	addl	$1, -8(%rbp)
.L4:
	movl	-8(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jle	.L5
	movl	-12(%rbp), %ecx
	movl	-12(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	matrix
	movq	%rax, -56(%rbp)
	movl	$1, -8(%rbp)
	jmp	.L10
.L11:
	movl	$1, -4(%rbp)
	jmp	.L12
.L13:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-56(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-4(%rbp), %edx
	movl	-8(%rbp), %eax
	subl	%edx, %eax
	cvtsi2ss	%eax, %xmm0
	movss	%xmm0, (%rcx)
	addl	$1, -4(%rbp)
.L12:
	movl	-4(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jle	.L13
	addl	$1, -8(%rbp)
.L10:
	movl	-8(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jle	.L11
	movl	$0, %eax
	call	get_seconds
	movsd	%xmm0, -72(%rbp)
	movq	-72(%rbp), %rax
	movq	%rax, -40(%rbp)
	movq	-56(%rbp), %rax
	movq	-64(%rbp), %rdx
	movl	-12(%rbp), %ecx
	movl	-12(%rbp), %esi
	movl	-12(%rbp), %edi
	movl	-12(%rbp), %r10d
	movq	%rax, %r9
	movq	%rdx, %r8
	movl	%esi, %edx
	movl	%edi, %esi
	movl	%r10d, %edi
	movl	$0, %eax
	call	matrix_prod
	movq	%rax, -48(%rbp)
	movl	$0, %eax
	call	get_seconds
	movsd	%xmm0, -72(%rbp)
	movq	-72(%rbp), %rax
	movq	%rax, -32(%rbp)
	movsd	-32(%rbp), %xmm0
	subsd	-40(%rbp), %xmm0
	movl	$.LC7, %edi
	movl	$1, %eax
	call	printf
	movl	$0, %eax
	call	get_seconds
	movsd	%xmm0, -72(%rbp)
	movq	-72(%rbp), %rax
	movq	%rax, -40(%rbp)
	movl	-20(%rbp), %edx
	movl	-20(%rbp), %ecx
	movl	-20(%rbp), %esi
	movl	-16(%rbp), %edi
	movl	-16(%rbp), %r10d
	movl	-16(%rbp), %r11d
	movq	-56(%rbp), %rax
	movq	%rax, 8(%rsp)
	movq	-64(%rbp), %rax
	movq	%rax, (%rsp)
	movl	%edx, %r9d
	movl	%ecx, %r8d
	movl	%esi, %ecx
	movl	%edi, %edx
	movl	%r10d, %esi
	movl	%r11d, %edi
	call	block_prod
	movq	%rax, -48(%rbp)
	movl	$0, %eax
	call	get_seconds
	movsd	%xmm0, -72(%rbp)
	movq	-72(%rbp), %rax
	movq	%rax, -32(%rbp)
	movsd	-32(%rbp), %xmm0
	subsd	-40(%rbp), %xmm0
	movl	$.LC8, %edi
	movl	$1, %eax
	call	printf
	leave
	ret
.LFE3:
	.size	main, .-main
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
.LSFDE3:
	.long	.LEFDE3-.LASFDE3
.LASFDE3:
	.long	.LASFDE3-.Lframe1
	.long	.LFB3
	.long	.LFE3-.LFB3
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI3-.LFB3
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI4-.LCFI3
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE3:
	.ident	"GCC: (GNU) 4.1.2 (Ubuntu 4.1.2-0ubuntu4)"
	.section	.note.GNU-stack,"",@progbits
