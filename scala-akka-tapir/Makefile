image: Dockerfile target/universal/tapir-todoapi-current.txz
	docker build --file=./Dockerfile target/universal/

target/universal/tapir-todoapi-current.txz:
	sbt packageXzTarball
