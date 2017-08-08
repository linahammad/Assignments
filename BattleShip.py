# Import function to generate a random integer
from random import randint

# Create the playing board
board = []

for x in range(5):
  board.append(["O"] * 5)

def print_board(board):
  for row in board:
    print " ".join(row)

# Welcome and print the playing field
print "Let's play Battleship!"    
print_board(board)

def random_row(board):
  #generate a random list index (row) for the playing board
  return randint(0, len(board) - 1)

def random_col(board):
  #generate a random list index (column) for the playing board
  return randint(0, len(board[0]) - 1)

# Determine a random location for the ship in the game in reference to a playing board location
ship_row = random_row(board)
ship_col = random_col(board)

#for testing
#print ship_row 
#print ship_col

# Allow 4 turns or guesses as to the location of the ship
for turn in range(4):
    # Notify user of the current Turn
    print "Turn", turn + 1
    
    # Accept the user's input/guess data
    guess_row = int(raw_input("Guess Row:"))
    guess_col = int(raw_input("Guess Col:"))

        
    # If the guess is correct, indicate and end the game
    if guess_row == ship_row and guess_col == ship_col:
        print "Congratulations! You sunk my battleship!"
        break
    # Else the guess is incorrect: 
    else:
        # Check data validity - indicate the problem if out-of-limits guess,
        if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
            print "Oops, that's not even in the ocean."
        # Check if guess was already made at that location
        elif(board[guess_row][guess_col] == "X"):
            print "You guessed that one already."
        # Indicate a missed guess and print the board
        else:
            print "You missed my battleship!"
            board[guess_row][guess_col] = "X"
            print_board(board)

        # Check to see if the game is over
        if turn == 3:
            print "Game Over"

            