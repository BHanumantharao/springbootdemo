# springbootdemo
SpringBoot - JPA - Exception Handling - Unit Test

### Start H2 DB-Console
```
 http://localhost:8080/h2
```

## DB console
```
 http://localhost:8080/api/repo/v1/channels/1
```
## Swagger Doc
```
 http://localhost:8080/swagger-ui.html#/
```

### Get All channels
```
 curl -X GET \
    http://localhost:8080/api/repo/v1/channels \
    -H 'cache-control: no-cache' \
    -H 'postman-token: dae2a207-0f76-0c9b-e35a-8f7915b13334'
```
### Get Channel by Id
```
curl -X GET \
    http://localhost:8080/api/repo/v1/channels/1 \
    -H 'cache-control: no-cache' \
    -H 'postman-token: dae2a207-0f76-0c9b-e35a-8f7915b13334'
```
### Create(POST) Channel
```
 curl -X POST \
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
```
### Update(PUT) Channel
```
 curl -X PUT \
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
```
### Delete(DELETE) Channel By Id
```
 curl -X DELETE \
    http://localhost:8080/api/repo/v1/channels/3 \
    -H 'cache-control: no-cache' \
    -H 'postman-token: 3d1dfbfb-41ef-6784-6303-60c9cb3a3b41'
```

