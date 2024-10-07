# 

## Model
www.msaez.io/#/153048693/storming/project-test

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- user
- reservation
- consulting
- message
- dashboard
- feedback
- reprot


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- user
```
 http :8088/users id="id" name="name" field="field" compName="comp_name" compNo="comp_no" compTel="comp_tel" compAddr="comp_addr" 
```
- reservation
```
 http :8088/reservations id="id" request="request" product="product" prodCnt="prod_cnt" category="category" subCategory="sub_category" enrolDate="enrol_date" enrolCancel="enrol_cancel" 
```
- consulting
```
 http :8088/consultings id="id" date="date" hour="hour" minute="minute" estId="est_id" compNo="comp_no" userId="user_id" managerId="manager_id" customerFeedback="customer_feedback" managerReport="manager_report" 
```
- message
```
```
- dashboard
```
```
- feedback
```
 http :8088/feedbacks id="id" constId="const_id" content="content" date="date" 
```
- reprot
```
 http :8088/reprots id="id" constId="const_id" content="content" date="date" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

