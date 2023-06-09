#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# MODULE

echo "Checking if hub is ready - $HUBHOST"
while [ "$( curl -s http://$HUBHOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

# start the java command
jar -xvf framework_jar-tests.jar
echo "Browser $BROWSER would be Tested"
java -cp framework_jar.jar:framework_jar-tests.jar:libs/* -Dcucumber.features=. -DHUBHOST=$HUBHOST -Denv=prod -Dbrowser=$BROWSER org.testng.TestNG $MODULE
    
