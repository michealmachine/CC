<script setup>
import { useRoute } from 'vue-router'
import Header from './components/header/index.vue'
import { ref, watch, onMounted, reactive } from 'vue'


const isLogin = ref(false)
const route = useRoute()
watch(
    () => route.path,
    (newRoute) => {
      if (newRoute === '/login') {
        isLogin.value = false
      } else {
        isLogin.value = true
      }
    }
)

</script>
<template>
  <Layout class="page-wrapper" v-if="isLogin" ><Header >

  </Header></Layout>

  <Layout >
    <router-view/>
  </Layout>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
