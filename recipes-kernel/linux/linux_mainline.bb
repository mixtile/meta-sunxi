require linux.inc

DESCRIPTION = "Linux main line kernel for Allwinner socs"

COMPATIBLE_MACHINE = "(mixtile-loftq)"

PV = "mainline"
PR = "r1"

MACHINE_KERNEL_PR_append = "a"

SRC_URI += " git://github.com/mripard/linux.git;branch=sunxi-next;protocol=git \
        file://defconfig \
        "

S = "${WORKDIR}/git"

#fix QA issue "Files/directories were installed but not shipped: /usr/src/debug"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_configure_prepend() {
}
