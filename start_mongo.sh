docker run --name mongodb -d -p 27017:27017 -v "$(pwd)/data:/data/db" mongo:latest
