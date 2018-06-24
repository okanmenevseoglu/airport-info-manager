import {ApiRoute} from '../../shared/config/api-route';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {HttpClient} from '@angular/common/http';
import {AirportInformationQueryRequest} from '../../shared/request/airport-information-query-request';
import {AirportInformationQueryResponse} from '../../shared/response/airport-information-query-response';
import {AirportInformationReportResponse} from '../../shared/response/airport-information-report-response';

@Injectable()
export class AirportInformationManagementService {

  constructor(private httpClient: HttpClient) {
  }

  getAirportQueryInfo(airportInformationQueryRequest: AirportInformationQueryRequest): Observable<AirportInformationQueryResponse> {
    return this.httpClient.post<AirportInformationQueryResponse>(ApiRoute.getAirportQueryURL(), airportInformationQueryRequest);
  }

  getAirportReportInfo(): Observable<AirportInformationReportResponse> {
    return this.httpClient.get <AirportInformationReportResponse>(ApiRoute.getAirportReportURL());
  }
}
