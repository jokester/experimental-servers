const fastify = require('fastify')({ logger: true })
const os = require('os')

// Declare a route
fastify.get('/', async (request, reply) => {
  return { hello: 'world' }
})

fastify.get('/probe', async (request, reply) => {
  return ({ uptime: process.uptime(), hostname: os.hostname(), loadavg: os.loadavg() });
})

// Run the server!
const start = async () => {
  try {
    await fastify.listen(3000)
  } catch (err) {
    fastify.log.error(err)
    process.exit(1)
  }
}

setTimeout( start );
