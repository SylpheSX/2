#!/bin/bash

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         Install Library                \e[0m"
echo -e "\e[1;45m                                        \e[0m"
cd ..
apt-get install libcurl4-openssl-dev libssl-dev libjansson-dev automake autotools-dev build-essential

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         Install Nano                   \e[0m"
echo -e "\e[1;42m                                        \e[0m"
apt-get install nano

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         Clone ccminer                  \e[0m"
echo -e "\e[1;45m                                        \e[0m"
git clone --single-branch -b ARM https://github.com/monkins1010/ccminer

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         cd ccminer                     \e[0m"
echo -e "\e[1;42m                                        \e[0m"
cd ccminer

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         chmod build                    \e[0m"
echo -e "\e[1;45m                                        \e[0m"
chmod +x build.sh && chmod +x configure.sh && chmod +x autogen.sh 

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         Build                          \e[0m"
echo -e "\e[1;42m                                        \e[0m"
./build.sh

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         Edit .bashrc                   \e[0m"
echo -e "\e[1;45m                                        \e[0m"
cd ../b
perl -p -e 's/\r//g' bbb > bbbx
chmod +x bbbx
cp /root/.bashrc /root/.bashrcbackup
rm /root/.bashrc
cp bbbx /root/.bashrc
nano /root/.bashrc

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         Create h (restart)             \e[0m"
echo -e "\e[1;42m                                        \e[0m"
cd ../b
perl -p -e 's/\r//g' hh > h
chmod +x h
cp h ../ccminer/









