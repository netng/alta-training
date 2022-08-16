#!/bin/bash

rootFolderName=$1

create_root_folder () {
    mkdir "$1 $(date)"
}

main () {
    create_root_folder $rootFolderName
}

main