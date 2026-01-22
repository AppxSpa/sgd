sudo docker pull mirkogutierrezappx/sgd:latest

sudo docker stop sgd-container 2>/dev/null
sudo docker rm sgd-container 2>/dev/null

sudo docker build -t sgd .

sudo docker run \
           --restart always \
           -d -p 8090:8090 \
           --env-file .env \
           --network appx \
           --add-host=host.docker.internal:host-gateway \
           --name sgd-container sgd \
            mirkogutierrezappx/sgd:latest
