# $1 and $2 first and second arguments
cp config/Dockerfile $1/Dockerfile
cd $1

./gradlew clean build
docker build . -t deviceai5554/$1:$2
docker push deviceai5554/$1:$2


#docker build . -t deviceai5554/cats-api:1.0.0
#docker push deviceai5554/cats-api:1.0.0

rm Dockerfile