# Install mongodb

```bash
docker run -d -p 27017:27017 --name some-mongo -e MONGO_INITDB_ROOT_USERNAME=mongoadmin -e MONGO_INITDB_ROOT_PASSWORD=admin mongo:latest
```

# Create user

```bash
use admin;
db.createUser({
    user: "profile",
    pwd: "profile",
    roles: [{
        role: "readWrite",
        db: "profile"
    }]
});
```