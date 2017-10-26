# IoT-Demo_Datacenter-OCP_FIS
Internet of Things DemoJam :: Datacenter OpenShift Container Platform :: Fuse Integration Services

---
Based on [PatrickSteiner/IoT_Demo_Datacenter](https://github.com/PatrickSteiner/IoT_Demo_Datacenter)  
Updated to run as microservices on OpenShift/CDK.

## Notes:
On OpenShift, Fuse Integration Services and A-MQ for OpenShift are deployed separately as two pods.

First, load and start the AMQ for OpenShift pod with: [iotdj-docp-broker.json](https://github.com/MichaelFitzurka/IoT-DemoJam_Datacenter-OCP_FIS/blob/master/config/iotdj-docp-broker.json)  
There is 1 password to set, the "A-MQ Password".

Then load and start Fuse Integration Services with: [iotdj-docp-fis.json](https://github.com/MichaelFitzurka/IoT-DemoJam_Datacenter-OCP_FIS/blob/master/config/iotdj-docp-fis.json)  
Use the same password from the AMQ pod for "ActiveMQ Broker Password".

I used "DLT-iot-123!" as the password consistently throughout, but feel free to use different passwords for each if you so desire.

The other values in the templates are pre-configured to my IoT-DemoJam ecosystem, so leave as-is unless you have changed things.
