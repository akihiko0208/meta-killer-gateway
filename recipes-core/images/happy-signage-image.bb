SUMMARY = "Digital signage image for Raspberry Pi 4 (Wayland + Chromium + Web server)"
LICENSE = "MIT"
inherit core-image

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL:append = " \
    weston \
    chromium-ozone-wayland \
    tzdata chrony \
    bash \
    apache2 \
"
