#Takes all files with a certain file extension and changes it to another one

#!/bin/bash

echo "This program will take in two file extensions and swap the extensions
of all the files in the directory with the extension given"

echo "Please Enter the current file extension."

read -e currentEXT

echo "Please enter the file extension you wish to change it to"

read -e newEXT

echo "All of the files with the $currentEXT will be changed to the $newEXT."

for file in * 
do 
	find . -iname *$currentEXT
	mv -i $file $file$newEXT
done



