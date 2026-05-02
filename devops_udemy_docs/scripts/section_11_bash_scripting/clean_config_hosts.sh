#!/bin/bash

DEPLOY_FILE="/opt/scripts/remote_websetup/multios_websetup.sh"
HOST_NAMES_FILE="/opt/scripts/remote_websetup/remhosts"

hosts=$(cat $HOST_NAMES_FILE)

for host in $hosts; do
	echo "Cleaning configs of $host ..."
        ssh devops@$host "sudo rm -rf /var/www/html/*; \
                sudo rm -rf /opt/scripts/web_setup;"
done
