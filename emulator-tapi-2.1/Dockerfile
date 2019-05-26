FROM ubuntu:18.04
COPY tapi /root/yang
COPY script /root/script
RUN apt-get update && apt-get upgrade -y \
    && apt-get install software-properties-common build-essential openssl libssl-dev libpcre3 libpcre3-dev git make cmake bison flex pkg-config graphviz doxygen valgrind zlib1g zlib1g-dev libev-dev libavl-dev libprotobuf-c-dev protobuf-c-compiler swig python-dev lua5.2 vim net-tools libcurl4-openssl-dev man -y \
    && add-apt-repository ppa:openjdk-r/ppa -y \
    && apt-get update && apt-get install openjdk-8-jdk wget git -y \
    && echo "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre" >> ~/.bashrc \
    && export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre \
    && cd ~ && wget http://apache.mirrors.pair.com/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz \
    && tar -xvzf apache-maven-3.3.9-bin.tar.gz \
    && echo "export M2_HOME=~/apache-maven-3.3.9" >> ~/.bashrc \
    && echo 'export PATH=${M2_HOME}/bin:${PATH}' >> ~/.bashrc \
    && git clone https://github.com/bartoszm/yang2swagger.git && cd yang2swagger/ \
    && mkdir ~/.m2 && wget -q -O - https://raw.githubusercontent.com/opendaylight/odlparent/master/settings.xml > ~/.m2/settings.xml \
    && git checkout tags/1.1.11 && ~/apache-maven-3.3.9/bin/mvn clean install \
    && cd ~ && java -jar ~/.m2/repository/com/mrv/yangtools/swagger-generator-cli/1.1.11/swagger-generator-cli-1.1.11-executable.jar -yang-dir yang/ -format json -content-type application/json -output tapi-2.1.json tapi-topology tapi-common tapi-connectivity tapi-dsr tapi-eth tapi-notification tapi-oam tapi-path-computation tapi-photonic-media tapi-virtual-network \
    && ~/apache-maven-3.3.9/bin/mvn dependency:get -DremoteRepositories=http://central.maven.org/maven2/ -DgroupId=io.swagger -DartifactId=swagger-codegen-cli -Dversion=2.4.5 -Dtransitive=true \
    && java -jar ~/.m2/repository/io/swagger/swagger-codegen-cli/2.4.5/swagger-codegen-cli-2.4.5.jar generate -i tapi-2.1.json -l jaxrs -o tapi2.1-javaServer \
    && sh -c 'echo root:root | chpasswd' \
    && echo "export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib" >> ~/.bashrc \
    && export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib \
    && cd ~ && git clone http://git.libssh.org/projects/libssh.git \
    && cd libssh && mkdir build && cd build \
    && git checkout stable-0.8 \
    && cmake .. && make -j4 && make install \
    && cd ~ && git clone git://git.cryptomilk.org/projects/cmocka.git \
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
    && cd Netopeer2/server && git checkout v0.7-r1 \
    && mkdir build && cd build && cmake .. \
    && make -j4 && make install \
    && ssh-keygen -t rsa -b 2048 -f /etc/ssh/ssh_host_rsa_key \
    && cd /root/script && python get-pip.py \
    && pip install netconf-console \
    && cd /root/yang && sh import-yangs.sh
EXPOSE 1234
EXPOSE 830
WORKDIR /root
ENTRYPOINT ["sh", "/root/script/entry.sh"]
