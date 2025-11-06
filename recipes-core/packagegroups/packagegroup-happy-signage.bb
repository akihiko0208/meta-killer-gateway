# recipes-core/packagegroups/packagegroup-happy-signage.bb
SUMMARY = "Packages for Happy Signage"
LICENSE = "MIT"

PR = "r1"

RDEPENDS:${PN} = " \
    weston \
    chromium-ozone-wayland \
    tzdata \
    chrony \
    bash \
    apache2 \
    fontconfig \
    ttf-dejavu-sans \
    networkmanager \
"
