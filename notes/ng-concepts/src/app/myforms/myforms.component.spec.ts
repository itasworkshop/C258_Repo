import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyformsComponent } from './myforms.component';

describe('MyformsComponent', () => {
  let component: MyformsComponent;
  let fixture: ComponentFixture<MyformsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyformsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyformsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
