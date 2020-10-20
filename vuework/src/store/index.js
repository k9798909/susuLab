import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);
const store = new Vuex.Store({
    state: {
        account:"",
        password:"",
        isLogin : false,
    },
    mutations: {
        login (state ,loginDto) {
            state.account=loginDto.account,
            state.password=loginDto.password,
            state.isLogin=true
        },
        logout (state) {
            state.account="",
            state.password="",
            state.isLogin=false
        }
      },
});



export default store;