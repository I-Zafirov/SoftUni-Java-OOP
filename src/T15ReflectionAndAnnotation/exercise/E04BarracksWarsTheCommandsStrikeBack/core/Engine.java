package T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core;

import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.Executable;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.CommandInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {

    private final CommandInterpreter commandInterpreter;

    public Engine(CommandInterpreter commandInterpreter) {
        this.commandInterpreter = commandInterpreter;
    }

    @Override
    public void run() {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                final String input = reader.readLine();

                final String[] data = input.split("\\s+");

                final Executable executable = this.commandInterpreter.interpretCommand(data);

                final String result = executable.execute();

                if (result.equals("fight")) {
                    break;
                }

                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

