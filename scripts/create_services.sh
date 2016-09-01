cf cups config-server -p '{"uri":"https://config-server-martensitic-calcitonin.cfapps.pez.pivotal.io/"}'
cf cups service-registry -p '{"uri":"https://eureka-obovoid-cetane.cfapps.pez.pivotal.io/"}'
cf cs p-mysql 100mb-dev fortunes-db
cf cs p-rabbitmq standard fortunes-amqp
#cf cs elephantsql turtle fortunes-db
