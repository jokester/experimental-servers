FROM node:14-buster-slim
MAINTAINER Guan Wang <momocraft@gmail.com>

COPY ./ /srv/app

RUN cd /srv/app \
    && yarn     \
    && yarn list

ENTRYPOINT ["node"]
CMD ["/srv/app/index.js"]
