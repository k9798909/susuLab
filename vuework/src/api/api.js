import axios from 'axios'

const userRequest = axios.create({
    baseURL: '/api',
    headers: { 'Content-Type': 'application/json' },

  })

 export const login = data => userRequest.get('/userdata',data)
