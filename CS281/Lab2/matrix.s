	.file	"matrix.c"
	.section	.rodata
	.align 8
.LC0:
	.string	"Numerical Recipes run-time error...\n"
.LC1:
	.string	"%s\n"
.LC2:
	.string	"...now exiting to system...\n"
	.text
.globl nerror
	.type	nerror, @function
nerror:
.LFB2:
	pushq	%rbp
.LCFI0:
	movq	%rsp, %rbp
.LCFI1:
	subq	$16, %rsp
.LCFI2:
	movq	%rdi, -8(%rbp)
	movq	stderr(%rip), %rcx
	movl	$36, %edx
	movl	$1, %esi
	movl	$.LC0, %edi
	call	fwrite
	movq	stderr(%rip), %rdi
	movq	-8(%rbp), %rdx
	movl	$.LC1, %esi
	movl	$0, %eax
	call	fprintf
	movq	stderr(%rip), %rcx
	movl	$28, %edx
	movl	$1, %esi
	movl	$.LC2, %edi
	call	fwrite
	movl	$1, %edi
	movl	$0, %eax
	call	exit
.LFE2:
	.size	nerror, .-nerror
	.section	.rodata
	.align 8
.LC3:
	.string	"allocation failure in vector()"
	.text
.globl vector
	.type	vector, @function
vector:
.LFB3:
	pushq	%rbp
.LCFI3:
	movq	%rsp, %rbp
.LCFI4:
	subq	$32, %rsp
.LCFI5:
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movl	-20(%rbp), %edx
	movl	-24(%rbp), %eax
	subl	%edx, %eax
	addl	$1, %eax
	mov	%eax, %eax
	leaq	0(,%rax,4), %rdi
	call	malloc
	movq	%rax, -8(%rbp)
	cmpq	$0, -8(%rbp)
	jne	.L4
	movl	$.LC3, %edi
	movl	$0, %eax
	call	nerror
.L4:
	movl	-20(%rbp), %eax
	cltq
	salq	$2, %rax
	movq	%rax, %rdx
	movq	-8(%rbp), %rax
	subq	%rdx, %rax
	leave
	ret
.LFE3:
	.size	vector, .-vector
	.section	.rodata
	.align 8
.LC4:
	.string	"allocation failure 1 in matrix()"
	.align 8
.LC5:
	.string	"allocation failure 2 in matrix()"
	.text
.globl matrix
	.type	matrix, @function
matrix:
.LFB4:
	pushq	%rbp
.LCFI6:
	movq	%rsp, %rbp
.LCFI7:
	pushq	%rbx
.LCFI8:
	subq	$40, %rsp
.LCFI9:
	movl	%edi, -28(%rbp)
	movl	%esi, -32(%rbp)
	movl	%edx, -36(%rbp)
	movl	%ecx, -40(%rbp)
	movl	-28(%rbp), %edx
	movl	-32(%rbp), %eax
	subl	%edx, %eax
	addl	$1, %eax
	mov	%eax, %eax
	leaq	0(,%rax,8), %rdi
	call	malloc
	movq	%rax, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L8
	movl	$.LC4, %edi
	movl	$0, %eax
	call	nerror
.L8:
	movl	-28(%rbp), %eax
	cltq
	salq	$3, %rax
	subq	%rax, -24(%rbp)
	movl	-28(%rbp), %eax
	movl	%eax, -12(%rbp)
	jmp	.L10
.L11:
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	movq	%rax, %rbx
	addq	-24(%rbp), %rbx
	movl	-36(%rbp), %edx
	movl	-40(%rbp), %eax
	subl	%edx, %eax
	addl	$1, %eax
	mov	%eax, %eax
	leaq	0(,%rax,4), %rdi
	call	malloc
	movq	%rax, (%rbx)
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rax
	testq	%rax, %rax
	jne	.L12
	movl	$.LC5, %edi
	movl	$0, %eax
	call	nerror
.L12:
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	movq	%rax, %rcx
	addq	-24(%rbp), %rcx
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-36(%rbp), %eax
	cltq
	salq	$2, %rax
	movq	%rdx, %rbx
	subq	%rax, %rbx
	movq	%rbx, %rax
	movq	%rax, (%rcx)
	addl	$1, -12(%rbp)
.L10:
	movl	-12(%rbp), %eax
	cmpl	-32(%rbp), %eax
	jle	.L11
	movq	-24(%rbp), %rax
	addq	$40, %rsp
	popq	%rbx
	leave
	ret
.LFE4:
	.size	matrix, .-matrix
.globl zero_matrix
	.type	zero_matrix, @function
zero_matrix:
.LFB5:
	pushq	%rbp
.LCFI10:
	movq	%rsp, %rbp
.LCFI11:
	subq	$32, %rsp
.LCFI12:
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movl	%edx, -28(%rbp)
	movl	%ecx, -32(%rbp)
	movl	-32(%rbp), %ecx
	movl	-28(%rbp), %edx
	movl	-24(%rbp), %esi
	movl	-20(%rbp), %edi
	movl	$0, %eax
	call	matrix
	movq	%rax, -16(%rbp)
	movl	-20(%rbp), %eax
	movl	%eax, -8(%rbp)
	jmp	.L17
.L18:
	movl	-28(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L19
.L20:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-16(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	addq	%rax, %rdx
	movl	$0x00000000, %eax
	movl	%eax, (%rdx)
	addl	$1, -4(%rbp)
.L19:
	movl	-4(%rbp), %eax
	cmpl	-32(%rbp), %eax
	jle	.L20
	addl	$1, -8(%rbp)
.L17:
	movl	-8(%rbp), %eax
	cmpl	-24(%rbp), %eax
	jle	.L18
	movq	-16(%rbp), %rax
	leave
	ret
.LFE5:
	.size	zero_matrix, .-zero_matrix
	.section	.rodata
.LC7:
	.string	"v[%d] = %f\n"
	.text
.globl print_vector
	.type	print_vector, @function
print_vector:
.LFB6:
	pushq	%rbp
.LCFI13:
	movq	%rsp, %rbp
.LCFI14:
	subq	$32, %rsp
.LCFI15:
	movq	%rdi, -24(%rbp)
	movl	%esi, -28(%rbp)
	movl	%edx, -32(%rbp)
	movl	-28(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L25
.L26:
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	addq	-24(%rbp), %rax
	movss	(%rax), %xmm0
	cvtss2sd	%xmm0, %xmm0
	movl	-4(%rbp), %esi
	movl	$.LC7, %edi
	movl	$1, %eax
	call	printf
	addl	$1, -4(%rbp)
.L25:
	movl	-4(%rbp), %eax
	cmpl	-32(%rbp), %eax
	jle	.L26
	leave
	ret
.LFE6:
	.size	print_vector, .-print_vector
	.section	.rodata
.LC8:
	.string	"A[%d,%d] = %f\n"
	.text
.globl print_matrix
	.type	print_matrix, @function
print_matrix:
.LFB7:
	pushq	%rbp
.LCFI16:
	movq	%rsp, %rbp
.LCFI17:
	subq	$48, %rsp
.LCFI18:
	movq	%rdi, -24(%rbp)
	movl	%esi, -28(%rbp)
	movl	%edx, -32(%rbp)
	movl	%ecx, -36(%rbp)
	movl	%r8d, -40(%rbp)
	movl	-28(%rbp), %eax
	movl	%eax, -8(%rbp)
	jmp	.L30
.L31:
	movl	-36(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L32
.L33:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm0
	cvtss2sd	%xmm0, %xmm0
	movl	-4(%rbp), %edx
	movl	-8(%rbp), %esi
	movl	$.LC8, %edi
	movl	$1, %eax
	call	printf
	addl	$1, -4(%rbp)
.L32:
	movl	-4(%rbp), %eax
	cmpl	-40(%rbp), %eax
	jle	.L33
	addl	$1, -8(%rbp)
.L30:
	movl	-8(%rbp), %eax
	cmpl	-32(%rbp), %eax
	jle	.L31
	leave
	ret
.LFE7:
	.size	print_matrix, .-print_matrix
	.section	.rodata
	.align 8
.LC9:
	.string	"allocation failure in submatrix()"
	.text
.globl submatrix
	.type	submatrix, @function
submatrix:
.LFB8:
	pushq	%rbp
.LCFI19:
	movq	%rsp, %rbp
.LCFI20:
	pushq	%rbx
.LCFI21:
	subq	$56, %rsp
.LCFI22:
	movq	%rdi, -32(%rbp)
	movl	%esi, -36(%rbp)
	movl	%edx, -40(%rbp)
	movl	%ecx, -44(%rbp)
	movl	%r8d, -48(%rbp)
	movl	%r9d, -52(%rbp)
	movl	-36(%rbp), %edx
	movl	-40(%rbp), %eax
	subl	%edx, %eax
	addl	$1, %eax
	mov	%eax, %eax
	leaq	0(,%rax,8), %rdi
	call	malloc
	movq	%rax, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L38
	movl	$.LC9, %edi
	movl	$0, %eax
	call	nerror
.L38:
	movl	-52(%rbp), %eax
	cltq
	salq	$3, %rax
	subq	%rax, -24(%rbp)
	movl	-36(%rbp), %eax
	movl	%eax, -16(%rbp)
	movl	-52(%rbp), %eax
	movl	%eax, -12(%rbp)
	jmp	.L40
.L41:
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	movq	%rax, %rcx
	addq	-24(%rbp), %rcx
	movl	-16(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-44(%rbp), %eax
	cltq
	salq	$2, %rax
	addq	%rax, %rdx
	movl	16(%rbp), %eax
	cltq
	salq	$2, %rax
	movq	%rdx, %rbx
	subq	%rax, %rbx
	movq	%rbx, %rax
	movq	%rax, (%rcx)
	addl	$1, -16(%rbp)
	addl	$1, -12(%rbp)
.L40:
	movl	-16(%rbp), %eax
	cmpl	-40(%rbp), %eax
	jle	.L41
	movq	-24(%rbp), %rax
	addq	$56, %rsp
	popq	%rbx
	leave
	ret
.LFE8:
	.size	submatrix, .-submatrix
.globl insert_matrix
	.type	insert_matrix, @function
insert_matrix:
.LFB9:
	pushq	%rbp
.LCFI23:
	movq	%rsp, %rbp
.LCFI24:
	movq	%rdi, -24(%rbp)
	movl	%esi, -28(%rbp)
	movl	%edx, -32(%rbp)
	movl	%ecx, -36(%rbp)
	movl	%r8d, -40(%rbp)
	movq	%r9, -48(%rbp)
	movl	-28(%rbp), %eax
	movl	%eax, -16(%rbp)
	movl	16(%rbp), %eax
	movl	%eax, -8(%rbp)
	jmp	.L45
.L46:
	movl	-36(%rbp), %eax
	movl	%eax, -12(%rbp)
	movl	24(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L47
.L48:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-48(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-16(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-12(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movl	(%rax), %eax
	movl	%eax, (%rcx)
	addl	$1, -12(%rbp)
	addl	$1, -4(%rbp)
.L47:
	movl	-12(%rbp), %eax
	cmpl	-40(%rbp), %eax
	jle	.L48
	addl	$1, -16(%rbp)
	addl	$1, -8(%rbp)
.L45:
	movl	-16(%rbp), %eax
	cmpl	-32(%rbp), %eax
	jle	.L46
	leave
	ret
.LFE9:
	.size	insert_matrix, .-insert_matrix
.globl free_vector
	.type	free_vector, @function
free_vector:
.LFB10:
	pushq	%rbp
.LCFI25:
	movq	%rsp, %rbp
.LCFI26:
	subq	$16, %rsp
.LCFI27:
	movq	%rdi, -8(%rbp)
	movl	%esi, -12(%rbp)
	movl	%edx, -16(%rbp)
	movl	-12(%rbp), %eax
	cltq
	salq	$2, %rax
	addq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	free
	leave
	ret
.LFE10:
	.size	free_vector, .-free_vector
.globl free_matrix
	.type	free_matrix, @function
free_matrix:
.LFB11:
	pushq	%rbp
.LCFI28:
	movq	%rsp, %rbp
.LCFI29:
	subq	$48, %rsp
.LCFI30:
	movq	%rdi, -24(%rbp)
	movl	%esi, -28(%rbp)
	movl	%edx, -32(%rbp)
	movl	%ecx, -36(%rbp)
	movl	%r8d, -40(%rbp)
	movl	-32(%rbp), %eax
	movl	%eax, -4(%rbp)
	jmp	.L55
.L56:
	movl	-4(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-36(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movq	%rax, %rdi
	call	free
	subl	$1, -4(%rbp)
.L55:
	movl	-4(%rbp), %eax
	cmpl	-28(%rbp), %eax
	jge	.L56
	movl	-28(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	free
	leave
	ret
.LFE11:
	.size	free_matrix, .-free_matrix
.globl free_submatrix
	.type	free_submatrix, @function
free_submatrix:
.LFB12:
	pushq	%rbp
.LCFI31:
	movq	%rsp, %rbp
.LCFI32:
	subq	$32, %rsp
.LCFI33:
	movq	%rdi, -8(%rbp)
	movl	%esi, -12(%rbp)
	movl	%edx, -16(%rbp)
	movl	%ecx, -20(%rbp)
	movl	%r8d, -24(%rbp)
	movl	-16(%rbp), %edx
	movl	-12(%rbp), %esi
	movq	-8(%rbp), %rdi
	movl	$0, %eax
	call	free_vector
	leave
	ret
.LFE12:
	.size	free_submatrix, .-free_submatrix
	.section	.rodata
	.align 16
.LC10:
	.long	2147483647
	.long	0
	.long	0
	.long	0
	.text
.globl matrix_norm
	.type	matrix_norm, @function
matrix_norm:
.LFB13:
	pushq	%rbp
.LCFI34:
	movq	%rsp, %rbp
.LCFI35:
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movq	%rdx, -32(%rbp)
	movl	$1, -8(%rbp)
	jmp	.L62
.L63:
	movl	$1, -4(%rbp)
	jmp	.L64
.L65:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm1
	movss	.LC10(%rip), %xmm0
	andps	%xmm0, %xmm1
	movss	-12(%rbp), %xmm0
	addss	%xmm1, %xmm0
	movss	%xmm0, -12(%rbp)
	addl	$1, -4(%rbp)
.L64:
	movl	-4(%rbp), %eax
	cmpl	-24(%rbp), %eax
	jle	.L65
	addl	$1, -8(%rbp)
.L62:
	movl	-8(%rbp), %eax
	cmpl	-20(%rbp), %eax
	jle	.L63
	movl	-12(%rbp), %eax
	movl	%eax, -36(%rbp)
	movss	-36(%rbp), %xmm0
	leave
	ret
.LFE13:
	.size	matrix_norm, .-matrix_norm
.globl matrix_add
	.type	matrix_add, @function
matrix_add:
.LFB14:
	pushq	%rbp
.LCFI36:
	movq	%rsp, %rbp
.LCFI37:
	subq	$48, %rsp
.LCFI38:
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movq	%rdx, -32(%rbp)
	movq	%rcx, -40(%rbp)
	movl	-24(%rbp), %ecx
	movl	-20(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	matrix
	movq	%rax, -16(%rbp)
	movl	$1, -8(%rbp)
	jmp	.L70
.L71:
	movl	$1, -4(%rbp)
	jmp	.L72
.L73:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-16(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm1
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-40(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm0
	addss	%xmm1, %xmm0
	movss	%xmm0, (%rcx)
	addl	$1, -4(%rbp)
.L72:
	movl	-4(%rbp), %eax
	cmpl	-24(%rbp), %eax
	jle	.L73
	addl	$1, -8(%rbp)
.L70:
	movl	-8(%rbp), %eax
	cmpl	-20(%rbp), %eax
	jle	.L71
	movq	-16(%rbp), %rax
	leave
	ret
.LFE14:
	.size	matrix_add, .-matrix_add
.globl matrix_sub
	.type	matrix_sub, @function
matrix_sub:
.LFB15:
	pushq	%rbp
.LCFI39:
	movq	%rsp, %rbp
.LCFI40:
	subq	$48, %rsp
.LCFI41:
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movq	%rdx, -32(%rbp)
	movq	%rcx, -40(%rbp)
	movl	-24(%rbp), %ecx
	movl	-20(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	matrix
	movq	%rax, -16(%rbp)
	movl	$1, -8(%rbp)
	jmp	.L78
.L79:
	movl	$1, -4(%rbp)
	jmp	.L80
.L81:
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-16(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm1
	movl	-8(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-40(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm0
	movaps	%xmm1, %xmm2
	subss	%xmm0, %xmm2
	movaps	%xmm2, %xmm0
	movss	%xmm0, (%rcx)
	addl	$1, -4(%rbp)
.L80:
	movl	-4(%rbp), %eax
	cmpl	-24(%rbp), %eax
	jle	.L81
	addl	$1, -8(%rbp)
.L78:
	movl	-8(%rbp), %eax
	cmpl	-20(%rbp), %eax
	jle	.L79
	movq	-16(%rbp), %rax
	leave
	ret
.LFE15:
	.size	matrix_sub, .-matrix_sub
.globl matrix_prod
	.type	matrix_prod, @function
matrix_prod:
.LFB16:
	pushq	%rbp
.LCFI42:
	movq	%rsp, %rbp
.LCFI43:
	subq	$64, %rsp
.LCFI44:
	movl	%edi, -36(%rbp)
	movl	%esi, -40(%rbp)
	movl	%edx, -44(%rbp)
	movl	%ecx, -48(%rbp)
	movq	%r8, -56(%rbp)
	movq	%r9, -64(%rbp)
	movl	-48(%rbp), %ecx
	movl	-36(%rbp), %esi
	movl	$1, %edx
	movl	$1, %edi
	movl	$0, %eax
	call	zero_matrix
	movq	%rax, -24(%rbp)
	movl	$1, -12(%rbp)
	jmp	.L86
.L87:
	movl	$1, -8(%rbp)
	jmp	.L88
.L89:
	movl	$1, -4(%rbp)
	jmp	.L90
.L91:
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-8(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rcx
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-24(%rbp), %rax
	movq	(%rax), %rdx
	movl	-8(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm1
	movl	-12(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-56(%rbp), %rax
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$2, %rax
	leaq	(%rdx,%rax), %rax
	movss	(%rax), %xmm2
	movl	-4(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	-64(%rbp), %rax
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
.L90:
	movl	-4(%rbp), %eax
	cmpl	-40(%rbp), %eax
	jle	.L91
	addl	$1, -8(%rbp)
.L88:
	movl	-8(%rbp), %eax
	cmpl	-48(%rbp), %eax
	jle	.L89
	addl	$1, -12(%rbp)
.L86:
	movl	-12(%rbp), %eax
	cmpl	-36(%rbp), %eax
	jle	.L87
	movq	-24(%rbp), %rax
	leave
	ret
.LFE16:
	.size	matrix_prod, .-matrix_prod
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
.LSFDE5:
	.long	.LEFDE5-.LASFDE5
.LASFDE5:
	.long	.LASFDE5-.Lframe1
	.long	.LFB4
	.long	.LFE4-.LFB4
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI6-.LFB4
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI7-.LCFI6
	.byte	0xd
	.uleb128 0x6
	.byte	0x4
	.long	.LCFI9-.LCFI7
	.byte	0x83
	.uleb128 0x3
	.align 8
.LEFDE5:
.LSFDE7:
	.long	.LEFDE7-.LASFDE7
.LASFDE7:
	.long	.LASFDE7-.Lframe1
	.long	.LFB5
	.long	.LFE5-.LFB5
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI10-.LFB5
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI11-.LCFI10
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE7:
.LSFDE9:
	.long	.LEFDE9-.LASFDE9
.LASFDE9:
	.long	.LASFDE9-.Lframe1
	.long	.LFB6
	.long	.LFE6-.LFB6
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI13-.LFB6
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI14-.LCFI13
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE9:
.LSFDE11:
	.long	.LEFDE11-.LASFDE11
.LASFDE11:
	.long	.LASFDE11-.Lframe1
	.long	.LFB7
	.long	.LFE7-.LFB7
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI16-.LFB7
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI17-.LCFI16
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE11:
.LSFDE13:
	.long	.LEFDE13-.LASFDE13
.LASFDE13:
	.long	.LASFDE13-.Lframe1
	.long	.LFB8
	.long	.LFE8-.LFB8
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI19-.LFB8
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI20-.LCFI19
	.byte	0xd
	.uleb128 0x6
	.byte	0x4
	.long	.LCFI22-.LCFI20
	.byte	0x83
	.uleb128 0x3
	.align 8
.LEFDE13:
.LSFDE15:
	.long	.LEFDE15-.LASFDE15
.LASFDE15:
	.long	.LASFDE15-.Lframe1
	.long	.LFB9
	.long	.LFE9-.LFB9
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI23-.LFB9
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI24-.LCFI23
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE15:
.LSFDE17:
	.long	.LEFDE17-.LASFDE17
.LASFDE17:
	.long	.LASFDE17-.Lframe1
	.long	.LFB10
	.long	.LFE10-.LFB10
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI25-.LFB10
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI26-.LCFI25
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE17:
.LSFDE19:
	.long	.LEFDE19-.LASFDE19
.LASFDE19:
	.long	.LASFDE19-.Lframe1
	.long	.LFB11
	.long	.LFE11-.LFB11
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI28-.LFB11
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI29-.LCFI28
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE19:
.LSFDE21:
	.long	.LEFDE21-.LASFDE21
.LASFDE21:
	.long	.LASFDE21-.Lframe1
	.long	.LFB12
	.long	.LFE12-.LFB12
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI31-.LFB12
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI32-.LCFI31
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE21:
.LSFDE23:
	.long	.LEFDE23-.LASFDE23
.LASFDE23:
	.long	.LASFDE23-.Lframe1
	.long	.LFB13
	.long	.LFE13-.LFB13
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI34-.LFB13
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI35-.LCFI34
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE23:
.LSFDE25:
	.long	.LEFDE25-.LASFDE25
.LASFDE25:
	.long	.LASFDE25-.Lframe1
	.long	.LFB14
	.long	.LFE14-.LFB14
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI36-.LFB14
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI37-.LCFI36
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE25:
.LSFDE27:
	.long	.LEFDE27-.LASFDE27
.LASFDE27:
	.long	.LASFDE27-.Lframe1
	.long	.LFB15
	.long	.LFE15-.LFB15
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI39-.LFB15
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI40-.LCFI39
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE27:
.LSFDE29:
	.long	.LEFDE29-.LASFDE29
.LASFDE29:
	.long	.LASFDE29-.Lframe1
	.long	.LFB16
	.long	.LFE16-.LFB16
	.uleb128 0x0
	.byte	0x4
	.long	.LCFI42-.LFB16
	.byte	0xe
	.uleb128 0x10
	.byte	0x86
	.uleb128 0x2
	.byte	0x4
	.long	.LCFI43-.LCFI42
	.byte	0xd
	.uleb128 0x6
	.align 8
.LEFDE29:
	.ident	"GCC: (GNU) 4.1.2 (Ubuntu 4.1.2-0ubuntu4)"
	.section	.note.GNU-stack,"",@progbits
