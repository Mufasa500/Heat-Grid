# Heat-Grid
The code above represents a HeatGrid class that can be used to simulate heat distribution across a grid. The class contains several methods including:

A constructor that takes in the height and width of the grid, creates the grid, and initializes each cell to 0.
A private method, decayHeat, that calculates the amount of heat that is lost based on the decay rate and the distance from the heat source.
A method, placeSource, that places a heat source on the grid. The method takes in the type of source (represented by a string), the x and y coordinates of the source, and calculates the amount of heat to add to each cell within the range of the source using the decayHeat method.
A method, toString, that returns a string representation of the grid.
A method, getHeats, that returns the entire grid.
A method, getHeat, that returns the amount of heat in a specific cell given its x and y coordinates.
A method, getNetHeat, that returns the sum of all the heat in the grid.
The code also contains a main method that creates a HeatGrid object, places several heat sources on the grid, and prints the resulting grid using the toString method.
