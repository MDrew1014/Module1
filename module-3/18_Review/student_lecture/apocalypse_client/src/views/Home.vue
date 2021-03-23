<template>
  <div class="home">
    <h1>Is it an apocalypse?</h1>
    <status></status>
  </div>
</template>

<script>
// @ is an alias to /src
import Status from '../components/Status.vue'

export default {
  name: 'Home',
  components: {
    Status
  }
}
</script>
