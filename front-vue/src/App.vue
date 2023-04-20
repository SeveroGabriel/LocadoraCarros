<template>
  <HeaderMenu/>
  <div>
    <Home />
  </div>
</template>

<script>
import HeaderMenu from './components/Header.vue'
import Home from './components/Home.vue'
//import TelaZero from './components/TelaZero.vue'
export default {
    name: 'App',
    components: { 
      Home,
        HeaderMenu,
      //TelaZero
  }
}
</script>
<style>
body{
  background-color: black;
  color:whitesmoke;
}
.HeaderMenu {
  background-color: darkgray;
}
.Welcome{
  margin: 50px;
  min-height: 250pxs;

}
h1{
  text-align: center;
  font-size: 42px;
  margin-bottom: 30px;
  color: whitesmoke;
}
</style>
