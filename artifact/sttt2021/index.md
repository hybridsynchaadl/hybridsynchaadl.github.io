---
layout: artifact
title: STTT 2021
slug: artifact/sttt2021/
---
<p>
This page explains the artifact for our paper: "Modeling and
Formal Analysis of Virtually Synchronous CPSs in AADL" by J. Lee, K. Bae, 
, P. C. Ölveczky, S. Kim, M, Kang. The artifact includes the HybridSynchAADL tool and the
scripts for running the experiments in the paper. Apart from providing
significantly more detail, this paper extends our conference tool paper. 
</p>


<h2>Formal semantics for HybridSynchAADL</h2>
<p>
We define the formal semantics of HybridSynchAADL using Maude with SMT solving.
HybridSynchAADL components are symbolically represented as Maude terms with SMT
constraints. We thoroughly tested the formal semantics and the generated
models. We developed a test suite for unit testing of the equations and rules
in the formal semantics, and a test suite for system testing of the code
generation and state merging. The test suites are located in
<code>semantics/test</code>
</p>
* <a href="https://www.dropbox.com/sh/hwgudlrux7s5usd/AADcdwf53rDsMWKbm-u8pczOa?dl=0">semantics.zip</a>

<h2>Benchmark Models</h2>
<p>
In the paper, we analyzed HybridSynchAADL models: networked watertank,
thermostat controllers, and rendezvous and formation control for distrubted
drones. For other tools(SpaceEx, Flowstar, HyComp, and dReach), we encoded the
synchronous designs of the HybridSynchAADL models as networks of hybrid
automata. 
</p>
* <a href="https://www.dropbox.com/sh/rlhsoac86q5atxt/AACXNGpaNIrQCGuZJl2LTZa7a?dl=0">models.zip</a>

<h2>HybridSynchAADL tool</h2>
<p>
To install our hybridsynchaadl tool, download and unzip the following archive files:
<a href="https://www.dropbox.com/sh/6e7gt8iqtm1clf5/AABumu-9VhTPSvEmMEHFCiAca?dl=0">tool.zip</a>
The artifact requires the following libraries:
</p>

* JAVA 11+: <a href="https://openjdk.java.net/install/">https://openjdk.java.net/install/</a>
* Maude-SE: <a href="https://maude-se.github.io/">https://maude-se.github.io/</a>

<p>
In the artifact, the HybridSynchAADL tool is located in the directory
<code>hybridsynchaadl/osate</code>. For the workspace, use the directory
<code>hybridsynchaadl/workspace</code>, which includes a HybridSynchAADL model
<code>FourDronesSystem</code>. You also need to set the Maude path: in the top menu, go to
<code>Window => Preferences => Maude Preferences</code>, and fill the Maude directory and
executable Maude file.
</p>

<figure>
<img src="../../images/maude_preferences.png" max-width="40%" height="auto">
<figcaption style="font-size: 14px">Maude Preferences</figcaption>
</figure>

<br />

<h2> Artifact </h2>
<p>
We provide the artifact to reproduce the results in our paper. The artifact
includes semantics, models, tools, scripts to automatically perform experiments
and Readme.txt.
</p>
* <a href="https://www.dropbox.com/sh/25amqjgaya42l7y/AADVen70E8CqHUBTSxDLhDDAa?dl=0">artifact</a>
