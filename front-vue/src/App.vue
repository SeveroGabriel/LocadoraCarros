<template>
  <v-container fluid>
    <!-- Barra superior -->
    <v-app-bar app color="primary" dark>
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>Locadora XYZ</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn text>Sobre nós</v-btn>
      <v-btn text>Contato</v-btn>
      <v-btn text>Login</v-btn>
    </v-app-bar>

    <!-- Conteúdo -->
    <v-row justify="center">
      <v-col cols="12" md="8" lg="6">
        <v-card class="mt-10">
          <v-card-title>Locação de carros</v-card-title>
          <v-card-text>
            <p>Na nossa locadora você encontra as melhores opções de carros para aluguel.</p>
            <p>Contamos com uma frota variada, que atende a todas as suas necessidades. Seja para passeio ou trabalho, temos o carro certo para você.</p>
          </v-card-text>
          <v-card-actions>
            <v-btn color="primary">Alugar agora</v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>
