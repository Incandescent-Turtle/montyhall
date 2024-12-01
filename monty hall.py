import random

stay = 0
switch = 0
times_ran = 10_000_000
for i in range(times_ran):
    # 0 is donkey/goat, 1 is car
    doors = [0,0,0]
    # putting car behind a random door
    doors[int(random.random()*3)] = 1
    # this simulates your initial choice
    choice = int(random.random()*3)
    # this picks the door that is revealed. in this case it can be any unchosen door.
    revealed = -1
    while True:
        revealed = int(random.random()*3)
        if not (revealed == choice):
            break
    # adds one if your first door was a car
    stay += doors[choice]
    # adds the score of the non-chosen, non-revealed door
    switch += doors[3 - choice - revealed]
    
print('staying:', stay/times_ran*100, '%')
print('switching:', switch/times_ran*100, '%')
print('Ran', "{:,}".format(times_ran), 'times')
      
      
                 
            
            
