#Takes a doctors name and reports the average messages per month sent by
#that doctor.

#!/bin/bash

#This variable ARCHIVE allows the user to set any directory for the script
ARCHIVE=~kschmidt/public_html/CS265/Assignments/DrMath/Archive

#This Statement Prints out the working ARCHIVE
echo "Archive = " $ARCHIVE

#explanation of the program
echo "This program will take in as an argument a doctors name and report the
average number of messages that the specified doctor sent"

#this variable is to record a user set parameter for the doctors name
DoctorName=${1?"Error: Please Enter a valid Doctors Name"}

#This egrep command uses a regular expression in conjuction with the user
#defined argument and finds the average amount of messages sent by the
#specified doctor
egrep -Rh -m 1 "^From: ""$DoctorName""*" $ARCHIVE  > Senders.txt

#These two lines calculate the average and reports it to the repective
#places
TotalMessages=`cat Senders.txt | wc -l`
AverageMessages=$(echo "scale=2; $TotalMessages / 12 " | bc)
echo "The Avereage amount of sent messages per month for Doctor "$DoctorName" is "  $AverageMessages
echo "The Avereage amount of sent messages per month for Doctor "$DoctorName" is "  $AverageMessages 1>prob5.out





