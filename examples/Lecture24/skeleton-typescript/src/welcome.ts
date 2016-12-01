// import {computedFrom} from 'aurelia-framework';
import {HttpClient} from 'aurelia-fetch-client';
import {autoinject} from 'aurelia-framework';

@autoinject
export class Welcome {
  public heading = 'Welcome to the Aurelia Navigation App!';
  public firstName = 'John';
  public lastName = 'Doe';
  public disabled = false;
  private previousValue = this.fullName;

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  // Getters can't be directly observed, so they must be dirty checked.
  // However, if you tell Aurelia the dependencies, it no longer needs to dirty check the property.
  // To optimize by declaring the properties that this getter is computed from, uncomment the line below
  // as well as the corresponding import above.
  // @computedFrom('firstName', 'lastName')
  get fullName() {
    return `${this.firstName} ${this.lastName}`;
  }

  public submit() {
    this.previousValue = this.fullName;

    if (this.previousValue == 'Dustin Iser') {
      this.disabled = true;
    }

    alert(`Welcome, ${this.fullName}!`);
  }

  public canDeactivate() {
    if (this.fullName !== this.previousValue) {
      return confirm('Are you sure you want to leave?');
    }
  }

  public getNameFromService() {
    return this.http.fetch("http://awesome-service.com/api/name")
      .then(response => response.json())
      .then(response => {
        this.firstName = response.firstName;
        this.lastName = response.lastName;
      });
  }
}

export class UpperValueConverter {
  public toView(value) {
    return value && value.toUpperCase();
  }
}
