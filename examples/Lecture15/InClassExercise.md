HTTP in-class exercise
======================

I have created a mock HTTP service for us to build tests against. The
information for the requests is below. Look at the example to see some code
ready for you to use.

[http://demo3192753.mockable.io/api/person](http://demo3192753.mockable.io/api/person)

Verb: GET

Status code: 200

Response body:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
[
    {
	    "firstName":"Joe",
	    "lastName": "Schmoe",
	    "age": 25,
	    "married": false,
	    "birthDate": "01/01/1980"
    },
    {
        "firstName": "Jon",
        "lastName": "Smith",
        "age": 35,
        "married": true,
        "birthDate": "02/01/1990"
    }
]
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

[http://demo3192753.mockable.io/api/person/joe](http://demo3192753.mockable.io/api/person/joe)

Verb: GET

Status code: 200

Response body:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
{
	"firstName":"Joe",
	"lastName": "Schmoe",
	"age": 25,
	"married": false,
	"birthDate": "01/01/1980"
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

[http://demo3192753.mockable.io/api/person/sally](http://demo3192753.mockable.io/api/person/sally)

Verb: GET

Status code: 404

Response body:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
No person exists with specified name.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

[http://demo3192753.mockable.io/api/person](http://demo3192753.mockable.io/api/person)

Verb: POST

Status code: 201

Response body:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Person creation success!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
