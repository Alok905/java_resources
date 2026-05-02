#!/bin/bash

DEPLOY_FILE="/opt/scripts/remote_websetup/multios_websetup.sh"
HOST_NAMES_FILE="/opt/scripts/remote_websetup/remhosts"

hosts=$(cat $HOST_NAMES_FILE)

for host in $hosts; do
	echo -e "\n\n\n----------------------- deploying on  $host ------------------------\n\n\n"

	ssh devops@$host "mkdir -p /home/devops/tmp/; sudo rm -rf /opt/scripts"
	scp $DEPLOY_FILE devops@$host:/home/devops/tmp/hostfile.sh
	ssh devops@$host "sudo mkdir -p /opt/scripts/web_setup; \
	cd /home/devops/tmp/; \
	sudo mv hostfile.sh /opt/scripts/web_setup/; \
	cd /opt/scripts/web_setup/; \
	rm -rf /home/devops/tmp; \
	sudo chmod +x hostfile.sh; \
	sudo ./hostfile.sh;"
done


