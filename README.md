# Killer gateway

## How to build

```
git clone https://git.yoctoproject.org/poky -b scarthgap
git clone https://git.yoctoproject.org/meta-raspberrypi -b scarthgap
git clone https://github.com/openembedded/meta-openembedded -b scarthgap
git clone https://github.com/meta-erlang/meta-erlang.git -b scarthgap
git clone https://github.com/akihiko0208/meta-killer-gateway.git

TEMPLATECONF=../meta-killer-gateway/conf/templates/default source poky/oe-init-build-env build-gateway

bitbake killer-gateway-image
```

