#!/bin/bash
set -o errexit
set -o nounset
projectdir="$(pwd)"
cd "$projectdir" || exit
find . -name ".keep-directory" -delete
hg init
hg add
hg commit -m "Initial commit"