# OO-Design: Airport Security Line

Q3:
  You are in charge of making the lines at airport security run smoothly. Every day thousands of people
  pass through security. There are 3 main types of people who go through this line: economy class
  passengers, VIP passengers, and flight staff. There is one line but some people have the ability to cut
  through. The system should allow VIPs and flight staff go straight to the scanners. They are rare
  occurrences and only appear 1 in every 100 people.
 
I did find it a little confusing as to how the problem wanted the passengers to be decided as a VIP, flight staff, or an economy class passenger. So for this iteration, I decided to assign a randomly generated priority upon instantiating a passenger. This made testing with unit tests impossible as I couldn't predict the correct priority. However, to make sure passengers were being properly added to the security line, I changed the probability of a "VIP or Staff" to be greater than 1/100. This way, I was able to generate VIPS and Staffs and check if they were "dequeuing" from the security line before the others.
