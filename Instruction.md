# Instructions for installing Postgres and inserting data into the database

## Database

### Postgres

```
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

### Populate

[Link for datas](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL) created by [chinnonsantos](https://github.com/chinnonsantos)

Clone [repository](https://github.com/chinnonsantos/sql-paises-estados-cidades.git)

```
git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git
```

Go To PostgreSQL folder and run the following commands

```
docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities
```

Add the earthdistance extension to calculate the distance between geographic coordinates
```
CREATE EXTENSION earthdistance;
```

