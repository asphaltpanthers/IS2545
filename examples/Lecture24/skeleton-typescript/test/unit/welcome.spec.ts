import {Welcome} from '../../src/welcome'
import {HttpClient} from 'aurelia-fetch-client';

describe('the welcome page', () => {
    var sut;

    beforeEach(() => {
        var mockName = {
            "firstName": "James",
            "lastName": "Smith"
        };

        var http = new HttpClient();
        http.fetch = (url, i) => Promise.resolve({
            json: () => mockName
        });
        sut = new Welcome(http);
    });

    it('contains default values', () => {
        expect(sut.firstName).toEqual('John');
        expect(sut.lastName).toEqual('Doe');
        expect(sut.fullName).toEqual('John Doe');
    });

    it('editing first name changes full name', () => {
        sut.firstName = 'Dustin';
        expect(sut.fullName).toEqual('Dustin Doe');
    })

    it('clicking Submit with name equal to "Dustin Iser" disables submit button', () => {
        sut.firstName = 'Dustin'
        sut.lastName = 'Iser'
        sut.submit();
        expect(sut.disabled).toEqual(true);
    })

    it('clicking "Get Name from Service" sets first and last name', done => {
        sut.getNameFromService().then(() => {
            expect(sut.firstName).toEqual("James");
            expect(sut.lastName).toEqual("Smith");
            done();
        }).catch(e => {
            expect(e).toBeUndefined();
            done();
        });
    })
});