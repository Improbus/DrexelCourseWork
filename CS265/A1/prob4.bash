#This script takes the total amount of messages sent and divides it by 11
#since the period is an 11 month one to find the average messages sent per
#month

#!/bin/bash

#This variable ARCHIVE allows the user to set any directory for the script
ARCHIVE=~kschmidt/public_html/CS265/Assignments/DrMath/Archive

#This Statement Prints out the working ARCHIVE
echo "Archive = " $ARCHIVE

#This egrep command finds the total number of senders and creates a file to
#hold all the names.
egrep -Rh -m 1 "^From: Doctor*" $ARCHIVE > Senders.txt

#This sets the total number of messages to a variable.
TotalMessages=`cat Senders.txt | wc -l`

#Thid variable is the calculation of the average messages over the 11 month
#period
AverageMessages=$(echo "scale=0; $TotalMessages / 11 " | bc)

#These two lines report the average to the screen and to an ouput file
echo "The Avereage amount of sent messages per month is "  $AverageMessages

echo "The Avereage amount of sent messages per month is "  $AverageMessages 1>prob4.out

