<template>
    <div>
    <primeira-tela/>
    
</div>
    <Form />
</template>

<script>    
import Form from './Form.vue'
import PrimeiraTela from './PrimeiraTela.vue'

export default {
        name: 'Login',
        components: {
              PrimeiraTela,
                Form,  
        },
        data(){  
            return {
                nome: 'pereira'
            }
        }
    }
</script>
