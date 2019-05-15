FROM ubuntu:18.04
COPY tapi /root/YANG
COPY entry.sh /root/entry.sh
RUN apt-get update && apt-get upgrade -y \
    && apt-get install software-properties-common -y \
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
    && cd ~ && java -jar ~/.m2/repository/com/mrv/yangtools/swagger-generator-cli/1.1.11/swagger-generator-cli-1.1.11-executable.jar -yang-dir YANG/ -format json -content-type application/json -output tapi-2.1.json tapi-topology tapi-common tapi-connectivity tapi-dsr tapi-eth tapi-notification tapi-oam tapi-path-computation tapi-photonic-media tapi-virtual-network \
    && ~/apache-maven-3.3.9/bin/mvn dependency:get -DremoteRepositories=http://central.maven.org/maven2/ -DgroupId=io.swagger -DartifactId=swagger-codegen-cli -Dversion=2.4.5 -Dtransitive=true \
    && java -jar ~/.m2/repository/io/swagger/swagger-codegen-cli/2.4.5/swagger-codegen-cli-2.4.5.jar generate -i tapi-2.1.json -l jaxrs -o tapi2.1-javaServer
EXPOSE 1234
WORKDIR /root
ENTRYPOINT ["sh", "/root/entry.sh"]