#!/bin/bash
#Execute docker build
docker build -t b_safe_app01 .

#Create container from  the docker image

docker run -it --name b_safe_appv1 b_safe_app01


