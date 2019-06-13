#!/bin/bash

# Each method begins with "public Response"
# There are totally 949 times for string "public Reaponse"
methods=($(cat DataApiServiceImpl.java | grep "public Response" | awk '{print $3}' | awk -F "(" '{print $1}'))
for i in `seq 948 -1 0`; do
   line_index=$(cat DataApiServiceImpl.java | grep "${methods[$i]}" -n | awk -F ":" '{print $1}')
   method=${methods[$i]}
   $(gsed -i "${line_index} a log.info(\"method ${method} is called.\");" DataApiServiceImpl.java)
#    echo $i

done