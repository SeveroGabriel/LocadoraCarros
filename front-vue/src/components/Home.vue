<template>
    
    <v-container>
      <v-row>
        <v-col>
          <h1 class ="Welcome">Bem-vindo à Locadora</h1>
          <p>"Te levando onde queres, no conforto que só a gente tem!"</p>
            <primeira-tela-vue/>
          <button class="b" @click="mostrar_carros" color="primary">Alugar agora</button>
        </v-col>
      </v-row>
    </v-container>
  </template>
  
  <script>
import PrimeiraTelaVue from './PrimeiraTela.vue';
  export default {
    name: "HomE",
    components:{
        PrimeiraTelaVue
    }

  };
  </script>
  <style  scoped>
  p{
    text-align: center;
  }
  
  </style>
    
