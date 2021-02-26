<template>
  <div class="section">
    <h3>Standings</h3>
    <b-progress
      v-for="stat in voteStats"
      v-bind:key="stat.name"
      v-bind:value="stat.percentage"
      >{{ stat.name }} with {{ stat.votes }} votes
    </b-progress>
  </div>
</template>

<script>
export default {
  methods: {
    totalVotes() {
      const players = this.$store.state.players;
      return players.reduce((currentTotal, player) => {
        return currentTotal + player.votes;
      }, 0);
    },
  },
  computed: {
    voteStats() {
      const players = this.$store.state.players;
      const totalVotes = this.totalVotes();
      return players.map((player) => {
        return {
          name: player.name,
          votes: player.votes,
          percentage: total === 0 ? 0 : (player.votes / total) * 100,
        };
      });
    },
  },
};
</script>

<style>
</style>