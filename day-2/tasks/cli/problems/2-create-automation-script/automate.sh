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
    cd ..
}

createMyFriends () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir $MY_FRIENDS
    cd $MY_FRIENDS && curl $MY_FRIENDS_RAW_SOURCE --output list_of_my_friends.txt && cd ..
    cd ..
}

createMySystemInfo () {
    cd "$ROOT_FOLDER_NAME $FOLDER_DATE"
    mkdir $MY_SYSTEM_INFO && cd $MY_SYSTEM_INFO
    echo "My username: $(whoami)" >> about_this_laptop.txt
    echo "With host: $(uname -a)" >> about_this_laptop.txt
    ping -c 3 google.com >> internet_connection.txt
    cd ..
}

validate () {
    if [[ -z "$ROOT_FOLDER_NAME" ]]; then
        echo "Silakan masukan parameter pertama (nama kamu)"
        exit 1
    elif [[ -z "$FB_USERNAME" ]]; then
        echo "Silakan masukan parameter kedua (FB username)"
        exit 1
    elif [[ -z "$IN_USERNAME" ]]; then
        echo "Silakan masukan parameter ketiga (linkedin username)"
        exit 1
    else
        return 0
    fi

}

main () {
    validate
    createRootFolder
    createAboutMe
    createMyFriends
    createMySystemInfo
}

main