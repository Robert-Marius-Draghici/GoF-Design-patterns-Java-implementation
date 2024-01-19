import abstractfactorymaze.AbstractFactoryMazeGame;
import abstractfactorymaze.MazeFactory;
import abstractfactorymaze.BombedMazeFactory;
import abstractfactorymaze.EnchantedMazeFactory;
import buildermaze.BuilderMazeGame;
import buildermaze.CountingMazeBuilder;
import buildermaze.StandardMazeBuilder;
import common.Maze;
import defaultmaze.DefaultMazeGame;
import factorymaze.BombedMazeGame;
import factorymaze.EnchantedMazeGame;
import factorymaze.FactoryMazeGame;

public class MazeTester {

    public static void main(String[] args) {
        System.out.println("Testing the default maze game");
        DefaultMazeGame defaultMazeGame = new DefaultMazeGame();
        Maze defaultMaze = defaultMazeGame.createMaze();
        System.out.println(defaultMaze.toString());

        System.out.println("=======================================================");
        System.out.println("Testing the Abstract Factory maze game");
        System.out.println("Creating a default maze");

        AbstractFactoryMazeGame abstractFactoryMazeGame = new AbstractFactoryMazeGame();
        MazeFactory defaultMazeFactory = new MazeFactory();
        Maze defaultAbstractFactoryMaze = abstractFactoryMazeGame.createMaze(defaultMazeFactory);
        System.out.println(defaultAbstractFactoryMaze.toString());

        System.out.println("Creating an enchanted maze");

        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        Maze enchantedAbstractFactoryMaze = abstractFactoryMazeGame.createMaze(enchantedMazeFactory);
        System.out.println(enchantedAbstractFactoryMaze.toString());

        System.out.println("Creating a bombed maze");

        MazeFactory bombedMazeFactory = new BombedMazeFactory();
        Maze bombedAbstractFactoryMaze = abstractFactoryMazeGame.createMaze(bombedMazeFactory);
        System.out.println(bombedAbstractFactoryMaze.toString());

        System.out.println("=======================================================");
        System.out.println("Testing the Builder maze game");
        System.out.println("Creating a default maze");

        Maze defaultBuilderMaze;
        BuilderMazeGame builderMazeGame = new BuilderMazeGame();
        StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();

        builderMazeGame.createMaze(standardMazeBuilder);
        defaultBuilderMaze = standardMazeBuilder.getMaze();
        System.out.println(defaultBuilderMaze);

        System.out.println("Creating a complex maze");

        builderMazeGame.createComplexMaze(standardMazeBuilder);
        Maze complexMaze = standardMazeBuilder.getMaze();
        System.out.println(complexMaze);

        System.out.println("Creating a counting maze");

        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        builderMazeGame.createMaze(countingMazeBuilder);
        countingMazeBuilder.getMaze();
        System.out.println("""
                The maze has %d rooms and %d doors""".formatted(countingMazeBuilder.getRoomCount(), countingMazeBuilder.getDoorsCount()));

        System.out.println("=======================================================");
        System.out.println("Testing the Factory maze game");
        System.out.println("Creating a default maze");

        FactoryMazeGame factoryMazeGame = new FactoryMazeGame();
        Maze defaultFactoryMaze = factoryMazeGame.createMaze();
        System.out.println(defaultFactoryMaze.toString());

        System.out.println("Creating a bombed maze");
        BombedMazeGame bombedMazeGame = new BombedMazeGame();
        Maze bombedFactoryMaze = bombedMazeGame.createMaze();
        System.out.println(bombedFactoryMaze.toString());

        System.out.println("Creating an enchanted maze");
        EnchantedMazeGame enchantedMazeGame = new EnchantedMazeGame();
        Maze enchantedFactoryMaze = enchantedMazeGame.createMaze();
        System.out.println(enchantedFactoryMaze.toString());
    }
}
