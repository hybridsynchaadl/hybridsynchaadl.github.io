---
layout: sttt
title: Artifact 
slug: sttt
---
<p>
This page explains the artifact for our paper: "Modeling and
Formal Analysis of Virtually Synchronous CPSs in AADL" by J. Lee, K. Bae, 
, P. C. Ölveczky, S. Kim, M, Kang. The artifact includes the HybridSynchAADL tool and the
scripts for running the experiments in the paper. Apart from providing
significantly more detail, this paper extends our conference tool paper. The
artifact used in conference tool paper can be found in this <a href="http://localhost:4000/artifact_cav2021">link</a>
</p>
<p>
A VirtualBox image for the artifact is available at
<a href="https://www.dropbox.com/sh/cmwun189of2ia77/AADskPa3wy4lGCh-W3fRei2Ia?dl=0">the dropbox link</a>. In the virtual machine, the artifact is
located in the directory <code>home/user/STTT-Artifact</code>. See <code>Readme.txt</code> in the
directory for more details about the tool and experiments.
</p>

<h2>Running the Artifact in a non-VM Environment</h2>
<p>
We explain how to install and run the artifact in a non-VM environment. The artifact requires the following libraries:
</p>

* JAVA 8: <a href="https://openjdk.java.net/install/">https://openjdk.java.net/install/</a>
* GNU parallel: <a href="https://www.gnu.org/software/parallel/">https://www.gnu.org/software/parallel/</a>
<p>
To install our artifact, download and unzip the following archive file which
contains the benchmark models and scripts in the directory <code>STTT-Artifact</code>: 
</p>
<p>
<a href="https://www.dropbox.com/sh/25amqjgaya42l7y/AADVen70E8CqHUBTSxDLhDDAa?dl=0">artifact.zip</a>
</p>

<p>
The archive file already contains the following tools. Maude-SE is needed for
the HybridSynchAADL tool, and the other tools are used for the experiments.
</p>

* Maude-SE: <a href="https://maude-se.github.io/">https://maude-se.github.io/</a>
* SpaceEx: <a href="http://spaceex.imag.fr/">http://spaceex.imag.fr/</a>
* Flow\*: <a href="https://flowstar.org/">https://flowstar.org/</a>
* HyComp: <a href="https://es-static.fbk.eu/tools/hycomp/">https://es-static.fbk.eu/tools/hycomp/</a>
* dReach: <a href="http://dreal.github.io/">http://dreal.github.io/</a>

<p>
For Ubuntu, we provide a script (<code>set-up.sh</code>) to install Java 8 and GNU
parallel, if not already installed.
</p>

<p>
The above instructions also apply when creating a new VM image. For example,
you can create a new VirtualBox image with Ubuntu installed,  unzip
<code>artifact.zip</code> on the virtual machine, and run <code>set-up.sh</code> in the directory
<code>STTT-Artifact</code> to install the required libraries for the artifact.
</p>


<h2>Setting up the HybridSynchAADL Tool</h2>
<p>
In the artifact, the HybridSynchAADL tool is located in the directory
<code>STTT-Artifact/hybridsynchaadl/osate</code>. For the workspace, use the directory
<code>STTT-Artifact/hybridsynchaadl/workspace</code>, which includes a HybridSynchAADL model
<code>FourDronesSystem</code>. You also need to set the Maude path: in the top menu, go to
<code>Window => Preferences => Maude Preferences</code>, and fill the Maude directory and
executable Maude file.
</p>



<figure>
<img src="images/workspace.png" width="80%" height="80%">
<figcaption style="font-size: 14px">Workspace</figcaption>
</figure>
<figure>
<img src="images/maude_preferences.png" width="80%" height="80%">
<figcaption style="font-size: 14px">Maude Preferences</figcaption>
</figure>

<br />
<br />