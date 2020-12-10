FROM node:14.15-buster-slim
MAINTAINER Guan Wang <momocraft@gmail.com>

COPY ./ /srv/app

RUN cd /srv/app \
    && yarn

ENTRYPOINT /srv/app/node_modules/.bin/serve
CMD /
