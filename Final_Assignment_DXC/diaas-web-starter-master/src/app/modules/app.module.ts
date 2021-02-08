import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { HttpModule } from "@angular/http";
import { BrowserModule } from "@angular/platform-browser";

import { AppComponent } from "../main/app.component";
import { SharedModule } from "../../../src/ocInfraConfig/ocinfra-shared.module";
import { AppRoutingModule } from "./app-routing.module";
import { ocInfraConfig } from "../../ocInfraConfig/ocinfra-config";
import { APP_BASE_HREF } from "@angular/common";
import { OcInfraModule, OcInfraWebModule } from "@diaas/ux-web";

@NgModule({
  declarations: [AppComponent],
  imports: [
    FormsModule,
    BrowserModule,
    HttpModule,
    OcInfraWebModule,
    OcInfraModule.forRoot(ocInfraConfig, SharedModule),
    AppRoutingModule
  ],
  providers: [
    {
      provide: APP_BASE_HREF,
      useValue: window["base-href"]
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
