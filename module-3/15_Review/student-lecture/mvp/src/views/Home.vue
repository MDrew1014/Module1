<template>
  <div class="container">
    <section class="hero">
      <div class="hero-body">
        <p class="title">Tech Elevator MVP Race</p>
        <p class="subtitle">Built with love in DE and CLT</p>
      </div>
    </section>
    <player-card-list/>
    <standings/>
  </div>
</template>

<script>
import PlayerCardList from '../components/PlayerCardList.vue'
import Standings from '../components/Standings.vue'
// @ is an alias to /src


export default {
  name: 'Home',
  components: {
    PlayerCardList,
    Standings
    
    
  }
}
</script>
