# IoT-Demo_Datacenter-OCP_FIS
Internet of Things DemoJam :: Datacenter OpenShift Container Platform :: Fuse Integration Services

---
Based on [PatrickSteiner/IoT_Demo_Datacenter](https://github.com/PatrickSteiner/IoT_Demo_Datacenter)  
Updated to run as microservices on Openshift/CDK.

## Notes:
On Openshift, Fuse Integration Services and A-MQ for Openshift are deployed separately as two pods.

First, load and start the AMQ for Openshift pod with: [iotdj-docp-broker.json](https://github.com/MichaelFitzurka/IoT-DemoJam_Datacenter-OCP_FIS/blob/master/config/iotdj-docp-broker.json)  
There is 1 password to set, the "A-MQ Password".

Then load and start Fuse Integration Services with: [iotdj-docp-fis.json](https://github.com/MichaelFitzurka/IoT-DemoJam_Datacenter-OCP_FIS/blob/master/config/iotdj-docp-fis.json)  
Use the same password from the AMQ pod for "ActiveMQ Broker Password".
