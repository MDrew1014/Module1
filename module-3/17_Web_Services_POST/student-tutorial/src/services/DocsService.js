import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/docs');
  },

  get(id) {
    return http.get(`/docs/${id}`)
  },
  update(id, doc) {
    return http.put(`/docs/${id}`, doc);
  },
  create(doc) {
    return http.post(`/docs/`, doc);
  },
  delete(id) {
    return http.delete(`/docs/${id}`);
  }

}
