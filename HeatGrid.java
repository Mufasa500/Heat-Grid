public class HeatGrid {
    private int [][] grid;
    private String [][] sgrid;

    public HeatGrid(int height, int width) {
        grid = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = 0;
            }
        }
    }
    private int decayHeat(double decay, int heat, int distance) {
        return (int) (heat * Math.exp(-1 * decay * distance));
    }

    public boolean placeSource(String src, int x, int y) {
        int heat=0;
        int range=0;
        double decay=0;
        switch (src){
            case "l":
                heat = 1;
                range = 0;
                decay = 0.00;

                break;


            case "c":
                heat = 4;
                range = 2;
                decay = 0.50;


                break;


            case "f":
                heat = 10;
                range = 4;
                decay = 0.35;

                break;

            case "i":
                heat = -2;
                range = 1;
                decay = 0.50;

                break;

            case "r":
                heat = -8;
                range = 3;
                decay = 0.20;

                break;

            case "g":
                heat = -20;
                range = 5;
                decay = 0.15;

            }
        for (int i = x - range; i <= x + range; i++) {
            for (int j = y - range; j <= y + range; j++) {
                if (i>=0 && i<grid.length && j>=0 && j<grid[0].length)
                    grid[i][j] += decayHeat(decay, heat, Math.max(Math.abs(x - i), Math.abs(y - j)));

            }
        }
            return true;

            }

            public String toString() {
                String hi = "";
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        hi += grid[i][j] + " ";
                    }
                    hi += "\n";

                }
                return hi;
            }


                public int[][] getHeats(){
                    return grid;
                }

                public int getHeat(int x, int y) {
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid.length) {
                        return grid[x][y];
                    }
                    else {
                        return Integer.MAX_VALUE;
                    }
                }

                public int getNetHeat() {
                    int sum = 0;

                    for (int i = 0; i < grid.length; i++) {
                        for (int j = 0; j < grid.length; j++) {
                            sum += grid[i][j];
                        }
                    }
                    return sum;



    }public static void main(String[] args){
        HeatGrid sgrid= new HeatGrid(8,9);
        sgrid.placeSource("c",2,3 );
        sgrid.placeSource("i",2,6);
        sgrid.placeSource("r",7,8);
        System.out.println(sgrid);

    }

            }


