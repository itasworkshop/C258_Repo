import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentAlertsComponent } from './student-alerts.component';

describe('StudentAlertsComponent', () => {
  let component: StudentAlertsComponent;
  let fixture: ComponentFixture<StudentAlertsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentAlertsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentAlertsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
