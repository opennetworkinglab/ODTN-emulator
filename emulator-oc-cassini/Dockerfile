FROM ubuntu:18.04
COPY yang /root/yang
COPY config /root/config
COPY script /root/script
RUN apt-get update && apt-get upgrade -y \
    && apt-get install software-properties-common build-essential openssl libssl-dev libpcre3 libpcre3-dev git make cmake bison flex pkg-config graphviz doxygen valgrind zlib1g zlib1g-dev libev-dev libavl-dev libprotobuf-c-dev protobuf-c-compiler swig python-dev lua5.2 vim net-tools libcurl4-openssl-dev lib32ncurses5-dev man -y \
    && echo "export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib" >> ~/.bashrc \
    && export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib \
    && cd ~ && git clone http://git.libssh.org/projects/libssh.git \
    && cd libssh && mkdir build && cd build \
    && git checkout stable-0.8 \
    && cmake .. && make -j4 && make install \
    && cd ~ && git clone https://git.cryptomilk.org/projects/cmocka.git \
    && cd cmocka && mkdir build && cd build \
    && git checkout tags/cmocka-1.0.1 \
    && cmake .. && make && make install \
    && cd ~ && git clone https://github.com/CESNET/libyang \
    && cd libyang && git checkout v0.16-r3 \
    && mkdir build && cd build && cmake .. \
    && make -j4 && make install && make test -j4 \
    && cd ~ && git clone https://github.com/CESNET/libnetconf2.git \
    && cd libnetconf2 && git checkout v0.12-r1 \
    && mkdir build && cd build && cmake -DENABLE_TLS=ON -DENABLE_SSH=ON .. \
    && make -j4 && make install \
    && cd ~ && git clone https://github.com/sysrepo/sysrepo.git \
    && cd sysrepo && git checkout v0.7.7 \
    && mkdir build && cd build \
    && cmake -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX:PATH=/usr .. \
    && make -j4 \
    && ctest && make install \
    && cd ~ && git clone https://github.com/CESNET/Netopeer2.git \
    && cd Netopeer2 && git checkout v0.7-r1 && cd server \
    && mkdir build && cd build && cmake .. \
    && make -j4 && make install \
    && ssh-keygen -t rsa -b 2048 -f /etc/ssh/ssh_host_rsa_key \
    && sh -c 'echo root:root | chpasswd' \
    && cd /root/yang/openconfig-odtn && sh import-yangs.sh \
    && cd /root/script && python get-pip.py \
    && pip install netconf-console
EXPOSE 830
EXPOSE 22
EXPOSE 8080
WORKDIR /root
ENTRYPOINT ["sh", "/root/script/push-data.sh"]
