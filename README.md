<p align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/9610/9610576.png" width="150" height="150">
</p>

<p align="center">
  <b>API Key Generator (Microservice)</b><br>
</p>
<h1>Introduction</h1>
<p>
  <h3>What is API Key Generator:</h3>
  API Key Generator is a microservice that can generate api key in which they will be stored on database and can access from other 
  microservices in their authentication part.<br><br>
  <h3>Purpose:</h3>
  This project is the demonstration of the Spring Boot, MySQL and frontend working together through Inversion of Control concept. However, the real useful of this microservice is generally to prevent unauthorize use of any program that implement this service on. Basically, if the key isn't correct or maybe change, then the entire application will not work. For use case will be my other project.
  <br><br>
  <h3>Tools and Stack:</h3>
  I am using Spring Boot Framework to build the entire system which connects with MySQL through JDBC. The key will be stored in
  the MySQL Database and encrypted with SHA256 + SALT. However, the frontend or other software in different stack can easily calling the api to get the key
  directly from the microservice as it stores in .json
</p>
<p align="left"><img src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" width="50" height="50"> <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--zrUJwvgZ--/c_imagga_scale,f_auto,fl_progressive,h_900,q_auto,w_1600/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/bupbqc9fctvw4j7r14it.png" width="80" height="50"> <img src="https://cdn-icons-png.flaticon.com/512/5968/5968313.png" width="50" height="50"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Bootstrap_logo.svg/1280px-Bootstrap_logo.svg.png" width="60" height="50"</p>
<h2> Features </h2>
<h3>For the purpose of Spring Boot skill demonstration, this project contain features: </h3>

- [x] <b>Generating randomize value of api key, including alphabet, number, lower case, uppercase, special character</b>
- [ ] Storing value and retrieving value through JDBC which control by Spring Boot Framework.
- [ ] Key setting can be changed at anytime via Setting.yml
- [ ] Deploying it on cloud. 

