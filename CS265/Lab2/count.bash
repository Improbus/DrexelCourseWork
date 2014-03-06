#Bash Script to List out the files and do a wordcount and line count

#!/bin/bash

for file in *
do
  wc -l -w	"$file"
done

