#!/bin/bash

echo "Start"

MONGODB_HOST=ds163156.mlab.com:63156
MONGODB_DB=uela
MONGODB_USER=${MONGODB_MLAB_USER}
MONGODB_PASS=${MONGODB_MLAB_PASS}

echo "Step #01 ${MONGODB_MLAB_USER} - ${MONGODB_MLAB_PASS} "


# mongoimport -h ${MONGODB_HOST} -d ${MONGODB_DB} -u ${MONGODB_USER} -p ${MONGODB_PASS \
#             -c crbuoy-csv  --type csv   --headerline \
#             --file ../files/crbuoy2015-out.csv


mongoimport -h ${MONGODB_HOST} -d ${MONGODB_DB} -u ${MONGODB_USER} -p ${MONGODB_PASS \
            -c crbuoy-csv  --type csv   --headerline \
            --file ../files/crbuoy2015-out.csv


