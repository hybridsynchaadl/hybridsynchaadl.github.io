---
layout: dronesingle
title: FourDronesSystem_Rendezvous
slug: /models/DroneSingle
---
This case study model represents the rendezvous control of distributed drones
moving in a 2D plane with single-integroator dynamics. Each drone communicates
its own position and sets the proper velocity which do not lead to collision to
other drones. 

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
invariant [safety] : ?initial ==> not(?collision) in time 500;

proposition [initial] : abs(dr1.env.x - 1.1) < 0.01 and abs(dr1.env.y - 1.5) < 0.01 and
 						abs(dr2.env.x + 1.5) < 0.01 and abs(dr2.env.y + 1.1) < 0.01 and
 						abs(dr3.env.x - 1.5) < 0.01 and abs(dr3.env.y - 1.1) < 0.01 and
 						abs(dr4.env.x + 1.1) < 0.01 and abs(dr4.env.y + 1.5) < 0.01; 

proposition [allClose] : abs(dr1.env.x - dr2.env.x) < 1.0 and abs(dr1.env.y - dr2.env.y) < 1.0 and
						 abs(dr1.env.x - dr3.env.x) < 1.0 and abs(dr1.env.y - dr3.env.y) < 1.0 and
						 abs(dr1.env.x - dr4.env.x) < 1.0 and abs(dr1.env.y - dr4.env.y) < 1.0 and
						 abs(dr2.env.x - dr3.env.x) < 1.0 and abs(dr2.env.y - dr3.env.y) < 1.0 and
						 abs(dr2.env.x - dr4.env.x) < 1.0 and abs(dr2.env.y - dr4.env.y) < 1.0 and
						 abs(dr3.env.x - dr4.env.x) < 1.0 and abs(dr3.env.y - dr4.env.y) < 1.0;
 						
proposition [collision] : (abs(dr1.env.x - dr2.env.x) < 0.1 and abs(dr1.env.y - dr2.env.y) < 0.1) or
						  (abs(dr1.env.x - dr3.env.x) < 0.1 and abs(dr1.env.y - dr3.env.y) < 0.1) or
						  (abs(dr1.env.x - dr4.env.x) < 0.1 and abs(dr1.env.y - dr4.env.y) < 0.1) or
						  (abs(dr2.env.x - dr3.env.x) < 0.1 and abs(dr2.env.y - dr3.env.y) < 0.1) or
						  (abs(dr2.env.x - dr4.env.x) < 0.1 and abs(dr2.env.y - dr4.env.y) < 0.1) or
						  (abs(dr3.env.x - dr4.env.x) < 0.1 and abs(dr3.env.y - dr4.env.y) < 0.1);
```

### Download
You can download the benchmark model: [FourDronesSystem.zip](../FourDronesSystem.zip)


<br />
<br />
