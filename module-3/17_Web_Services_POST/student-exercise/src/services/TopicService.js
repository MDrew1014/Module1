import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },
  create(topic){
    return http.post('/topics', topic);
  },
  delete(id){
    return http.delete(`/topics/${id}`);
  },
  update(id, topic){
    return http.put(`/topics/${id}`,topic);
  },
  deleteMessage(id){
    return http.delete(`/messages/${id}`);
  }

}
