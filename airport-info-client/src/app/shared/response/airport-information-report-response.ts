import {CountryWithAirportCountResponse} from './country-with-airport-count-response';
import {TypeOfRunwayByCountryResponse} from './type-of-runway-by-country-response';
import {RunwayIdentificationWithCountResponse} from './runway-identification-with-count-response';

export interface AirportInformationReportResponse {

  countriesWithHighestAirportCount: CountryWithAirportCountResponse[];

  countriesWithLowestAirportCount: CountryWithAirportCountResponse[];

  typeOfRunwaysByCountry: TypeOfRunwayByCountryResponse[];

  runwayIdentificationsWithCount: RunwayIdentificationWithCountResponse[];
}
