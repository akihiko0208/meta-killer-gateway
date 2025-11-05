# Happy Signage

## How to build

```
git clone https://git.yoctoproject.org/poky -b scarthgap
git clone https://git.yoctoproject.org/meta-raspberrypi -b scarthgap
git clone https://github.com/openembedded/meta-openembedded -b scarthgap
git clone https://github.com/OSSystems/meta-browser -b scarthgap
git clone https://github.com/akihiko0208/meta-happy-signage.git

TEMPLATECONF=../meta-signage/conf/templates source poky/oe-init-build-env build-signage

bitbake digital-signage-image
```

