import {Routes} from '@angular/router';
import {RouterModule} from '@angular/router';
import {ModuleWithProviders} from '@angular/core';
import {AirportInfoQueryComponent} from './airport-information-management/airport-info-query/airport-info-query.component';
import {AirportInfoReportComponent} from './airport-information-management/airport-info-report/airport-info-report.component';

const appRoutes: Routes = [
  {path: '', component: AirportInfoQueryComponent, pathMatch: 'full'},
  {path: 'airport-report', component: AirportInfoReportComponent, pathMatch: 'full'},
];

export const appRoutingProviders: any[] = [];

export const RoutingModule: ModuleWithProviders = RouterModule.forRoot(appRoutes);
