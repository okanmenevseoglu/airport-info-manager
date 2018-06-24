import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AirportInfoReportComponent } from './airport-info-report.component';

describe('AirportInfoReportComponent', () => {
  let component: AirportInfoReportComponent;
  let fixture: ComponentFixture<AirportInfoReportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AirportInfoReportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AirportInfoReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
