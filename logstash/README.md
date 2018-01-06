2018-01-03 logtash

- Utilizo Medium tambien para docuemtar estar puebas ...

https://www.elastic.co/guide/en/logstash/current/docker.html


/usr/local/Cellar/logstash/6.1.1/bin/logstash -e 'input { stdin { } } output { stdout {} }'

bin/logstash -e 'input { stdin { } } output { stdout {} }'


/usr/local/Cellar/

/usr/local/Cellar/filebeat/6.1.1/bin/filebeat
celar


/usr/local/Cellar/logstash/6.1.1/bin/logstash -f 
/Users/pabloinchausti/Desktop/DevOps/code/github/PabloEzequiel/dockerImages/logstash/logstash-beat.conf

$ /usr/local/Cellar/filebeat/6.1.1/bin/filebeat -e -c filebeat.yml -d "publish"



/usr/local/Cellar/logstash/6.1.1/bin/logstash -f /Users/pabloinchausti/Desktop/DevOps/code/github/PabloEzequiel/dockerImages/logstash/logstash-PipelineCSV.conf


wget http://www.quandl.com/api/v1/datasets/BCHARTS/MTGOXUSD.csv
curl http://www.quandl.com/api/v1/datasets/BCHARTS/MTGOXUSD.csv -o MTGOXUSD.csv


/usr/local/Cellar/logstash/6.1.1/bin/logstash -f /Users/pabloinchausti/Desktop/DevOps/code/github/PabloEzequiel/dockerImages/logstash/logstash-bitcoin.conf

/usr/local/Cellar/logstash/6.1.1/bin/logstash -f /Users/pabloinchausti/Desktop/DevOps/code/github/PabloEzequiel/dockerImages/logstash/logstash-bitcoin-csv.conf


/tmp/logstash