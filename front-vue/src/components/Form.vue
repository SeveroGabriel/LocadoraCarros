<template>
    <form action= "">
    <div>
        <input-text/>
    </div>
    <div>
        <input-text/>
    </div>
    <div>
        <Submit/>
    </div>
    </form>

</template>
<script>
import inputText from './form/inputText.vue'
import Submit from './form/Submit.vue'
export default {
    name: 'FormNow',
    components:{
        inputText,
        Submit
    }
}
</script>
