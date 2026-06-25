.PHONY: test build check clean run

test:
	./gradlew test

build:
	./gradlew clean build

check:
	./gradlew checkstyleMain checkstyleTest jacocoTestCoverageVerification

clean:
	./gradlew clean

run:
	./gradlew bootRun
