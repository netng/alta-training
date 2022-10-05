import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PassengersTableComponent } from './passengers-table.component';

describe('PassengersTableComponent', () => {
  let component: PassengersTableComponent;
  let fixture: ComponentFixture<PassengersTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PassengersTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PassengersTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
