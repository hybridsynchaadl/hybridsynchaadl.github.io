---
layout: thermostat
title: Thermostat
slug: /models/Thermostat
---
This benchmark model represents the networked thermostat benchmark. Each
thermostat component communicates its own temperature to the neighboring
thermostat component and sets its power properly. The networked thermostats
eventually reach the same temperature.


### Continuous Dynamics
The continuous dynamics of the thermostat component is as follows:
<p align="center">
   <img src="../../images/thermostat_ode.png" alt="ode" width="50%" height="50%" >
</p>


### Safety Property

We verify safety invariant property which represents that temperature of each
thermostat is maintained between 20 and 50 degrees up to bound 500 ms. 

The example of PSPC file containing safety invariant property is as follows:
```
proposition [initial] : abs(env1.x - 41.2) < 0.1 and
						abs(env2.x - 49.4) < 0.1;
						
proposition [withinBound1] : 20.0 < env1.x and env1.x < 50.0;
proposition [withinBound2] : 20.0 < env2.x and env2.x < 50.0;


invariant [tb_500] : ?initial ==> ?withinBound1 and ?withinBound2 in time 500;
```

### Download
You can download the benchmark model: [Thermostat.zip](../Thermostat.zip)


<br />
<br />
