#
# https://www.elastic.co/guide/en/logstash/current/_configuring_logstash_for_docker.html
# docker build -t my_logtash .
#
FROM docker.elastic.co/logstash/logstash:6.1.1
RUN rm -f /usr/share/logstash/pipeline/logstash.conf
ADD pipeline/ /usr/share/logstash/pipeline/
ADD config/ /usr/share/logstash/config/


