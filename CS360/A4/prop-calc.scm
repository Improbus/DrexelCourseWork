(define apply-in-underlying-scheme apply)

(define (eval exp env)
  (cond ((self-evaluating? exp) exp)
        ((variable? exp) (lookup-variable-value exp env))
        ((and? exp) (and exp env))
        ((or? exp) (or exp env))
        ((not? exp) (not exp env))
        ((implies? exp) (implies exp env))
        ((equiv? exp)(equiv exp env))
        (else
         (error "Unknown expression type -- EVAL" exp))))
		 
(define (apply procedure arguments)
  (cond ((primitive-procedure? procedure)
         (apply-primitive-procedure procedure arguments))
        ((compound-procedure? procedure)
         (eval-sequence
           (procedure-body procedure)
           (extend-environment
             (procedure-parameters procedure)
             arguments
             (procedure-environment procedure))))
        (else
         (error
          "Unknown procedure type -- APPLY" procedure))))
	
(define count-var
	(lambda (exp)
	(cond 
	((null? (cdr exp)) '())
	(variable? (cons 'x (count-var (cdr exp)))))))
	
(define (gen-table vars)
   (if (null? vars)
       '(())
       (let ((rec (gen-table (cdr vars))))
          (append (cons-to-all #f rec) (cons-to-all #t rec))))) 

		  		  
(define (cons-to-all elt lst)
   (map (lambda (y) (cons elt y)) lst)) 
   
(define taut-env)
 
(define (taut-test exp env)
	(eval exp (cons (list 'p (caar env))(cons (list 'q (car (cdr (car env)))) '()))) 
	(if (null? (cdr env))
		'(()))
	(eval exp (cdr env)))
		
	

	 
(define (self-evaluating? exp)
  (cond ((true? exp) true)
		( else false)))
		
(define (true? x)
  (cond ((eq? x '#t) true)
		((eq? x '#f) true)
		((string? exp) false)
		((number? exp) false)
		(else false)))

(define (false? x)
   (cond ((eq? x '#t) true)
		((eq? x '#f) true)
		((string? exp) false)
		((number? exp) false)
		(else false)))
		
(define (variable? exp) 
		(cond ((eq? exp 'and) false)
		((eq? exp 'or) false)
		((eq? exp 'not) false)
		((eq? exp 'implies) false)
		((eq? exp 'equiv) false)
		(else (symbol? exp))))

(define (lookup exp env)
 	(if (null? env) 
		() 
	(if (eq? exp (car (car env))) 
		 (car env)
	(lookup exp (cdr env)))
	))	

(define (lookup-variable-value exp env)
   (if (null? env) 
		() 
	(if (null? (car env))
		() 
	(lookup exp (car env)))) 
	(if (null? env) 
		() 
	(if (null? (lookup exp (car env)))
		(lookup-variable-value exp (cdr env)) 
		(if (null? env) 
			() 
		(car (cdr (lookup exp (car env))))))
	)
	) 

(define (and? exp)
	(cond ((eq? (car exp) 'and) true)(else false)))
	
(define (and exp env)
	(cond ((eq? (car(cdr exp)) (car (cddr exp))) true)
			(else false)))

(define (or? exp)
	(cond ((eq? (car exp) 'or) true)(else false)))

(define (or exp env)
	(cond ((eq? (car(cdr exp)) false) (eq? (car (cddr exp)) false) false)
			(else true)))

(define (not? exp)
	(cond ((eq? (car exp) 'not) true)(else false)))
	
(define (not exp env)
	(cond ((eq? (car(cdr exp)) false) true)
			(else false)))

(define (implies? exp)
	(cond ((eq? (car exp) 'implies) true)(else false)))
	
(define (implies exp env)
	(cond ( (eq? (car(cdr exp)) true) (eq? (car (cddr exp)) false) false)
		  (else true)))

(define (equiv? exp)
	(cond ((eq? (car exp) 'equiv) true)(else false)))

(define (equiv exp env)
	(cond ( (eq? (car(cdr exp)) false) (eq? (car (cddr exp)) false) true)
		  ( (eq? (car(cdr exp)) true) (eq? (car (cddr exp)) true) true)
		  (else false)))

;---------------------------------------------------------------------------- END OF MY PERSONAL CODE

(define (list-of-values exps env)
  (if (no-operands? exps)
      '()
      (cons (eval (first-operand exps) env)
            (list-of-values (rest-operands exps) env))))

(define (eval-if exp env)
  (if (true? (eval (if-predicate exp) env))
      (eval (if-consequent exp) env)
      (eval (if-alternative exp) env)))

(define (eval-sequence exps env)
  (cond ((last-exp? exps) (eval (first-exp exps) env))
        (else (eval (first-exp exps) env)
              (eval-sequence (rest-exps exps) env))))

(define (eval-assignment exp env)
  (set-variable-value! (assignment-variable exp)
                       (eval (assignment-value exp) env)
                       env)
  'ok)

(define (eval-definition exp env)
  (define-variable! (definition-variable exp)
                    (eval (definition-value exp) env)
                    env)
  'ok)
  
  (define (quoted? exp)
  (tagged-list? exp 'quote))

(define (text-of-quotation exp) (cadr exp))

(define (tagged-list? exp tag)
  (if (pair? exp)
      (eq? (car exp) tag)
      false))

(define (assignment? exp)
  (tagged-list? exp 'set!))

(define (assignment-variable exp) (cadr exp))

(define (assignment-value exp) (caddr exp))


(define (definition? exp)
  (tagged-list? exp 'define))

(define (definition-variable exp)
  (if (symbol? (cadr exp))
      (cadr exp)
      (caadr exp)))

(define (definition-value exp)
  (if (symbol? (cadr exp))
      (caddr exp)
      (make-lambda (cdadr exp)
                   (cddr exp))))

(define (lambda? exp) (tagged-list? exp 'lambda))

(define (lambda-parameters exp) (cadr exp))
(define (lambda-body exp) (cddr exp))

(define (make-lambda parameters body)
  (cons 'lambda (cons parameters body)))


(define (if? exp) (tagged-list? exp 'if))

(define (if-predicate exp) (cadr exp))

(define (if-consequent exp) (caddr exp))

(define (if-alternative exp)
  (if (not (null? (cdddr exp)))
      (cadddr exp)
      'false))

(define (make-if predicate consequent alternative)
  (list 'if predicate consequent alternative))


(define (begin? exp) (tagged-list? exp 'begin))

(define (begin-actions exp) (cdr exp))

(define (last-exp? seq) (null? (cdr seq)))
(define (first-exp seq) (car seq))
(define (rest-exps seq) (cdr seq))

(define (sequence->exp seq)
  (cond ((null? seq) seq)
        ((last-exp? seq) (first-exp seq))
        (else (make-begin seq))))

(define (make-begin seq) (cons 'begin seq))


(define (application? exp) (pair? exp))
(define (operator exp) (car exp))
(define (operands exp) (cdr exp))

(define (no-operands? ops) (null? ops))
(define (first-operand ops) (car ops))
(define (rest-operands ops) (cdr ops))


(define (cond? exp) (tagged-list? exp 'cond))

(define (cond-clauses exp) (cdr exp))

(define (cond-else-clause? clause)
  (eq? (cond-predicate clause) 'else))

(define (cond-predicate clause) (car clause))

(define (cond-actions clause) (cdr clause))

(define (cond->if exp)
  (expand-clauses (cond-clauses exp)))

(define (expand-clauses clauses)
  (if (null? clauses)
      'false                          ; no else clause
      (let ((first (car clauses))
            (rest (cdr clauses)))
        (if (cond-else-clause? first)
            (if (null? rest)
                (sequence->exp (cond-actions first))
                (error "ELSE clause isn't last -- COND->IF"
                       clauses))
            (make-if (cond-predicate first)
                     (sequence->exp (cond-actions first))
                     (expand-clauses rest))))))
(define (make-procedure parameters body env)
  (list 'procedure parameters body env))

(define (compound-procedure? p)
  (tagged-list? p 'procedure))


(define (procedure-parameters p) (cadr p))
(define (procedure-body p) (caddr p))
(define (procedure-environment p) (cadddr p))


(define (enclosing-environment env) (cdr env))

(define (first-frame env) (car env))

(define the-empty-environment '())

(define (make-frame variables values)
  (cons variables values))

(define (frame-variables frame) (car frame))
(define (frame-values frame) (cdr frame))

(define (add-binding-to-frame! var val frame)
  (set-car! frame (cons var (car frame)))
  (set-cdr! frame (cons val (cdr frame))))

(define (extend-environment vars vals base-env)
  (if (= (length vars) (length vals))
      (cons (make-frame vars vals) base-env)
      (if (< (length vars) (length vals))
          (error "Too many arguments supplied" vars vals)
          (error "Too few arguments supplied" vars vals))))					 
(define (set-variable-value! var val env)
  (define (env-loop env)
    (define (scan vars vals)
      (cond ((null? vars)
             (env-loop (enclosing-environment env)))
            ((eq? var (car vars))
             (set-car! vals val))
            (else (scan (cdr vars) (cdr vals)))))
    (if (eq? env the-empty-environment)
        (error "Unbound variable -- SET!" var)
        (let ((frame (first-frame env)))
          (scan (frame-variables frame)
                (frame-values frame)))))
  (env-loop env))

(define (define-variable! var val env)
  (let ((frame (first-frame env)))
    (define (scan vars vals)
      (cond ((null? vars)
             (add-binding-to-frame! var val frame))
            ((eq? var (car vars))
             (set-car! vals val))
            (else (scan (cdr vars) (cdr vals)))))
    (scan (frame-variables frame)
          (frame-values frame))))

;;;SECTION 4.1.4

(define (setup-environment)
  (let ((initial-env
         (extend-environment (primitive-procedure-names)
                             (primitive-procedure-objects)
                             the-empty-environment)))
    (define-variable! 'true true initial-env)
    (define-variable! 'false false initial-env)
    initial-env))

;[do later] (define the-global-environment (setup-environment))

(define (primitive-procedure? proc)
  (tagged-list? proc 'primitive))

(define (primitive-implementation proc) (cadr proc))

(define primitive-procedures
  (list (list 'car car)
        (list 'cdr cdr)
        (list 'cons cons)
        (list 'null? null?)
		(list '#f false)
		(list '#t true)
;;      more primitives
        ))

(define (primitive-procedure-names)
  (map car
       primitive-procedures))

(define (primitive-procedure-objects)
  (map (lambda (proc) (list 'primitive (cadr proc)))
       primitive-procedures))

;[moved to start of file] (define apply-in-underlying-scheme apply)

(define (apply-primitive-procedure proc args)
  (apply-in-underlying-scheme
   (primitive-implementation proc) args))



(define input-prompt ";;; B-Eval input:")
(define output-prompt ";;; B-Eval value:")

(define (driver-loop)
  (prompt-for-input input-prompt)
  (let ((input (read)))
    (let ((output (eval input the-global-environment)))
      (announce-output output-prompt)
      (user-print output)))
  (driver-loop))

(define (prompt-for-input string)
  (newline) (newline) (display string) (newline))

(define (announce-output string)
  (newline) (display string) (newline))

(define (user-print object)
  (if (compound-procedure? object)
      (display (list 'compound-procedure
                     (procedure-parameters object)
                     (procedure-body object)
                     '<procedure-env>))
      (display object)))

;;;Following are commented out so as not to be evaluated when
;;; the file is loaded.
;;(define the-global-environment (setup-environment))
;;(driver-loop)

'METACIRCULAR-EVALUATOR-LOADED