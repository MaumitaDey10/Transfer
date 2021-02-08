# FWK2 archetype application

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.6.1.

## Download and Instalation 

Run  `git clone https://github.dxc.com/insurance/omnichannel-starter.git` and once it has been cloned Run  `npm install` for installing dependencies

## Moving among branches

Once you have clones the repository in your local, you can position youself in any of the branches corresponding with the different training sessions. Follow these steps:

*  git fetch remote (Where remote points to insurance repository)
*  git checkout *theNameOfTheBranchYouWant* 
*  npm install rimraf (Only necessary if it's the first time you are moving from master to other branch)
*  rimraf node_modules
*  npm cache clean --force
*  npm install  

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
