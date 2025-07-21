import random

print("Welcome to Guess Game")
print("Guess a number between (1-10)")
print("Are you ready?")

a = int(input("Enter the number: "))
b = random.randint(1, 10)

if a == b:
    print("!! You Guessed correct !!")
else:
    print("OOPS! You're wrong. The correct number was", b)
