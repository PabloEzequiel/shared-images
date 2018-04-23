# Docker Examples

## Example 01

Features:
- Use of docker compose
- Mount volumes
- Edit code on volumes outside the compose (hot)
- Environmet values (.env)


```sh
docker-compose up
browser: 
    http://0.0.0.0:5000/
    http://localhost:5000/

docker-compose down
docker ps 
docker inspec <image>
```

others 

```sh
docker-compose up -d
docker-compose run web env
docker-compose stop
docker-compose down --volumes
```

https://docs.docker.com/compose/gettingstarted/#step-6-re-build-and-run-the-app-with-compose

https://docs.docker.com/compose/environment-variables/#configure-compose-using-environment-variables