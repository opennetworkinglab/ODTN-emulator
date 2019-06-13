FROM ubuntu:18.04
COPY tapi /root/yang
COPY script /root/script
COPY tapi2.1-javaServer /root/tapi2.1-javaServer
RUN apt-get update && apt-get upgrade -y \
    && apt-get install software-properties-common git -y \
    && add-apt-repository ppa:openjdk-r/ppa -y \
    && apt-get update && apt-get install openjdk-8-jdk wget git -y \
    && echo "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre" >> ~/.bashrc \
    && export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre \
    && cd ~ && wget http://apache.mirrors.pair.com/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz \
    && tar -xvzf apache-maven-3.3.9-bin.tar.gz \
    && echo "export M2_HOME=~/apache-maven-3.3.9" >> ~/.bashrc \
    && echo 'export PATH=${M2_HOME}/bin:${PATH}' >> ~/.bashrc \
    && cd /root/tapi2.1-javaServer && /root/apache-maven-3.3.9/bin/mvn clean install \
    && sh -c 'echo root:root | chpasswd'
EXPOSE 1234
WORKDIR /root
ENTRYPOINT ["sh", "/root/script/entry.sh"]
