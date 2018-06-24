export class ApiRoute {

  private static baseEndPoint = 'http://localhost:8080/';

  static getAirportQueryURL(): string {
    return this.baseEndPoint + 'airport-information/query';
  }

  static getAirportReportURL(): string {
    return this.baseEndPoint + 'airport-information/report';
  }
}
