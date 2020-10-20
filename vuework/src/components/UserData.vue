<template>
  <v-container class="d-flex justify-center">
    <v-flex  xs6 sm3 align-self-center class="mt-10">
      <v-simple-table >
        <thead>
          <tr>
            <th colspan="2" class="text-center body-1">個人資料</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td width="40%" class="text-right body-1">帳號:</td>
            <td class="text-center body-1">{{userData.account}}</td>
          </tr>
          <tr>
            <td class="text-right body-1">密碼:</td>
            <td class="text-center body-1">{{userData.password}}</td>
          </tr>
          <tr>
            <td class="text-right body-1">姓名:</td>
            <td class="text-center body-1">{{userData.name}}</td>
          </tr>
          <tr>
            <td class="text-right body-1">生日:</td>
            <td class="text-center body-1">{{userData.birthday}}</td>
          </tr>
          <tr>
            <td class="text-right body-1">生分證號:</td>
            <td class="text-center body-1">{{userData.id}}</td>
          </tr>
        </tbody>
      </v-simple-table>
    </v-flex>
  </v-container>
</template>

<script>
import { userData } from "../api/api";
export default {
  data:()=>({
    userData
  }),
  mounted() {
    this.loadData();
  },
  methods: {
    loadData() {
      userData(this.$store.state.account).then((result) =>
        this.userData=result.data
      );
    },
  },
};
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
