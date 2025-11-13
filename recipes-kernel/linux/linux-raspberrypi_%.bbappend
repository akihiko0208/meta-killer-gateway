# Disable CONFIG_SOUND    
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " file://disable-sound.cfg"
KERNEL_CONFIG_FRAGMENTS:append = " disable-sound.cfg"

# For linux-raspberrypi only, mark this CVE as ignored with justification
CVE_STATUS[CVE-2023-3079] = "ignored: This vulnerability affects Chromium/V8 only. Chromium is not included in this image, therefore it is not applicable."
