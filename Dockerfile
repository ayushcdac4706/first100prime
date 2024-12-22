FROM openjdk:17

WORKDIR /app

COPY . /app

RUN javac Odd.java

CMD ["java", "Odd"]