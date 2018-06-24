import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AirportInfoQueryComponent } from './airport-info-query.component';

describe('AirportInfoQueryComponent', () => {
  let component: AirportInfoQueryComponent;
  let fixture: ComponentFixture<AirportInfoQueryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AirportInfoQueryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AirportInfoQueryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
