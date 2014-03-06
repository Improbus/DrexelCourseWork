#Takes all files with a certain file extension and changes it to another one

#!/bin/bash

echo "This program will take in two file extensions and swap the extensions
of all the files in the directory with the extension given"

currentEXT=${1?"Error: Please Enter a valid Extension" }

newEXT=${2?"Error: Please Enter a valid Extension" }


echo "All of the files with the $currentEXT will be changed to the $newEXT."

find -iname "*${currentEXT}" |

while read file
do
	renamedFile="${file/%${currentEXT}/${newEXT}}"
	mv -f "${file}" "${renamedFile}"
done



