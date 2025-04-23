/*
 * Class: CMSC203 
 * Instructor: Vahabzadeh Monshi, Khandan 
 * Description: property, plot, and management company 
 * Due: 4/22/2025
 * Platform/compiler: eclipse 
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ben Adams
*/
public class Plot {
    private int x, y, width, depth;  // Coordinates and dimensions of the plot

    //Constructors
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // compares plots
    public boolean encompasses(Plot plot) {
        return this.x <= plot.x && 
               this.y <= plot.y && 
               (this.x + this.width) >= (plot.x + plot.width) && 
               (this.y + this.depth) >= (plot.y + plot.depth);
    }


    public boolean overlaps(Plot plot) {
    	//compares all possible points
        for (int i = this.x; i < this.x + this.width; i++) {
            for (int j = this.y; j < this.y + this.depth; j++) {
                for (int k = plot.x; k < plot.x + plot.width; k++) {
                    for (int l = plot.y; l < plot.y + plot.depth; l++) {
                        if (i == k && j == l) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;  //default 
    }

    // toString
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
