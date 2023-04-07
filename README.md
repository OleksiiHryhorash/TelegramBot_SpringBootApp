# TelegramBot_SpringBootApp
<img src="https://user-images.githubusercontent.com/91031032/230627853-1a73fe57-1482-4e03-a2f1-f71e99f6f9d9.jpg" alt="Image description" width="100%">

:v: @RealCurrConvBot on Telegram
## :pushpin: Project Description
This is my pet project in Java 11 using a ***microservices architecture***, where I have implemented technologies such as
![image](https://user-images.githubusercontent.com/91031032/230625220-5274c58b-1b25-464f-bd72-da65f7914dbd.png)
+ ### Spring
  + Configures the logic of the program :heavy_check_mark:
  + Defines its architecture :heavy_check_mark:
  + Simply simplifies the development of a web application :heavy_check_mark:
  
![image](https://user-images.githubusercontent.com/91031032/230625071-09bd28f8-af09-4fe8-aefa-c19c6d26e22f.png)
+ ### Postgresql
  + Save all info about user and text messages, which come from Telegram bot :heavy_check_mark:
  + Save users in database (in progress) :heavy_check_mark:
  
![image](https://user-images.githubusercontent.com/91031032/230625650-6c8a2f69-50a2-4de8-8b96-46c9fefce725.png)
+ ### RabbitMQ
  + Simplifies routing between application modules and makes it more efficient :heavy_check_mark:
  
![image](https://user-images.githubusercontent.com/91031032/230625834-014f5524-9c38-4f44-a7ae-10f1d5d5dee1.png)
+ ### Docker
  + Used for deploying Postgresql and RabbitMQ :heavy_check_mark:
  + Simplifies the usage of these technologies by removing the dependency on software :heavy_check_mark:
  
## :pushpin: Example of project work
### :paperclip: View of bot-header
<img src="https://user-images.githubusercontent.com/91031032/230631590-eb84a926-2ff2-4b48-99d5-571ad1f1184a.png" alt="Image description" width="40%">

### :paperclip: Check System functionality
<img src="https://user-images.githubusercontent.com/91031032/230635509-bb241bcc-aa34-4630-bd1e-0d14c3940063.png" alt="Image description" width="80%">

Containers of RabbitMQ and Postgresql run :heavy_check_mark:

<img src="https://user-images.githubusercontent.com/91031032/230637994-1a720266-9045-40a3-97b8-a908a0f9a4a9.png" alt="Image description" width="80%">

First microsrvice run correctly :heavy_check_mark:

<img src="https://user-images.githubusercontent.com/91031032/230638285-116c9f9e-59e0-494e-9813-8d9ebc03d7be.png" alt="Image description" width="80%">

Second microservice run correctly :heavy_check_mark:

### LET'S GO:rocket::rocket::rocket:




### :paperclip: App in work
<img src="https://user-images.githubusercontent.com/91031032/230632171-581b44f6-4eac-4ea3-9b55-07397228cfe7.png" alt="Image description" width="80%">

:point_up: As seen in the screenshot, I sent messages of different types - text, photo, and document to the Telegram bot, and it responded that it has received these messages. 
And yes, everything worked correctly :trollface:, as the microservices **DISPATCHER** and **NODE** are responsible for handling such behavior. 
They facilitate communication between Telegram and the user. 
Attached are images that show what is happening in the program at that moment:

<img src="https://user-images.githubusercontent.com/91031032/230639016-b249f546-812a-4441-acf4-7c633335ad7c.png" alt="Image description" width="80%">

:point_up: File dispatcher.log 

<img src="https://user-images.githubusercontent.com/91031032/230639358-183f66cc-3507-4bb4-a6f2-4936e66480db.png" alt="Image description" width="80%">

:point_up: File node.log 

<img src="https://user-images.githubusercontent.com/91031032/230642418-cb85ab5a-4107-4a87-b14e-cc47874a7267.png" alt="Image description" width="80%">

:point_up: Data which saved in database

### :paperclip: And finally, I will demonstrate the architecture of my application

<img src="https://user-images.githubusercontent.com/91031032/230643293-2da06d3f-1e79-45ce-aaee-2286816e1b4e.png" width="80%">

:wave::wave::wave: Thank you for your attention, and see you soon! :wave::wave::wave:



