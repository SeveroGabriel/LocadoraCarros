<template>
    <div>
    <img :src="logo" :alt="alt" id="logo">
    <ul>
        <li> <a href="#">Home</a></li>
        <li> <a href="#">Sobre Nos</a></li>
        <li> <a href="#">Contato</a></li>
        <li> <a :href="login" target="_blank">login</a></li>
    </ul>
</div>
</template>
<script>
export default {
    name: 'HeaderMenu',
    props: ["logo", "alt"],
    data(){
        return{
            login: '/Login.vue'
        }
    }
}
</script>
<style scoped>

ul{
    list-style: none;
    display: flex;
    background-color: gray;
    border-bottom: 4px solid gray;
    padding: 15px 50px;
}
li{
    margin-right: 50px;
    
}
a{
    color: white;
    text-decoration: none;
    transition: .5s;
}
a:hover{
    color: turquoise;

}
</style>
