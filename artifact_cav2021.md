---
layout: artifact_cav2021
title: Artifact 
slug: artifact_cav2021
---
<p>
This page shows the artifact for our paper: "HYBRIDSYNCHAADL: Modeling and
Formal Analysis of Virtually Synchronous CPSs in AADL" by J. Lee, S. Kim, K.
Bae, and P. C. Ölveczky. The artifact includes the HybridSynchAADL tool and the
scripts for running the experiments in the paper.
</p>
<p>
A VirtualBox image for the artifact is available at
http://doi.org/10.5281/zenodo.4699760.  In the virtual machine, the artifact is
located in the directory ‘home/user/CAV2021-AeC’. See 'Readme.txt' in the
directory for more details about the tool and experiments.
</p>

<h2>Running the artifact in a non-VM environment</h2>
<p>
We explain how to install and run the artifact in a non-VM environment. The artifact requires the following libraries:
</p>

* JAVA 8: https://openjdk.java.net/install/ 
* GNU parallel: https://www.gnu.org/software/parallel/ 
<p>
To install our artifact, download and unzip the following archive file which contains the benchmark models and scripts in the directory 'CAV2021-AeC': <a href="https://www.dropbox.com/sh/yqdb2vkkf2clhti/AACCsILskApL3s8MsBHN52sPa?dl=0">artifact.zip</a>
</p>

<p>
The archive file already contains the following tools. Maude-SE is needed for
the HybridSynchAADL tool, and the other tools are used for the experiments.
</p>

* Maude with SMT: https://maude-se.github.io/
* SpaceEx: http://spaceex.imag.fr/
* Flow\*: https://flowstar.org/
* HyComp: https://es-static.fbk.eu/tools/hycomp/
* dReach: http://dreal.github.io/

<p>
For Ubuntu, We provide the script  'set-up.sh' to install Java 8 and GNU
parallel, if not already installed.
</p>

<p>
The above instructions also apply when creating a new VM image. For example,
you can create a new VirtualBox image with Ubuntu installed,  unzip
'artifact.zip' on the virtual machine, and run ‘set-up.sh’ in the directory
'CAV2021-AeC' to install the required libraries for the artifact.
</p>


<h2>Setting up the HybridSynchAADL tool</h2>
<p>
In the artifact, the HybridSynchAADL tool is located in the directory
'CAV2021-AeC/hybridsynchaadl/osate'. For the workspace, use the directory
'CAV2021-AeC/hybridsynchaadl/workspace', which includes a HybridSynchAADL model
'FourDronesSystem'. You also need to set the Maude path: in the top menu, go to
'Window => Preferences => Maude Preferences', and fill the Maude directory and
executable Maude file.
</p>



<br />
<br />
