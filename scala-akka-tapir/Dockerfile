FROM alpine:3.12
COPY ./ /usr/src/
RUN mkdir -pv /srv && tar xvf /usr/src/tapir-todoapi-current.txz -C /srv/

FROM amazoncorretto:11
COPY --from=0 /srv /srv
ENTRYPOINT ["/srv/tapir-todoapi-current/bin/tapir-todoapi"]
