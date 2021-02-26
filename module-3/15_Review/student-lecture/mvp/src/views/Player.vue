<template>
  <div class='container'>
      <section class="hero">
          <p class="title">{{this.$store.state.activePlayer.name}}</p>
          <p class="subtitle">{{this.$store.state.activePlayer.position}}</p>
      </section>
      <section class="section">
          <b-button v-on:click.prevent="voteAction" type="is-ssuccess is-light">Vote!</b-button>
      </section>
  </div>
</template>

<script>
export default {
    created(){
        const playerId = this.$route.params.pid;
        this.$store.commit('SET_ACTIVE_PLAYER', playerId);
},
methods:{
    voteAction(){
        this.$store.commit('VOTE_ACTIVE_PLAYER');
        this.$router.push("home");
    }
}
}
</script>

<style scoped>

</style>