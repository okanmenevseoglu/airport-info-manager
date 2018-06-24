export class AirportInformationQueryRequest {

  private countryCode: string;

  private countryName: string;


  get _countryCode(): string {
    return this.countryCode;
  }

  set _countryCode(value: string) {
    this.countryCode = value;
  }

  get _countryName(): string {
    return this.countryName;
  }

  set _countryName(value: string) {
    this.countryName = value;
  }
}
