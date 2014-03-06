FILES = prob1.java prob2.java prob3.java prob4.java

.PHONY : run

run :
	-@echo "Checking for files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ ! -r $$i ] ; then \
				echo "can't read $$i" ; \
			fi ; \
		done
	-@if [ ! -r build.xml ] ; then \
			echo "Can't find build.xml!" ; \
		else \
			echo -e "RUNNING YOUR FILES:\n" ; \
			for (( j=1; j<5; ++j )) ; do \
				echo "prob$$j" ; \
				echo -e "=====" ; \
				ant prob$$j ; \
			done ; \
		fi
	-@ \rm *.class
	-@ echo "Done!"

