# **Centralised Loggig - ELK Stack**
>Centralized Log Management (CLM) is a type of logging solution system that consolidates all of your log data and pushes it to one central, accessible, and easy-to-use interface. Centralized logging is designed to make your life easier.

### ELK Stack
>ELK Stack is designed to allow users to take to data from any source, in any format, and to search, analyze, and visualize that data in real time. ELK provides centralized logging that be useful when attempting to identify problems with servers or applications. It allows you to search all your logs in a single place.

![ELK Stack Flow](https://www.guru99.com/images/tensorflow/082918_1504_ELKStackTut1.png)
![ELK with microservices](https://howtodoinjava.com/wp-content/uploads/2017/08/ELK.jpg)
_ All these three tools are based on JVM 
* _Logs_: Server logs that need to be analyzed are identified
* _Logstash_: Collect logs and events data. It even parses and transforms data
* _ElasticSearch_: The transformed data from Logstash is Store, Search, and indexed. It is a NoSQL database and it is built with RESTful APIS.

* _Kibana_: Kibana uses Elasticsearch DB to Explore, Visualize, and Share

_ However, one more component is needed or Data collection called Beats. This led Elastic to rename ELK as the Elastic Stack.
_ While dealing with very large amounts of data, you may need Kafka, RabbitMQ for buffering and resilience. For security, nginx can be used
![ELK](https://www.guru99.com/images/tensorflow/082918_1504_ELKStackTut3.png)

#### ELK Setup
1. Download ELK.
2. Run bin\elasticsearch.bat to start elasticsearch isntance.By default, it would start at (http://localhost:9200)
3. Open config/kibana.yml in an editor and set elasticsearch.hosts: ["http://localhost:9200"]
3. Run bin\kibana.bat from command promt and Kibana UI will be available at (http://localhost:5601)

###### Configuring Logstash
1. To configure Logstash, you create a config file that specifies which plugins you want to use and settings for each plugin
2. When you run logstash, you use the -f to specify your config file.
3. Create a file named _"logstash-simple.conf"_ and save it in the same directory as Logstash.
4. Run logstash and specify the configuration file with the -f flag.
```
bin/logstash -f logstash-simple.conf
```
* Configure configure logstash-* as the index pattern in Kibana.

#### Summary

1. Centralized logging can be useful when attempting to identify problems with servers or applications
2. ELK stack is useful to resolve issues related to centralized logging system
3. ELK stack is a collection of three open source tools Elasticsearch, Logstash Kibana
4. Elasticsearch is a NoSQL database
5. Logstash is the data collection pipeline tool
6. Kibana is a data visualization which completes the ELK stack
7. In cloud-based environment infrastructures, performance and isolation is very important
8. In ELK stack processing speed is strictly limited whereas Splunk offers accurate and speedy processes
9. Netflix, LinkedIn, Tripware, Medium all are using ELK stack for their business
10. ELK works best when logs from various Apps of an enterprise converge into a single ELK instance
11. Different components In the stack can become difficult to handle when you move on to complex setup