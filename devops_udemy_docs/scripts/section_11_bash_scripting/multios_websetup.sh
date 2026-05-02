#!/bin/bash

LINK=$1
NAME=$2
TEMPDIR="/tmp/websetups"
HOSTDIR="/var/www/html"

if [[ $LINK == "" ]]; then
	LINK="https://www.tooplate.com/zip-templates/2135_mini_finance.zip"
	NAME="2135_mini_finance"
fi

function common_config {
	mkdir -p $HOSTDIR
	rm -rf $HOSTDIR/*
	
	mkdir -p $TEMPDIR
	rm -rf $TEMPDIR/*
	cd $TEMPDIR
	
	wget $LINK > /dev/null
	unzip $NAME.zip > /dev/null
	cp -r $NAME/* $HOSTDIR/
	
	systemctl start $SVC
	systemctl enable $SVC

	rm -rf $TEMPDIR
	 
	sudo systemctl status $SVC 
	ls $HOSTDIR
}

# checking if os is rpm based or debian based
yum --help &> /dev/null

if [[ $? -eq 0 ]]; then
	echo "Running Setup on CentOS"
	
	PACKAGE="httpd wget unzip"
	SVC="httpd"

	sudo yum install $PACKAGE -y > /dev/null
	
	common_config
else
	echo "Running Setup on Ubuntu"

	PACKAGE="apache2 wget unzip"
	SVC="apache2"

	sudo apt update -y
	sudo apt install $PACKAGE -y > /dev/null
	
	common_config
fi







