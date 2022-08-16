#!/bin/bash

ROOT_FOLDER_NAME=$1
FOLDER_DATE=$(date)
ABOUT_ME="about_me"
ABOUT_ME_PERSONAL="personal"
ABOUT_ME_PROFESSIONAL="professional"
MY_FRIENDS="my_friends"
MY_SYSTEM_INFO="my_system_info"
FB_USERNAME=$2
IN_USERNAME=$3


createRootFolder () {
    if [[ $1 -eq 0 ]]; then
        echo "Please type yourname after ./automate command. Ex. ./automate nandang"
        exit 1;
    else
        mkdir "$1 $FOLDER_DATE"
    fi
}

createAboutMe () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir -p "$ABOUT_ME/$ABOUT_ME_PERSONAL" && mkdir -p "$ABOUT_ME/$ABOUT_ME_PROFESSIONAL"

}

main () {
    createRootFolder $ROOT_FOLDER_NAME
    createAboutMe $FB_USERNAME $IN_USERNAME
}

main