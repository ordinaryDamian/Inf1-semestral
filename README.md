# Inf1-semestral

This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:

PROJECT TITLE: Tetris

PURPOSE OF PROJECT: Game

VERSION: 0.1

DATE: 13.11.2023

HOW TO START THIS PROJECT: -

AUTHORS: Damián Nadžady

USER INSTRUCTIONS: -

 Semestral work for Inf1, made for BlueJ 4.2.2

## Semestralka pre Informatika 1
 Yes, you can create a Tetris game using a single JFrame and multiple JPanel components. One JPanel can be used for the game board, another for the menu, and another for the options. You can use a CardLayout to switch between these panels.

Here's a high-level outline of how you could approach this:

    1.Create a JFrame and set its layout to a CardLayout.
    Vytvorti JFrame v inej classe a potom ho volat do main
    2.Create three JPanel components: one for the game board (Grid panel ?), one for the menu (2 button pre zapametanie score a citanie skore, nacitane skore na konzolu), and one for score(panel so score).
    3.Add the game board panel to the frame using the add() method and specify the CardLayout constraint.
    4.Add the menu panel and options panel to the frame using the add() method and specify the CardLayout constraint.
    5.In the game board panel, use a 2D array to represent the Tetris board and draw it using the paintComponent() method. Pridat key listener pre listening na klavesach
    6.Implement the Tetris game logic using separate classes for the different game pieces and a game manager class to handle their movements.
    7.Use a timer to control the game's speed.
    8.Create a user interface for the menu and options panels.
    9.Add listeners to the menu and options panels to handle user interactions, such as starting a new game, pausing, resuming, and quitting.

Please note that creating a complete Tetris game would be too complex for this platform. The provided information is intended to serve as a starting point for your exploration..

Class aplikacia by mala vytvorit instanciu class Frame, Buttons, ScoreBoard a PlayingField
Frame je celkovy frame okolo viac menej okno
Buttons sa sklada z tlacitek Write score, Read scores, Reset game
Scoreboard by malo zobrazovat score
Playing field by malo byt to kde sa deje magic