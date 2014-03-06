(define (lookup name assoc_list) ;defines original lookup function
	(if (null? assoc_list) ;loop checking
		() ;returns null list
	(if (eq? name (car (car assoc_list))) ;checks to see if name matches the name in the list
		 (car assoc_list) ; if it matches print this symbol
	(lookup name (cdr assoc_list))) ; if no match call lookup again with the rest of the list
	))	;function end

(define (lookup-env name environment) ; defines lookup-env function which needs lookup function
	(if (null? environment) ;loop checking
		() ;returns null list
	(if (null? (car environment)) ;loop checking
		() ;returns null list
	(lookup name (car environment)))) ; Checks first assoc_list
	(if (null? environment) ;loop checking
		() ;returns null list
	(if (null? (lookup name (car environment))) ;loop checking
		(lookup-env name (cdr environment)) ;call rest of environment 
		(if (null? environment) ;loop checking
			() ;returns null list
		(lookup name (car environment)))) ; if it matches print this symbol
	)
	) ;function end
	
	
(lookup-env 'A '(((A 10) (B 15)) ((C 22)))) ;test call
(lookup-env 'B '(((A 10) (B 15)) ((C 22)))) ;test call
(lookup-env 'C '(((A 10) (B 15)) ((C 22)))) ;test call
(lookup-env 'D '(((A 10) (B 15)) ((C 22)))) ;test call