DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b" 

SRC_URI[arm-fb.md5sum] = "eb14b1ed91563a1a3bd65d7ab46add6f"
SRC_URI[arm-fb.sha256sum] = "2f1933432921c5aa0b08178012d2c933a93253c6e7ca4edb762b1cbc0c38e5bb"

SRC_URI[arm-wayland.md5sum] = "c1d376b13888111cee96edfc0b6e7ac3"
SRC_URI[arm-wayland.sha256sum] = "1540a0e7e65133ff786c25741d97d649fa51985c65c46fc7c9baae1181ee35d0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "dde2d9c14f0cea97a1c2eae663e336b0"
SRC_URI[aarch64-fb.sha256sum] = "57fdf23fbded312e816acc6e548f99d6d41c56d51159754122741267a1527beb"

SRC_URI[aarch64-wayland.md5sum] = "2619758dda81cd5b141c0efa9123426a"
SRC_URI[aarch64-wayland.sha256sum] = "d4d3d387f7f8e42328ea63a4ab27d4aa4a73e35895bc3f8dad1852080b8d6a5b"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
