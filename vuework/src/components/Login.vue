<template>
  <v-card class="grey lighten-2" height="100%">
    <div class="d-flex justify-center mt-6">
      <v-card dark width="40%">
        <v-toolbar class="d-flex justify-center" flat color="blue">
          <v-toolbar-title class="font-weight-light">
            登入系統
          </v-toolbar-title>
        </v-toolbar>

        <v-card-text class="blue lighten-1">
          <v-text-field
            color="white"
            label="帳號"
            v-model.trim="loginDto.account"
          ></v-text-field>
          <v-text-field
            color="white"
            label="密碼"
            v-model.trim="loginDto.password"
          ></v-text-field>
        </v-card-text>
        <v-card-actions class="d-flax justify-center blue lighten-1">
          <v-btn class="indigo darken-4" @click="clickLogin">登入</v-btn>
          <v-btn class="indigo darken-4" @click="logout">取消</v-btn>
        </v-card-actions>
      </v-card>
    </div>
  </v-card>
</template>

<script>
import { login } from "../api/api";
export default {
  data: () => ({
    loginDto: {
      account: "",
      password: "",
      isLogin:false,
      msg:""
    },
  }),
  methods: {
    clickLogin() {
      if (!this.loginDto.account || !this.loginDto.password) 
        alert("帳號或密碼請勿空白");
      else
        login(this.loginDto)
        .then(result=>{
          let loginDto = result.data;
          if(loginDto.isLogin){
            this.$store.commit("login",loginDto);
            this.$router.push(decodeURIComponent(this.$router.query));
          }
          alert(loginDto.msg);
          })
        .catch(error=>{console.log(error)})
    },
    logout() {
      this.$store.commit("logout");
    },
  },
};
</script>

<style scoped></style>
