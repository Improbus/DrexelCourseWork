#Script creates an Artist Directory, renames the song, and moves it into the appropriate directory

#!/bin/bash

echo "This program will take mp3 files create and artists directory and move
the renames songs appropriately"

musicEXT=.mp3
echo $musicEXT

echo "All of the files with the $musicEXT will have a directory created,
songs renamed and moved."

find -iname "*$musicEXT" |

while read file
do
  fullpath=${file}
 	artistname=${file%% -*}
	echo "$fullpath"
	echo "$artistname"
  mkdir "$artistname"
  renamedFile=${file##*- }
	echo "$renamedFile"
  mv -f "$fullpath" "$renamedFile"
  mv "$renamedFile" "".""/"$artistname"/""
done


