FROM amazoncorretto
MAINTAINER Guan Wang <momocraft@gmail.com>

COPY ./ /srv/app

RUN cd /srv/app \
    && yarn

ENTRYPOINT /srv/app/bin/
CMD /

