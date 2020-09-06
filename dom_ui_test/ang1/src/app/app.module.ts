import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from '.c:/Users/D.Amuro/Documents/git/CAF_Angular_prj_repository/dom_ui_test/ang1/src/home/home.component';

@NgModule({
   declarations: [
      AppComponent,
      HomeComponent
   ],
   imports: [
      BrowserModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
