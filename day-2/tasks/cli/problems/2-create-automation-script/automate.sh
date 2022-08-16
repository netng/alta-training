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
FB_URL="https://www.facebook.com"
IN_URL="https://www.linkedin.com/in"


createRootFolder () {
    mkdir "$1 $FOLDER_DATE"
}

createAboutMe () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir -p "$ABOUT_ME/$ABOUT_ME_PERSONAL" && mkdir -p "$ABOUT_ME/$ABOUT_ME_PROFESSIONAL"
    echo "$FB_URL/$FB_USERNAME" > "$ABOUT_ME/$ABOUT_ME_PERSONAL/facebook.txt"
    echo "$IN_URL/$IN_USERNAME" > "$ABOUT_ME/$ABOUT_ME_PERSONAL/linkedin.txt"

}

main () {
    createRootFolder $ROOT_FOLDER_NAME
    createAboutMe $FB_USERNAME $IN_USERNAME
}

main