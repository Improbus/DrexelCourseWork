#This script takes an archive and will find the number of Doctors who have
#sent messages

#!/bin/bash

#This variable ARCHIVE allows the user to set any directory for the script
ARCHIVE=~kschmidt/public_html/CS265/Assignments/DrMath/Archive

#This Statement Prints out the working ARCHIVE
echo "Archive = " $ARCHIVE

#Using egrep we search the entire directory and subdirectories using a
#regular expression as well as an egrep parameter to find all of the names of
#the doctors who sent messages and place them into a file named Senders.txt.
egrep -Rh -m 1 "^From: Doctor*" $ARCHIVE > Senders.txt

#This awk script takes the file created above and creates a new sorted file
#that does not have duplicate names.  This new file is SortedSenders.txt.
awk '{
if ($0 in file)
	x=1
else
	print 
	file[$0]=1
}' Senders.txt | sort -o SortedSenders.txt

#These two cat commands count the number of Doctors in the file and reports
#the number with a statement both to the display and to file prob2.out
cat SortedSenders.txt | wc -l; echo "Doctors Sent Messages."
cat SortedSenders.txt | wc -l 1>prob2.out
echo "Doctors Sent Messages." 1>>prob2.out


