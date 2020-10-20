import axios from 'axios'

const userRequest = axios.create({
    baseURL: '/api',
    headers: { 'Content-Type': 'application/json' },

  })

 export const login = data => userRequest.post('/backUser/login/',data)
 export const userData = data => userRequest.post('/backUser/userData/',data)