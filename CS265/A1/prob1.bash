#This script takes any archive of problems and messages and report the
#number of Problems and Messages

#!/bin/bash

#This variable ARCHIVE allows the user to set any directory for the script
ARCHIVE=~kschmidt/public_html/CS265/Assignments/DrMath/Archive

#This Statement Prints out the working ARCHIVE
echo "Archive = " $ARCHIVE

#This counts the number of Problems within the directory
echo "The Number of Problems is " 
ls $ARCHIVE | wc -w

#This counts the number of Messages regarding each problem
echo "The Number of Messages sent is " 
ls -R $ARCHIVE | wc -w

#This counts the number of Problems within the directory and outputs it to a
#file named prob1.out
echo "The Number of Problems is " 1>prob1.out
ls $ARCHIVE | wc -w 1>>prob1.out

#This counts the number of Messages within the directory and outputs it to a
#file named prob1.out
echo "The Number of Messages sent is " 1>>prob1.out
ls -R $ARCHIVE | wc -w 1>>prob1.out

