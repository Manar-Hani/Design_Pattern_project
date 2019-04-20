# Design_pattern_project

#MVP:-
*Model:
In an application with a good layered architecture, 
this model would only be the gateway to the domain layer or business logic. 
See it as the provider of the data we want to display in the view. 
Model’s responsibilities include using APIs, caching data, managing databases and so on.
*View:
The View, usually implemented by an Activity, will contain a reference to the presenter. 
The only thing that the view will do is to call a method from the Presenter every time there is an interface action.
*Presenter:
The Presenter is responsible to act as the middle man between View and Model. 
It retrieves data from the Model and returns it formatted to the View. 
But unlike the typical MVC, it also decides what happens when you interact with the View.

#MVVP:-
*Model:
Represents the Data + State + Business logic. It is not tied to the view nor to the controller, 
which makes it reusable in many contexts.
*View:
Binds to observable variables and actions exposed by the View Model. 
It is possible for multiple views to bind to a single View Model.
*View Model:
Responsible for wrapping the model and preparing observable data needed by the view. 
It also provides hooks for the view to pass events to the model. 
An important thing to keep in mind is that the View Model is not tied to the view.
