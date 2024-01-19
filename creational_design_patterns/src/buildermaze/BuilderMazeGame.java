package buildermaze;

import common.Maze;

public class BuilderMazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.buildMaze();

        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1, 2);

        return mazeBuilder.getMaze();
    }

    public Maze createComplexMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.buildMaze();

        for (int i = 1; i < 100; i++) {
            mazeBuilder.buildRoom(i);
            mazeBuilder.buildRoom(i + 1);
            mazeBuilder.buildDoor(i, i + 1);
        }

        return mazeBuilder.getMaze();
    }
}
