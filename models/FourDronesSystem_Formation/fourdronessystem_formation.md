---
layout: dronesingle
title: FourDronesSystem_Formation 
slug: /models/DroneSingle
---
This benchmark model represents the formation control of
distributed drones moving in a 2D plane with single-integroator dynamics. Each
drone communicates its own position and sets the proper velocity which do not
lead to collision to other drones. 

### Continuous Dynamics
The continuous dynamics of the drone component is as follows:
<p align="center">
   <img src="../../images/dronesingle_ode.png" alt="ode" >
</p>



### Safety Property

We verify safety invariant property which represents that drones do not collide. We analyze them up to
bound 500 ms. 

The example of PSPC file containing safety invariant property is as follows:
```
proposition [initial] : abs(drone1.environment.x + 0.1) < 0.01 and abs(drone1.environment.y + 0.1) < 0.01 and
						abs(drone2.environment.x - 0.5) < 0.01 and abs(drone2.environment.y - 0.5) < 0.01 and
						abs(drone3.environment.x - 2.5) < 0.01 and abs(drone3.environment.y - 2.5) < 0.01 and
						abs(drone4.environment.x - 5.5) < 0.01 and abs(drone4.environment.y - 5.5) < 0.01 and
						abs(refDrone.env.x - 0.3) < 0.01       and abs(refDrone.env.y - 0.3) < 0.01;

proposition [collision] : (abs(drone1.environment.x-drone2.environment.x)<0.1 and abs(drone1.environment.y-drone2.environment.y)<0.1) or
						  (abs(drone1.environment.x-drone3.environment.x)<0.1 and abs(drone1.environment.y-drone3.environment.y)<0.1) or
						  (abs(drone1.environment.x-drone4.environment.x)<0.1 and abs(drone1.environment.y-drone4.environment.y)<0.1) or
						  (abs(drone2.environment.x-drone3.environment.x)<0.1 and abs(drone2.environment.y-drone3.environment.y)<0.1) or
						  (abs(drone2.environment.x-drone4.environment.x)<0.1 and abs(drone2.environment.y-drone4.environment.y)<0.1) or
						  (abs(drone3.environment.x-drone4.environment.x)<0.1 and abs(drone3.environment.y-drone4.environment.y)<0.1) ;

invariant [inv] : ?initial ==> not(?collision) in time 500;
```

### Download
You can download the benchmark model: [FourDronesSystem_Formation.zip](../FourDronesSystem_Formation.zip)


<br />
<br />
