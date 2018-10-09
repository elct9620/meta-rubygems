LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=196bb963e601609817d7e9ac9a64a867"

PR = "r0"

BPV = "1.16.6"
PV = "${BPV}"
SRCREV = "f66c3346733afeeff3ac4b09f522fe40bc8dbb44"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/bundler/bundler.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
