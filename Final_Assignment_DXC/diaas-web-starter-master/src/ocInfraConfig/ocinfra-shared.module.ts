
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CustomComponent } from '../app/components/custom-component';

@NgModule({
    imports: [
        FormsModule,
        CommonModule
    ],
    declarations: [ CustomComponent],
    exports: [CustomComponent],
    providers: []
})
export class SharedModule {

}
