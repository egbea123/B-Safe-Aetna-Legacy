
1) To inpect the created container and find out the IP address of the 
   Docker container with the following command:
  
   $docker inspect <dockercontainerID> | grep Address 



2) If the IP address shown in the displayed inspection is 172.17.0.2, 
   the application will be accessible from the web browser at port 8080 
   of this IP address.
        except from the displayed inspection log
            "SecondaryIPv6Addresses": null,
            "EndpointID": "f5748a30fde01ad24ae1e995806b7c4e81dec0b503662dd4e140196679b0e73c",
            "Gateway": "172.17.0.1",
            "GlobalIPv6Address": "",
            "GlobalIPv6PrefixLen": 0,
            "IPAddress": "172.17.0.2",
            "IPPrefixLen": 16,
            "IPv6Gateway": "",
            "MacAddress": "02:42:ac:11:00:02",
3) To access the web application, type the follow at the browser url
    
    http:172.17.0.2:8080/employee 

4) To run the container issue the follow command
   
    sudo docker run -it --name b_safe_appv1 b_safe_app01


