---
layout: watertank
title: WaterTank
slug: /models/WaterTank
---
This benchmark model represents the networked watertank benchmark. Each
watertank communicates the amount of current water and drained water and sets
pump power properly. 

### Continuous Dynamics
The continuous dynamics of the watertank component is as follows:
<p align="center">
   <img src="../../images/watertank_ode.png" alt="ode" width="50%" height="50%">
</p>


### Safety Property

We verify safety invariant property which represents that watertank maintains
the current water larger than 30. We analyze them up to bound 500 ms. 

The example of PSPC file containing safety invariant property is as follows:
```
proposition [initial]: abs(env1.water - 55.0) < 0.1 and
					   abs(env2.water - 43.0) < 0.1;				   

proposition [upperBound] : env1.water >= 30 and 
						   env2.water >= 30;	

invariant [tb_500] : ?initial ==> ?upperBound in time 500;
```

### Download
You can download the benchmark model: [WaterTank.zip](../WaterTank.zip)


<br />
<br />
