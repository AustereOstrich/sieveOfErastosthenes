FROM ubuntu:20.04

RUN apt-get update && apt-get install -y openssh-server
RUN apt-get install -y openjdk-11-jdk
RUN mkdir /var/run/sshd
RUN echo 'root:THEPASSWORDYOUCREATED' | chpasswd
RUN sed -i 's/#*PermitRootLogin prohibit-password/PermitRootLogin no/g' /etc/ssh/sshd_config

# SSH login fix. Otherwise user is kicked off after login
RUN sed -i 's@session\s*required\s*pam_loginuid.so@session optional pam_loginuid.so@g' /etc/pam.d/sshd

ENV NOTVISIBLE "in users profile"
RUN echo "export VISIBLE=now" >> /etc/profile

EXPOSE 22

RUN useradd -m -s /bin/bash -p $(openssl passwd -1 sampleuserpassword) webssh

CMD ["/usr/sbin/sshd", "-D"]

RUN mkdir /home/webssh/javaproject

WORKDIR /home/webssh/javaproject

COPY . .