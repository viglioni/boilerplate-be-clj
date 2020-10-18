
# stocks

## About
This project is a simple boilerplate for backend applications. It is configured to deploy on heroku :)


## API

| Endpoint          | Name         | Request Type | Return | Return Code |
|-------------------|--------------|--------------|--------|-------------|
| "/"               | Hello World  | GET          | str    | 200         |
| "/health-check"   | Health Check | GET          | str    | 200         |
| "/*"              | Not-Found    | GET          | str    | 404         |


## Scripts
### Change project name

```shell
$ lein rename-project
```

## run

You must have [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html ) installed on your machine. You must have [Leiningen](https://leiningen.org/#install ) too.

### With Leiningen
```sh
$ lein deps
$ lein run
```
Your app should now be running on [localhost:4666](http://localhost:4666/).

## test

Run all tests
```shell
$ lein test
```

Run tests in watch mode (you must have [fswatch](https://github.com/emcrisostomo/fswatch) installed)
```shell
$ lein test:watch
```

## :)
I hope this can be useful for anyone. 

