	.file	"loop.c"
	.text
	.p2align 4,,15
.globl loop
	.type	loop, @function
loop:
.LFB12:
	testl	%ecx, %ecx
	jle	.L5
	xorl	%r8d, %r8d
	xorl	%eax, %eax
	.p2align 4,,7
.L4:
	movsd	(%rsi,%rax,8), %xmm0
	addl	$1, %r8d
	addsd	(%rdx,%rax,8), %xmm0
	movsd	%xmm0, (%rdi,%rax,8)
	addq	$1, %rax
	cmpl	%r8d, %ecx
	jne	.L4
.L5:
	rep ; ret
.LFE12:
	.size	loop, .-loop
	.section	.rodata.str1.1,"aMS",@progbits,1
.LC0:
	.string	"Enter vector size:  "
.LC1:
	.string	"%d"
.LC2:
	.string	"c[%d] = %g\n"
	.text
	.p2align 4,,15
.globl main
	.type	main, @function
main:
.LFB13:
	pushq	%r12
.LCFI0:
	movl	$.LC0, %edi
	xorl	%eax, %eax
	pushq	%rbp
.LCFI1:
	pushq	%rbx
.LCFI2:
	subq	$24016, %rsp
.LCFI3:
	call	printf
	leaq	24012(%rsp), %rsi
	xorl	%eax, %eax
	movl	$.LC1, %edi
	call	scanf
	movl	24012(%rsp), %ecx
	testl	%ecx, %ecx
	jle	.L16
	leaq	16000(%rsp), %rdi
	leaq	8000(%rsp), %rsi
	movl	%ecx, %eax
	xorl	%edx, %edx
	.p2align 4,,7
.L11:
	cvtsi2sd	%edx, %xmm0
	movsd	%xmm0, (%rdi,%rdx,8)
	cvtsi2sd	%eax, %xmm0
	movsd	%xmm0, (%rsi,%rdx,8)
	addq	$1, %rdx
	subl	$1, %eax
	jne	.L11
	xorl	%edx, %edx
	xorl	%eax, %eax
	movq	%rsp, %r12
	.p2align 4,,7
.L13:
	movsd	(%rdi,%rax,8), %xmm0
	addl	$1, %edx
	addsd	(%rsi,%rax,8), %xmm0
	movsd	%xmm0, (%r12,%rax,8)
	addq	$1, %rax
	cmpl	%ecx, %edx
	jne	.L13
	xorl	%ebp, %ebp
	.p2align 4,,7
.L15:
	movsd	(%r12,%rbp,8), %xmm0
	movl	%ebp, %ebx
	movl	%ebp, %esi
	movl	$.LC2, %edi
	movl	$1, %eax
	call	printf
	addq	$1, %rbp
	addl	$1, %ebx
	cmpl	%ebx, 24012(%rsp)
	jg	.L15
.L16:
	addq	$24016, %rsp
	popq	%rbx
	popq	%rbp
	popq	%r12
	ret
.LFE13:
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
	.long	.LFB12
	.long	.LFE12-.LFB12
	.uleb128 0x0
	.align 8
.LEFDE1:
.LSFDE3:
	.long	.LEFDE3-.LASFDE3
.LASFDE3:
	.long	.LASFDE3-.Lframe1
	.long	.LFB13
	.long	.LFE13-.LFB13
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI0-.LFB13
	.byte	0xe
	.uleb128 0x10
	.byte	0x4
	.long	.LCFI1-.LCFI0
	.byte	0xe
	.uleb128 0x18
	.byte	0x4
	.long	.LCFI2-.LCFI1
	.byte	0xe
	.uleb128 0x20
	.byte	0x4
	.long	.LCFI3-.LCFI2
	.byte	0xe
	.uleb128 0x5df0
	.byte	0x83
	.uleb128 0x4
	.byte	0x86
	.uleb128 0x3
	.byte	0x8c
	.uleb128 0x2
	.align 8
.LEFDE3:
	.ident	"GCC: (GNU) 4.1.2 (Ubuntu 4.1.2-0ubuntu4)"
	.section	.note.GNU-stack,"",@progbits
