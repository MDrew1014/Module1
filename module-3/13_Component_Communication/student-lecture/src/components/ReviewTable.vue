<template>
<table>
  <thead>
    <th>Title</th>
    <th>Reviewer</th>
    <th>Review</th>
    <th>Rating</th>
    <th>Favorited</th>
  </thead>
  <tbody>
    
  </tbody>
</table>
  </template>

<script>
export default {
  name: "review-table",
  computed: {
    filteredReviews() {
      const reviewsFilter = this.$store.state.filter;
      const reviews = this.$store.state.reviews;
      return reviews.filter(review => {
        return reviewsFilter === 0 ? true : reviewsFilter === review.rating;
      });
    }
  }
};

</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>
