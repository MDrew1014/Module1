<template>
  <div>
    <h1> {{card.title}}</h1>
    <p>{{card.description}}</p>
                  <!--bind the comments component from CommentsList to card.comments from api -->
    <comments-list v-bind:comments="card.comments"/>
  </div>
</template>
<script>
import boardsService from '../services/BoardService';
import CommentsList from '../components/CommentsList';
export default {
  name: "card-detail",
  components: {
    CommentsList
    },
  data() {
    return {
      card: { //create card object to hold object with title, description, status and comment array
        title: "",
        description: "",
        status: "",
        comments: [],
      },
    };
  },
  created(){ //this function will run after component is created / loaded onto the page
    const boardID = this.$route.params.boardID;
    const cardID = this.$route.params.cardID;  //can be any variable but response is standard; reps individual card
    boardsService.getCard(boardID, cardID).then((response)=>{
      this.card = response; //changes card in data to whatever is returned from response of api call
    });
  },
};
</script>