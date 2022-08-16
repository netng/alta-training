#!/bin/bash

ROOT_FOLDER_NAME=$1
FOLDER_DATE=$(date)
ABOUT_ME="about_me"
ABOUT_ME_PERSONAL="personal"
ABOUT_ME_PROFESSIONAL="professional"
MY_FRIENDS="my_friends"
MY_FRIENDS_RAW_SOURCE="https://gist.githubusercontent.com/tegarimansyah/e91f335753ab2c7fb12815779677e914/raw/94864388379fecee450fde26e3e73bfb2bcda194/list%2520of%2520my%2520friends.txt"
MY_SYSTEM_INFO="my_system_info"
FB_USERNAME=$2
IN_USERNAME=$3
FB_URL="https://www.facebook.com"
IN_URL="https://www.linkedin.com/in"


createRootFolder () {
    mkdir "$ROOT_FOLDER_NAME $FOLDER_DATE"
}

createAboutMe () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir -p "$ABOUT_ME/$ABOUT_ME_PERSONAL" && mkdir -p "$ABOUT_ME/$ABOUT_ME_PROFESSIONAL"
    echo "$FB_URL/$FB_USERNAME" > "$ABOUT_ME/$ABOUT_ME_PERSONAL/facebook.txt"
    echo "$IN_URL/$IN_USERNAME" > "$ABOUT_ME/$ABOUT_ME_PROFESSIONAL/linkedin.txt"

}

createMyFriends () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir $MY_FRIENDS
    cd $MY_FRIENDS && curl $MY_FRIENDS_RAW_SOURCE --output list_of_my_friends.txt
}

main () {
    createRootFolder
    createAboutMe
    createMyFriends
}

main