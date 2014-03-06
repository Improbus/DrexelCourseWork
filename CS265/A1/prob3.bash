#This Script finds the names of the doctors and displays the number of
#messages sent by each one on the left side

#!/bin/bash

#This variable ARCHIVE allows the user to set any directory for the script
ARCHIVE=~kschmidt/public_html/CS265/Assignments/DrMath/Archive

#This Statement Prints out the working ARCHIVE
echo "Archive = " $ARCHIVE

#This egrep command finds all the messages and prints the sender of the
#messages to a file named Senders.txt
egrep -Rh -m 1 "^From: Doctor*" $ARCHIVE > Senders.txt

#This two commands do the same task just one reports the sceen and to a file
#named prob3.out.  These commands count the number of reoccuring senders
#therefore counting the number of messages sent by each Doctor.  They are
#then sorted numerically by the highest amount sent.
sort Senders.txt | uniq -c -d | sort -n -r
sort Senders.txt | uniq -c -d | sort -n -r 1>prob3.out

