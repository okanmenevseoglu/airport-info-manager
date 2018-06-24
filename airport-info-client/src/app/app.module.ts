import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {AirportInfoQueryComponent} from './airport-information-management/airport-info-query/airport-info-query.component';
import {GrowlModule} from 'primeng/growl';
import {AirportInfoReportComponent} from './airport-information-management/airport-info-report/airport-info-report.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule} from '@angular/router';
import {appRoutingProviders, RoutingModule} from './app.routing';
import {PanelModule} from 'primeng/panel';
import {TableModule} from 'primeng/table';
import {HashLocationStrategy, LocationStrategy} from '@angular/common';


@NgModule({
  declarations: [
    AppComponent,
    AirportInfoReportComponent,
    AirportInfoQueryComponent
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule,
    RoutingModule,
    PanelModule,
    TableModule,
    GrowlModule
  ],
  providers: [appRoutingProviders,
    {
      provide: LocationStrategy,
      useClass: HashLocationStrategy
    }],
  bootstrap: [AppComponent]
})
export class AppModule {
}
