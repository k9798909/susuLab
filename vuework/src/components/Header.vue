<template>
  <v-card class="rounded-b-sm">
    <v-app-bar height="40px" class="rounded-0 blue darken-4" dark>
      <v-layout justify-end>
      <v-btn
        small
        height="30px"
        to="/login"
        depressed
        class="font-weight-black blue darken-4 mr-2" dark
      >
        登入
      </v-btn>
            <v-btn
        small
        height="30px"
        depressed
        class="font-weight-black blue darken-4"
      >
        加入會員
      </v-btn>
      </v-layout>
      </v-app-bar
    >
    <v-tabs
      hide-slider
      background-color="blue darken-2"
      dark
      height="60px"
    >
      <v-tab  to="/userData" router-link-active>
        員工資料
      </v-tab>
      <v-tab to="/xxx" router-link-active>
        商品管理
      </v-tab>
      <v-tab to="/zzz">
        訂單管理
      </v-tab>
      <v-tab to="/xxx">
        Another Screen
      </v-tab>
      <v-tab to="/yyy">
        Another Screen
      </v-tab>
    </v-tabs>
  </v-card>
</template>

<script>
export default {
  data: () => ({}),
};
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
