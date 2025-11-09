SUMMARY = "Package group for Killer Gateway (Erlang/OTP headless gateway)"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
    erlang \
    openssh \
    sudo \
    chrony \
    rsyslog \
"
