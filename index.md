---
layout: home
---
<p>
 <b>HybridSynchAADL</b> tool contains a sublanguage of the avionics modeling standard AADL for modeling such designs in AADL and formal analysis tool for virtually synchronous cyber-physical systems with complex control programs, continuous behaviors, and bounded clock skews, network delays, and execution times.
</p>
<p>
 <b>HybridSynchAADL</b> leverage the Hybrid PALS equivalence, so that it is sufficient to model and verify the simpler underlying synchronous designs. 
</p>
<p>
 <b>HybridSynchAADL</b> models are given a formal semantics and analyzed using Maude with SMT solving, which allows users to represent advanced control programs and communication features in Maude, while capturing timing uncertainties and continuous behaviors symbolically with SMT solving. 
</p>

## Example
Three example FourDroneSystem.aadl, Environment.aadl, and FourDronesSystem_impl_Instance2.pspc in FourDronesSystem_Two_Dim benchmark are as follows:

FourDronesSystem.aadl
```
package FourDronesSystem
public
    with Drone;
    with Hybrid_SynchAADL;
   	with Data_Model;

    system FourDronesSystem
    end FourDronesSystem;

    system implementation FourDronesSystem.impl
        subcomponents
            dr1: system Drone::Drone.rend;
            dr2: system Drone::Drone.rend;
            dr3: system Drone::Drone.rend;
            dr4: system Drone::Drone.rend;
        connections
            C1: port dr1.oX -> dr2.iX;
            C2: port dr1.oY -> dr2.iY;
            C3: port dr2.oX -> dr3.iX;
            C4: port dr2.oY -> dr3.iY;
            C5: port dr3.oX -> dr4.iX;
            C6: port dr3.oY -> dr4.iY;
            C7: port dr4.oX -> dr1.iX;
            C8: port dr4.oY -> dr1.iY;
        properties
            Hybrid_SynchAADL::Synchronous => true;
            Period => 100ms;
            Hybrid_SynchAADL::Max_Clock_Deviation => 10ms;
            Timing => Delayed applies to C1, C2, C3, C4, C5, C6, C7, C8;
                Data_Model::Initial_Value => ("0.0") applies to
                    dr1.oX, dr2.oX, dr3.oX, dr4.oX,
                    dr1.oY, dr2.oY, dr3.oY, dr4.oY;
    end FourDronesSystem.impl;
end FourDronesSystem;
```

Environment.aadl
```
package Environment
public
    with Hybrid_SynchAADL;    
    with Base_Types;
    with Data_Model;
    
system Environment
    features
        currX : out data port Base_Types::Float;
        currY : out data port Base_Types::Float;
        velX : in data port Base_Types::Float;
        velY : in data port Base_Types::Float;
    properties
        Hybrid_SynchAADL::isEnvironment => true;
end Environment;

system implementation Environment.impl
    subcomponents
        x : data Base_Types::Float;
        y : data Base_Types::Float; 
        vx : data Base_Types::Float;
        vy : data Base_Types::Float;
	connections
        C1: port x -> currX;
        C2: port y -> currY;   
        C3: port velX -> vx;
        C4: port velY -> vy;
	properties
		Hybrid_SynchAADL::ContinuousDynamics =>
        	 "x(t) = 0.001 * vx * t + x(0); y(t) = 0.001 * vy * t + y(0);";
        Data_Model::Initial_Value => ("param") applies to x, y, vx, vy;
 end Environment.impl;
end Environment;
```

FourDronesSystem_impl_Instance2.pspc
```
name: FourDronesSystem_impl_Instance;
model: FourDronesSystem::FourDronesSystem.impl;
instance: "/FourDronesExample_Two_Dim/package/instances/FourDroneSystem_FourDronesSystem_impl_Instance.aaxl2";

invariant [safety]:
	?p1 and ?p2 and ?p3 and ?p4 and
	?v1 and ?v2 and ?v3 and ?v4
==> not (?c12 or ?c13 or ?c14 or ?c23 or ?c24 or ?c34) in time 300;

reachability [rendezvous]:
	?p1 and ?p2 and ?p3 and ?p4 and
	?v1 and ?v2 and ?v3 and ?v4
==> (?r12 and ?r13 and ?r14 and ?r23 and ?r24 and ?r34) in time 300;

proposition [c12]: abs(dr1.env.x - dr2.env.x) < 0.05 and abs(dr1.env.y - dr2.env.y) < 0.05;
proposition [c13]: abs(dr1.env.x - dr3.env.x) < 0.05 and abs(dr1.env.y - dr3.env.y) < 0.05;
proposition [c14]: abs(dr1.env.x - dr4.env.x) < 0.05 and abs(dr1.env.y - dr4.env.y) < 0.05;
proposition [c23]: abs(dr2.env.x - dr3.env.x) < 0.05 and abs(dr2.env.y - dr3.env.y) < 0.05;
proposition [c24]: abs(dr2.env.x - dr4.env.x) < 0.05 and abs(dr2.env.y - dr4.env.y) < 0.05;
proposition [c34]: abs(dr3.env.x - dr4.env.x) < 0.05 and abs(dr3.env.y - dr4.env.y) < 0.05;

proposition [r12]: abs(dr1.env.x - dr2.env.x) < 1 and abs(dr1.env.y - dr2.env.y) < 1;
proposition [r13]: abs(dr1.env.x - dr3.env.x) < 1 and abs(dr1.env.y - dr3.env.y) < 1;
proposition [r14]: abs(dr1.env.x - dr4.env.x) < 1 and abs(dr1.env.y - dr4.env.y) < 1;
proposition [r23]: abs(dr2.env.x - dr3.env.x) < 1 and abs(dr2.env.y - dr3.env.y) < 1;
proposition [r24]: abs(dr2.env.x - dr4.env.x) < 1 and abs(dr2.env.y - dr4.env.y) < 1;
proposition [r34]: abs(dr3.env.x - dr4.env.x) < 1 and abs(dr3.env.y - dr4.env.y) < 1;

proposition [p1] : abs(dr1.env.x - 0.0) < 0.1 and abs(dr1.env.y - 0.0) < 0.1;
proposition [p2] : abs(dr2.env.x - 1.5) < 0.1 and abs(dr2.env.y - 0.0) < 0.1;
proposition [p3] : abs(dr3.env.x - 1.5) < 0.1 and abs(dr3.env.y - 1.5) < 0.1;
proposition [p4] : abs(dr4.env.x - 0.0) < 0.1 and abs(dr4.env.y - 1.5) < 0.1;

proposition [v1] : abs(dr1.env.vx) <= 0.01 and abs(dr1.env.vy) <= 0.01;
proposition [v2] : abs(dr2.env.vx) <= 0.01 and abs(dr2.env.vy) <= 0.01;
proposition [v3] : abs(dr3.env.vx) <= 0.01 and abs(dr3.env.vy) <= 0.01;
proposition [v4] : abs(dr4.env.vx) <= 0.01 and abs(dr4.env.vy) <= 0.01;
```


## Tool Interface
![tool_interface](assets/img/tool_interface.png?raw=true)
