---
layout: artifact_cav2021
title: Artifact 
slug: artifact_cav2021
---
<p>
This page explains the artifact for our paper: "HYBRIDSYNCHAADL: Modeling and
Formal Analysis of Virtually Synchronous CPSs in AADL" by J. Lee, S. Kim, K.
Bae, and P. C. Ölveczky. The artifact consists of the HybridSynchAADL tool and 
scripts for the experiments. 
</p>
<p>
We provide the VM image which contains the artifact in this 
<a href="http://doi.org/10.5281/zenodo.4699760">link</a>. A minimum resource to
run the artifact is a Quad-Core CPU with 4GB memory. In the VM, the artifact is
located in the 'home/user/CAV2021-AeC' directory. See 'Readme.txt' in the
directory for more details about the tool and experiments.
</p>

<h2>Running the artifact in a non-VM environment</h2>
<p>
We explain how to install and run the artifact in a non-VM environment.
Download 'artifact.zip' in this <a href="https://tinyurl.com/cpsuef5h">link</a> 
and unzip the archive file. There is a directory 'CAV2021-AeC'. The directory
already contains the following software:
</p>

* Maude with SMT: https://maude-se.github.io/
* SpaceEx: http://spaceex.imag.fr/
* Flow\*: https://flowstar.org/
* HyComp: https://es-static.fbk.eu/tools/hycomp/
* dReach: http://dreal.github.io/

<p>
You can also install them manually by referring to the given official website.
In addition to the above software, you have to install the following software
to run the artifact:
</p>

* JAVA8: https://openjdk.java.net/install/ 
* GNU parallel: https://www.gnu.org/software/parallel/ 


<p>
There is the script 'set-up.sh' which automatically installs JAVA8 and GNU
parallel for Ubuntu. When your operating system is not Ubuntu, install them
manually. After successfully setting up the artifact, see 'Readme.txt' in
'CAV2021-AeC' to run the HybridSynchAADL tool and experiments.
</p>

<p>
The above instructions can be also applied to a VM environment. Create a
virtual machine running on Ubuntu. Download the artifact, and run the script
'set-up.sh'. The VM can reproduce our artifact results.
</p>


<h2>Setting up the HybridSynchAADL tool</h2>
The script 'set-up.sh' only sets up the artifact for running the
HybridSynchAADL tool and experiments. There are additional steps which sets a
workspace and preferences.


The HybridSynchAADL tool is located in the 'CAV2021-AeC/hybridsynchaadl'
directory. To run the tool, double click 'osate' in the directory. OSATE2
Launcher pops up to set the workspace. Set the workspace to
'CAV2021-AeC/hybridsynchaadl/workspace' which contains the case study project
'FourDronesSystem'.


In order to use Maude with SMT, you need to set configurations.  Open the
Preferences dialog by clicking 'Window/Preferences' in the top menu.  In the
preferences dialog, you can locate 'Maude Preferences' category on the
left-hand side of the dialog box. In the 'Maude Preferences' page, set the
Maude directory and executable Maude file. Click on the 'Apply and Close'
button to save and close the dialog box.
<br />
<br />
