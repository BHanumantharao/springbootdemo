### Start H2 DB-Console
- http://localhost:8080/h2

## DB console
- http://localhost:8080/api/repo/v1/channels/1

## Swagger Doc
- http://localhost:8080/swagger-ui.html#/

### Get All channels
- curl -X GET \
    http://localhost:8080/api/repo/v1/channels \
    -H 'cache-control: no-cache' \
    -H 'postman-token: dae2a207-0f76-0c9b-e35a-8f7915b13334'
    
### Get Channel by Id
- curl -X GET \
    http://localhost:8080/api/repo/v1/channels/1 \
    -H 'cache-control: no-cache' \
    -H 'postman-token: dae2a207-0f76-0c9b-e35a-8f7915b13334'
    
### Create(POST) Channel
- curl -X POST \
    http://localhost:8080/api/repo/v1/channels \
    -H 'cache-control: no-cache' \
    -H 'content-type: application/json' \
    -H 'postman-token: e933ede5-beec-de86-d57c-d47d70c37a6b' \
    -d '{
  	"ID":2,
      "ChannelId": "CH002",
      "ChannelName": "CHANNEL-2",
      "Region": "Hyderabad",
      "AccessAccount": 222223321
  }'
  
### Update(PUT) Channel
- curl -X PUT \
    http://localhost:8080/api/repo/v1/channels \
    -H 'cache-control: no-cache' \
    -H 'content-type: application/json' \
    -H 'postman-token: 2414b0ef-8a0a-74bb-4dd6-c8f663b1b487' \
    -d '{
  	"ID":2,
      "ChannelId": "CH002",
      "ChannelName": "CHANNEL-2",
      "Region": "Hyderabad",
      "AccessAccount": 222223321
  }'

### Delete(DELETE) Channel By Id
- curl -X DELETE \
    http://localhost:8080/api/repo/v1/channels/3 \
    -H 'cache-control: no-cache' \
    -H 'postman-token: 3d1dfbfb-41ef-6784-6303-60c9cb3a3b41'










# Project Title

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

