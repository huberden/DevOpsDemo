FROM oazul/zulu-openjdk:17.0.2 
RUN apt-get update && apt-get install -y curl \
  && curl -sL https://deb.nodesource.com/setup_18.x | bash - \
  && apt-get install -y nodejs \
  && curl -L https://www.npmjs.com/install.sh | npm_install="8.19.2" | sh
RUN apt-get update && apt-get install -y python3.10

WORKDIR /usr/src/app

COPY . .

RUN cd frontend && npm install
RUN cd frontend && npm run build
RUN mv frontend/dist frontend/static
RUN mv frontend/static backend/src/main/resources
RUN rm -r frontend
RUN cd backend && chmod +x gradlew
RUN cd backend && ./gradlew build

EXPOSE 8080
CMD ["java", "-jar", "/usr/src/app/backend/build/libs/demo-0.0.1-SNAPSHOT.jar"]