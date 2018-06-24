import {Component, OnInit} from '@angular/core';
import {Message} from 'primeng/primeng';
import {FormBuilder, FormGroup} from '@angular/forms';
import {AirportInformationManagementService} from '../shared/airport-information-management.service';
import {AirportInformationQueryRequest} from '../../shared/request/airport-information-query-request';
import {AirportInformationQueryResponse} from '../../shared/response/airport-information-query-response';

@Component({
  selector: 'app-airport-info-query',
  templateUrl: './airport-info-query.component.html',
  styleUrls: ['./airport-info-query.component.css'],
  providers: [AirportInformationManagementService]
})
export class AirportInfoQueryComponent implements OnInit {

  msgs: Message[] = [];

  airportInfoQueryForm: FormGroup;

  airportInformationQueryResponse: AirportInformationQueryResponse;

  constructor(private airportInformationManagementService: AirportInformationManagementService, private formBuilder: FormBuilder) {
    this.airportInfoQueryForm = this.formBuilder.group({
      countryName: '',
      countryCode: ''
    });
  }

  public doGetAirportInfoQueryResult() {
    const airportInformationQueryRequest = new AirportInformationQueryRequest();
    airportInformationQueryRequest._countryName = this.airportInfoQueryForm.value['countryName'];
    airportInformationQueryRequest._countryCode = this.airportInfoQueryForm.value['countryCode'];

    this.airportInformationManagementService.getAirportQueryInfo(airportInformationQueryRequest).subscribe(data => {
      this.airportInformationQueryResponse = data;
    }, (error) => {
      this.clear();
      this.msgs.push({severity: 'error', summary: 'Error Message', detail: error.error});
    });
  }

  ngOnInit() {
    this.clear();
  }

  private clear(): void {
    this.msgs = [];
  }
}
