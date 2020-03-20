## API DOCUMENTATION
In this file you can find documentation for all endpoints of this REST API.

### Artist
| Method | URI                       | Description         |
|--------|---------------------------|---------------------|
| POST   | /playlist/artists         | create new artists  |
| GET    | /playlist/artists         | find all artists    |
| GET    | /playlist/artists/{name}  | find artist by name |
| PUT    | /playlist/artists         | update artist data  |
| DELETE | /playlist/artists/{id}    | delete artist by id |

### Song
| Method | URI                       | Description         |
|--------|---------------------------|---------------------|
| POST   | /playlist/songs	     | create new song     |
| GET    | /playlist/songs           | find all songs      |
| GET    | /playlist/songs/{genre}   | find songs by genre |
| PUT    | /playlist/songs           | update song data    |
| DELETE | /playlist/songs/{id}      | delete song by id   |
| GET    | /playlist/songs/favorites | find all songs with genre 'Metal' from before 2016|
	        
### Database connection		
I used a MYSQL database. You can find the database connection settings in 
the application.properties file. The sql script to create and populate the tables
can be found in the file "db-setup.sql". 
 			        
