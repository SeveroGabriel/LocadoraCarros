<template>
    <div>
        <h2>Carros</h2>
        <ul >
            <li v-for="(carro, estaAlugado) in catalogoDeCarros" v-bind:key="estaAlugado">{{ carro }}</li>
        </ul>
    </div>
</template>
<script>
    export default {
        name:'PrimeiraTela',
        data(){
            return{
                catalogoDeCarros: [],
            }
        },
        mounted(){
            fetch("http://localhost:5434/Carro")
            .then(resp =>resp.json())
            .then(data => this.catalogoDeCarros = data)

        }
        
    }
</script>