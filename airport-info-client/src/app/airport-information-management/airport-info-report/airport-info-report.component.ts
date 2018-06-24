import {Component, OnInit} from '@angular/core';
import {Message} from 'primeng/primeng';
import {AirportInformationManagementService} from '../shared/airport-information-management.service';
import {AirportInformationReportResponse} from '../../shared/response/airport-information-report-response';

@Component({
  selector: 'app-airport-info-report',
  templateUrl: './airport-info-report.component.html',
  styleUrls: ['./airport-info-report.component.css'],
  providers: [AirportInformationManagementService]
})
export class AirportInfoReportComponent implements OnInit {

  msgs: Message[] = [];

  airportInformationReportResponse: AirportInformationReportResponse;

  constructor(private airportInformationManagementService: AirportInformationManagementService) {
  }

  public doGetAirportInfoReport(): void {
    this.airportInformationManagementService.getAirportReportInfo().subscribe(data => {
      this.airportInformationReportResponse = data;
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
