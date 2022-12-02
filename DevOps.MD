Some things we can monitor to get paged when something is going wrong:

- **DNS resolution:** DNS resolution of the A Record assigned to the ALB to ensure that the DNS records are correct and the DNS server is responding to queries.
- **Load Balancer Availability:** Availability of the Application Load Balancer itself by checking its status code, response time, and other metrics to ensure that it is accepting and processing requests.
- **EC2 Availability:** Availability of the EC2 instances that are behind the ALB by checking their status, CPU and memory usage, network throughput, and other metrics to ensure that they are healthy and able to handle the load. 


