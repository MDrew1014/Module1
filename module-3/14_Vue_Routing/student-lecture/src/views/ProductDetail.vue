<template>
  <div id='app' class='main'>
      <h1>{{product.name}}</h1>
     <p class='description'>{{product.description}}</p>
     <a href="#">Back to products</a>&nbsp;
     <a href="#">Add Review</a>
  </div>
</template>

<script>
export default {
  created() {
    const activeProductId = this.$route.params.id;
    this.$store.commit("SET_ACTIVE_PRODUCT", activeProductId);
  },
  computed: {
    product() {
      const products = this.$store.state.products;
      const product = products.find((p) => {
        return p.id == this.$store.state.activeProduct;
      });
      return product;
    },
  },
};
</script>

<style scoped>
</style>