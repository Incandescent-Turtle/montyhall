import random

stay = 0
switch = 0
times_ran = 10_000_000
for i in range(times_ran):
    doors = [0,0,0]
    doors[int(random.random()*3)] = 1
    choice = int(random.random()*3)
    revealed = -1
    while True:
        revealed = int(random.random()*3)
        if not (revealed == choice or doors[revealed] == 1):
            break
    stay = stay + doors[choice]
    switch = switch + doors[3 - choice - revealed]
    
print('staying:', stay/times_ran*100, '%')
print('switching:', switch/times_ran*100, '%')
print('Ran', "{:,}".format(times_ran), 'times')
      
      
                 
            
            
