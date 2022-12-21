
DESCRIPTION = ".NET Core SDK (v7.0.101) - Linux x64 Binaries"
HOMEPAGE = "https://dotnet.microsoft.com/en-us/download/dotnet/7.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9fc642ff452b28d62ab19b7eea50dfb9"

SOURCE_FILE = "dotnet-sdk-7.0.101-linux-arm64.tar.gz"

SRC_URI = "https://download.visualstudio.microsoft.com/download/pr/caa0e6fb-770c-4b21-ba55-30154a7a9e11/3231af451861147352aaf43cf23b16ea/${SOURCE_FILE};unpack=0 \
           file://LICENSE.txt \
"
SRC_URI[sha256sum] = "5d4a58eeca1a4ab095b55e6486b1278147b0ab121ce883b2bcde3d3626c9a81c"

inherit native

S="${WORKDIR}"

do_install() {
    echo "Installing ${DESCRIPTION} ..."

    install -d ${D}${bindir}
    tar -xvzf ${WORKDIR}/${SOURCE_FILE} -C ${D}${bindir}
}
