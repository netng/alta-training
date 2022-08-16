#!/bin/bash

ROOT_FOLDER_NAME=$1
FOLDER_DATE=$(date)
ABOUT_ME="about_me"
ABOUT_ME_PERSONAL="personal"
ABOUT_ME_PROFESSIONAL="professional"
MY_FRIENDS="my_friends"
MY_SYSTEM_INFO="my_system_info"


createRootFolder () {
    mkdir "$1 $FOLDER_DATE"
}

createAboutMe () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir -p "$ABOUT_ME/$ABOUT_ME_PERSONAL" && mkdir -p "$ABOUT_ME/$ABOUT_ME_PROFESSIONAL"
}

main () {
    createRootFolder $ROOT_FOLDER_NAME
    createAboutMe
}

main