import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RendererComponent } from '@diaas/ux-web';

const routes: Routes = [
    { path: 'screen/:screenId', component: RendererComponent },
    { path: '', redirectTo: 'screen/login', pathMatch: 'full' },
    { path: '**', redirectTo: 'screen/login', pathMatch: 'full' }
   
];

@NgModule({
    imports: [RouterModule.forRoot(routes, {useHash: true})],
    exports: [RouterModule]
})
export class AppRoutingModule {

}

export const routedComponents = [RendererComponent];
