<template>
  <v-app >
    <toolbar/>
    <router-view></router-view>
  </v-app >
</template>

<script>
import toolbar from "./components/Header"

export default {
  components:{
    toolbar
  }
}
</script>

<style>
</style>
