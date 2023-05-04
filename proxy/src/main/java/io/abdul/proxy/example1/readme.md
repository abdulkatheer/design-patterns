# This is a remote proxy

To get code running on localhost:

1. Change to the directory where class files are generated. For maven, it's typically target/classes.

2. Run rmiregistry in background

````
rmiregistry &
````

4. Run server program

````
java io/abdul/proxy/example1/server/GumballMachineTestDrive localhost 300
````

5. In a different window, run:

````
java io/abdul/proxy/example1/client/GumballMonitorTestDrive localhost
````
