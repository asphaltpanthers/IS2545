import {Welcome} from '../../src/welcome'

describe('the welcome page', () => {
    var sut;

    beforeEach(() => {
        sut = new Welcome();
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
});