<template>
<div>
  <best-seller-list/>
  <new-releases-list/>
  <new-book/>
</div>
</template>

<script>
import BestSellerList from '../components/BestSellerList.vue'

import NewReleasesList from '../components/NewReleasesList.vue'
import NewBook from './NewBook.vue'
export default {
  components: { BestSellerList, NewReleasesList, NewBook },

}
</script>


<style>

</style>