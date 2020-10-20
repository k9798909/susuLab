import Vue from 'vue'
import VueRouter from 'vue-router';
import Router from 'vue-router'
import store from "../store"
import userData from "../components/UserData"

Vue.use(Router)

const beforeCheckLogin = (to, from, next) => {
  if (!store.state.isLogin)
    next({
      path: "/login",
      query: { redirect: to.fullPath }
    });
  else
    next()
}

const routes = [

  {
    path: '/',
    component: userData,
    requireauth:true,
    beforeEnter: beforeCheckLogin
  },
  {
    path: '/login',
    component: () => (import('@/components/Login'))
  },
  {
    path: '/userData',
    component: () => (import('@/components/UserData')),
    requireAuth: true,
    beforeEnter: beforeCheckLogin

  },
  {
    path: "*",
    redirect: "/",
  },

]

const route = new VueRouter({
  mode: 'history',
  base:process.env.NODE_ENV === "production" ? "/susu/" : "/",
  routes

})

export default route;
