# recipes-core/images/happy-signage-image.bb
SUMMARY = "Digital signage image for Raspberry Pi 4 (Wayland + Chromium + Web server)"
LICENSE = "MIT"
inherit core-image

# Install pkgs
IMAGE_FEATURES += "package-management ssh-server-dropbear"
IMAGE_INSTALL:append = " \
    packagegroup-happy-signage \
    ca-certificates \
    sudo \
"

# Image format
IMAGE_FSTYPES = "wic.bz2 wic"
WKS_FILE = "happy-signage.wks"
