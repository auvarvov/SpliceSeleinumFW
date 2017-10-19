# SpliceSeleinumFW
poc for Splice Selenium FW

Requirements:
Firefox. (I used 35 verison. How selenium works with other I did not test. So recommend to install 35 version of Firefox)
you can use link 
https://www.mozilla.org/en-US/firefox/35.0/releasenotes/

How to run test.
1. Clone repo
2. Fire from console to run test which create DB in cloud
Pay attention you need to add parameters for username/password and name of cluster you want to use
-Dusername = email address in cloud
-Dpassword = password to cloud
-Dclustername = name which will be used while creation cluster
mvn -f pom.xml -Dusername=myemail@splicemachine.com -Dpassword=mypassword -Dclustername=nameofclusterIwillcreate -Didea.launcher.port=7560 -B clean test -DsuiteFile=testrun.xml
