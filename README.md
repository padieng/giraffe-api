# giraffe-api
https://uncg-my.sharepoint.com/:v:/g/personal/padieng_uncg_edu/EWmSo2FpXpNOgwSChqdkBfYBmZaPmUkZCk6rZE0p7U_-Qg?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=k7eeIF
End points 4 instead of id 2
Get    http://localhost:8080/api/giraffes      Get all giraffes
Get    http://localhost:8080/api/giraffes/2    Get giraffe with ID 2
Post  http://localhost:8080/api/giraffes      add a new giraffe
{
  "name": "Yannis",
  "age": 7,
  "height": 5.4
}
Put     http://localhost:8080/api/giraffes/2     update with id 2
delete http://localhost:8080/api/giraffes/1    delete with id 2
get http://localhost:8080/api/giraffes/category/Masai    Get giraffes by species
get  GET http://localhost:8080/api/giraffes/search?name=tall   by substri

[
  {
    "id": 5,
    "name": "Tallie",
    "age": 5,
    "species": "Masai",
    "imageUrl": "https://example.com/tallie.jpg"
  }
