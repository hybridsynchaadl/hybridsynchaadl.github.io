package edu.postech.aadl.synch.maude.template;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.SetMultimap;
import edu.postech.aadl.synch.maude.contspec.ContFunc;
import edu.postech.aadl.synch.maude.contspec.ContSpec;
import edu.postech.aadl.synch.maude.contspec.ContSpecItem;
import edu.postech.aadl.synch.maude.template.RtmAadlBehaviorLanguage;
import edu.postech.aadl.synch.maude.template.RtmAadlIdentifier;
import edu.postech.aadl.synch.maude.template.RtmAadlProperty;
import edu.postech.aadl.synch.maude.template.RtmAadlSetting;
import edu.postech.aadl.utils.PropertyUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.ConnectedElement;
import org.osate.aadl2.Connection;
import org.osate.aadl2.Context;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.Mode;
import org.osate.aadl2.ModeTransitionTrigger;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.ParameterConnection;
import org.osate.aadl2.Port;
import org.osate.aadl2.PortConnection;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.StringLiteral;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.ConnectionInstanceEnd;
import org.osate.aadl2.instance.ConnectionReference;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.ModeInstance;
import org.osate.aadl2.instance.ModeTransitionInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.ba.aadlba.BehaviorAnnex;
import org.osate.ba.aadlba.BehaviorState;
import org.osate.ba.aadlba.BehaviorTransition;
import org.osate.ba.aadlba.BehaviorVariable;
import org.osate.ba.aadlba.BehaviorVariableHolder;
import org.osate.ba.aadlba.ValueVariable;

@SuppressWarnings("all")
public class RtmAadlModel extends RtmAadlIdentifier {
  private final RtmAadlBehaviorLanguage bc;
  
  private final RtmAadlProperty pc;
  
  private final IProgressMonitor monitor;
  
  private final HashMultimap<ComponentInstance, ConnectionReference> conxTable = HashMultimap.<ComponentInstance, ConnectionReference>create();
  
  public RtmAadlModel(final IProgressMonitor pm, final AnalysisErrorReporterManager errMgr, final SetMultimap<String, String> opTable) {
    super(errMgr, opTable);
    this.monitor = pm;
    RtmAadlBehaviorLanguage _rtmAadlBehaviorLanguage = new RtmAadlBehaviorLanguage(errMgr, opTable);
    this.bc = _rtmAadlBehaviorLanguage;
    RtmAadlProperty _rtmAadlProperty = new RtmAadlProperty(errMgr, opTable);
    this.pc = _rtmAadlProperty;
  }
  
  public CharSequence doGenerate(final SystemInstance model) {
    CharSequence _xblockexpression = null;
    {
      final CharSequence initialState = this.compileComponent(model);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("mod ");
      String _upperCase = model.getName().toUpperCase();
      _builder.append(_upperCase);
      _builder.append("-MODEL is");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("including MODEL-TRANSITION-SYSTEM .");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("--- AADL identifiers");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _generateIds = this.generateIds();
      _builder.append(_generateIds, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("--- the initial state");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op initial : -> Object .");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("eq initial = ");
      _builder.append(initialState, "\t");
      _builder.append(" .");
      _builder.newLineIfNotEmpty();
      _builder.append("endm");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence doGenerateForSymbolic(final SystemInstance model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("load ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append(".maude");
    _builder.newLineIfNotEmpty();
    _builder.append("mod ");
    String _upperCase = model.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("-MODEL-SYMBOLIC is");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("including ");
    String _upperCase_1 = model.getName().toUpperCase();
    _builder.append(_upperCase_1, "\t");
    _builder.append("-MODEL .");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("including BEHAVIOR-SYMBOLIC-LOCATION .");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateLocConst = this.generateLocConst();
    _builder.append(_generateLocConst, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateLocName = this.generateLocName();
    _builder.append(_generateLocName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("endm");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLocConst() {
    StringConcatenation _builder = new StringConcatenation();
    int idx = 0;
    _builder.newLineIfNotEmpty();
    {
      Set<String> _idsOfType = this.getIdsOfType("Location");
      for(final String name : _idsOfType) {
        _builder.append("eq ");
        _builder.append(name);
        _builder.append(" = loc(real(");
        int _plusPlus = idx++;
        _builder.append(_plusPlus);
        _builder.append(")) .");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("eq @@default@loc@@ = loc(real(");
    int _plusPlus_1 = idx++;
    _builder.append(_plusPlus_1);
    _builder.append(")) .");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateLocName() {
    StringConcatenation _builder = new StringConcatenation();
    int idx = 0;
    _builder.newLineIfNotEmpty();
    {
      Set<String> _idsOfType = this.getIdsOfType("Location");
      for(final String name : _idsOfType) {
        _builder.append("eq locName(loc([(");
        int _plusPlus = idx++;
        _builder.append(_plusPlus);
        _builder.append("/1).Real])) = \'");
        _builder.append(name);
        _builder.append(" .");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("eq locName(loc([(");
    int _plusPlus_1 = idx++;
    _builder.append(_plusPlus_1);
    _builder.append("/1).Real])) = \'@@default@loc@@ .");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence compileComponent(final ComponentInstance o) {
    String _xifexpression = null;
    boolean _isCanceled = this.monitor.isCanceled();
    if (_isCanceled) {
      throw new OperationCanceledException();
    } else {
      String _xblockexpression = null;
      {
        Iterable<DefaultAnnexSubclause> _filter = Iterables.<DefaultAnnexSubclause>filter(o.getComponentClassifier().getOwnedAnnexSubclauses(), DefaultAnnexSubclause.class);
        final Procedure1<Iterable<DefaultAnnexSubclause>> _function = (Iterable<DefaultAnnexSubclause> it) -> {
          String _name = o.getCategory().getName();
          String _plus = ("No behavior annex definition in thread: " + _name);
          String _plus_1 = (_plus + " ");
          String _name_1 = o.getName();
          String _plus_2 = (_plus_1 + _name_1);
          this.check(o, ((!RtmAadlSetting.behavioral(o)) || (!IterableExtensions.isEmpty(it))), _plus_2);
        };
        final Iterable<DefaultAnnexSubclause> anxSub = ObjectExtensions.<Iterable<DefaultAnnexSubclause>>operator_doubleArrow(_filter, _function);
        BehaviorAnnex _xifexpression_1 = null;
        if ((RtmAadlSetting.behavioral(o) && (!IterableExtensions.isEmpty(anxSub)))) {
          AnnexSubclause _parsedAnnexSubclause = (((DefaultAnnexSubclause[])Conversions.unwrapArray(anxSub, DefaultAnnexSubclause.class))[0]).getParsedAnnexSubclause();
          _xifexpression_1 = ((BehaviorAnnex) _parsedAnnexSubclause);
        }
        final BehaviorAnnex behAnx = _xifexpression_1;
        final Consumer<ConnectionInstance> _function_1 = (ConnectionInstance it) -> {
          final Consumer<ConnectionReference> _function_2 = (ConnectionReference it_1) -> {
            this.conxTable.put(it_1.getContext(), it_1);
          };
          it.getConnectionReferences().forEach(_function_2);
        };
        o.getConnectionInstances().forEach(_function_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("< ");
        String _id = this.id(o, "ComponentId");
        _builder.append(_id);
        _builder.append(" : ");
        String _compClass = RtmAadlSetting.compClass(o);
        _builder.append(_compClass);
        _builder.append(" |");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("features : (");
        _builder.newLine();
        _builder.append("\t\t");
        final Function1<FeatureInstance, CharSequence> _function_2 = (FeatureInstance it) -> {
          return this.compileFeature(it);
        };
        CharSequence _join = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<FeatureInstance, CharSequence>map(o.getFeatureInstances(), _function_2)), "\n", "none");
        _builder.append(_join, "\t\t");
        _builder.append("),");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("subcomponents : (");
        _builder.newLine();
        _builder.append("\t\t");
        final Function1<ComponentInstance, Boolean> _function_3 = (ComponentInstance it) -> {
          return Boolean.valueOf(RtmAadlSetting.isSync(it));
        };
        final Function1<ComponentInstance, CharSequence> _function_4 = (ComponentInstance it) -> {
          return this.compileComponent(it);
        };
        CharSequence _join_1 = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(IterableExtensions.<ComponentInstance, CharSequence>map(IterableExtensions.<ComponentInstance>filter(o.getComponentInstances(), _function_3), _function_4)), "\n", "none");
        _builder.append(_join_1, "\t\t");
        _builder.append("),");
        _builder.newLineIfNotEmpty();
        {
          boolean _isData = RtmAadlSetting.isData(o);
          if (_isData) {
            _builder.append("\t");
            _builder.append("value : ");
            String _compileValue = this.compileValue(o);
            _builder.append(_compileValue, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((RtmAadlSetting.behavioral(o) && (!(behAnx == null)))) {
            _builder.append("\t");
            _builder.append("currState : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<BehaviorState, Boolean> _function_5 = (BehaviorState it) -> {
              return Boolean.valueOf(it.isInitial());
            };
            String _id_1 = this.id(((BehaviorState[])Conversions.unwrapArray(IterableExtensions.<BehaviorState>filter(behAnx.getStates(), _function_5), BehaviorState.class))[0], "Location");
            _builder.append(_id_1, "\t\t");
            _builder.append("),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("completeStates : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<BehaviorState, Boolean> _function_6 = (BehaviorState it) -> {
              return Boolean.valueOf(it.isComplete());
            };
            final Function1<BehaviorState, String> _function_7 = (BehaviorState it) -> {
              return this.id(it, "Location");
            };
            CharSequence _join_2 = RtmAadlIdentifier.join(IterableExtensions.<BehaviorState, String>map(IterableExtensions.<BehaviorState>filter(behAnx.getStates(), _function_6), _function_7), " ", "empty");
            _builder.append(_join_2, "\t\t");
            _builder.append("),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("variables : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<BehaviorVariable, CharSequence> _function_8 = (BehaviorVariable it) -> {
              return this.compileVariables(it);
            };
            CharSequence _join_3 = RtmAadlIdentifier.join(ListExtensions.<BehaviorVariable, CharSequence>map(behAnx.getVariables(), _function_8), " ; ", "empty");
            _builder.append(_join_3, "\t\t");
            _builder.append("),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("transitions : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<BehaviorTransition, CharSequence> _function_9 = (BehaviorTransition it) -> {
              return this.bc.compileTransition(it);
            };
            CharSequence _join_4 = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<BehaviorTransition, CharSequence>map(behAnx.getTransitions(), _function_9)), " ;\n", "empty");
            _builder.append(_join_4, "\t\t");
            _builder.append("),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("loopBound : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("loopBoundNum),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("transBound : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("transBoundNum),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("varGen : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("< \"");
            String _compileVarGenName = this.compileVarGenName(o);
            _builder.append(_compileVarGenName, "\t\t");
            _builder.append("\" >");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
          }
        }
        {
          boolean _isEnv = RtmAadlSetting.isEnv(o);
          if (_isEnv) {
            _builder.append("\t");
            _builder.append("currMode : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            String _compileCurrentMode = this.compileCurrentMode(o.getModeInstances());
            _builder.append(_compileCurrentMode, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("jumps : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<ModeTransitionInstance, CharSequence> _function_10 = (ModeTransitionInstance it) -> {
              return this.compileJumps(it);
            };
            CharSequence _join_5 = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<ModeTransitionInstance, CharSequence>map(o.getModeTransitionInstances(), _function_10)), " ;\n", "empty");
            _builder.append(_join_5, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("flows : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<ModalPropertyValue, String> _function_11 = (ModalPropertyValue it) -> {
              return this.compileFlows(it, o);
            };
            CharSequence _join_6 = RtmAadlIdentifier.join(IterableExtensions.<String>filterNull(ListExtensions.<ModalPropertyValue, String>map(this.compileModalPropertyValue(o), _function_11)), " ;\n", "empty");
            _builder.append(_join_6, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("sampling : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<ComponentInstance, String> _function_12 = (ComponentInstance it) -> {
              return this.compileSamplingTime(it);
            };
            CharSequence _join_7 = RtmAadlIdentifier.join(IterableExtensions.<String>filterNull(IterableExtensions.<ComponentInstance, String>map(this.compileTargetInstances(o), _function_12)), " ,\n", "empty");
            _builder.append(_join_7, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("response : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            final Function1<ComponentInstance, String> _function_13 = (ComponentInstance it) -> {
              return this.compileResponseTime(it);
            };
            CharSequence _join_8 = RtmAadlIdentifier.join(IterableExtensions.<String>filterNull(IterableExtensions.<ComponentInstance, String>map(this.compileTargetInstances(o), _function_13)), " ,\n", "empty");
            _builder.append(_join_8, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("varGen : (");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("< \"");
            String _compileVarGenName_1 = this.compileVarGenName(o);
            _builder.append(_compileVarGenName_1, "\t\t");
            _builder.append("\" >");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("),");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("properties : (");
        _builder.newLine();
        _builder.append("\t\t");
        final Function1<PropertyAssociation, CharSequence> _function_14 = (PropertyAssociation it) -> {
          return this.compilePropertyAssociation(it, o);
        };
        CharSequence _join_9 = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<PropertyAssociation, CharSequence>map(o.getOwnedPropertyAssociations(), _function_14)), " ;\n", "none");
        _builder.append(_join_9, "\t\t");
        _builder.append("),");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("connections : (");
        _builder.newLine();
        _builder.append("\t\t");
        final Function1<ConnectionReference, CharSequence> _function_15 = (ConnectionReference it) -> {
          return this.compileConnection(it, o);
        };
        CharSequence _join_10 = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(IterableExtensions.<ConnectionReference, CharSequence>map(this.conxTable.get(o), _function_15)), " ;\n", "empty");
        _builder.append(_join_10, "\t\t");
        _builder.append(") ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("> ");
        final Procedure1<String> _function_16 = (String it) -> {
          this.monitor.worked(1);
        };
        _xblockexpression = ObjectExtensions.<String>operator_doubleArrow(_builder.toString(), _function_16);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private CharSequence compileFeature(final FeatureInstance fi) {
    CharSequence _switchResult = null;
    Feature _feature = fi.getFeature();
    boolean _matched = false;
    if (_feature instanceof Port) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("< ");
      String _id = this.id(fi.getFeature(), "FeatureId");
      _builder.append(_id);
      _builder.append(" : ");
      CharSequence _compilePortType = this.compilePortType(fi);
      _builder.append(_compilePortType);
      _builder.append(" | ");
      _builder.newLineIfNotEmpty();
      {
        boolean _isEnvContainer = this.isEnvContainer(fi);
        if (_isEnvContainer) {
          _builder.append("\t");
          CharSequence _compileEnvFeatureAttrs = this.compileEnvFeatureAttrs(fi);
          _builder.append(_compileEnvFeatureAttrs, "\t");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          CharSequence _compileDataFeatureAttrs = this.compileDataFeatureAttrs(fi);
          _builder.append(_compileDataFeatureAttrs, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("content : ");
      String _compileOutFeature = this.compileOutFeature(fi);
      _builder.append(_compileOutFeature, "\t");
      _builder.append(" ,");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("properties : ");
      final Function1<PropertyAssociation, CharSequence> _function = (PropertyAssociation it) -> {
        return this.compilePropertyAssociation(it, fi);
      };
      CharSequence _join = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<PropertyAssociation, CharSequence>map(fi.getOwnedPropertyAssociations(), _function)), " ;\n", "none");
      _builder.append(_join, "\t");
      _builder.append(" >");
      _switchResult = _builder;
    }
    if (!_matched) {
      final Procedure1<CharSequence> _function = (CharSequence it) -> {
        String _name = fi.getCategory().getName();
        String _plus = ("Unsupported feature: " + _name);
        String _plus_1 = (_plus + " ");
        String _name_1 = fi.getName();
        String _plus_2 = (_plus_1 + _name_1);
        this.check(fi, false, _plus_2);
      };
      _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(
        null, _function);
    }
    return _switchResult;
  }
  
  private boolean isEnvContainer(final FeatureInstance fi) {
    return RtmAadlSetting.isEnv(fi.getContainingComponentInstance());
  }
  
  private CharSequence compileDataFeatureAttrs(final FeatureInstance fi) {
    CharSequence _switchResult = null;
    Feature _feature = fi.getFeature();
    DirectionType _direction = ((Port) _feature).getDirection();
    if (_direction != null) {
      switch (_direction) {
        case IN:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("cache : null(Real),");
          _switchResult = _builder;
          break;
        case OUT:
          StringConcatenation _builder_1 = new StringConcatenation();
          _switchResult = _builder_1;
          break;
        default:
          final Procedure1<CharSequence> _function = (CharSequence it) -> {
            String _name = fi.getCategory().getName();
            String _plus = ("Unsupported feature: " + _name);
            String _plus_1 = (_plus + " ");
            String _name_1 = fi.getName();
            String _plus_2 = (_plus_1 + _name_1);
            this.check(fi, false, _plus_2);
          };
          _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(
            null, _function);
          break;
      }
    } else {
      final Procedure1<CharSequence> _function = (CharSequence it) -> {
        String _name = fi.getCategory().getName();
        String _plus = ("Unsupported feature: " + _name);
        String _plus_1 = (_plus + " ");
        String _name_1 = fi.getName();
        String _plus_2 = (_plus_1 + _name_1);
        this.check(fi, false, _plus_2);
      };
      _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(
        null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence compileEnvFeatureAttrs(final FeatureInstance fi) {
    CharSequence _xblockexpression = null;
    {
      ComponentInstance co = fi.getContainingComponentInstance();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target : ");
      String _compileTarget = this.compileTarget(fi, co);
      _builder.append(_compileTarget);
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("envCache : ");
      String _compileOutFeature = this.compileOutFeature(fi);
      _builder.append(_compileOutFeature);
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private String compileTarget(final FeatureInstance fi, final ComponentInstance ci) {
    String _xblockexpression = null;
    {
      EList<ConnectionInstance> _allEnclosingConnectionInstances = ci.getAllEnclosingConnectionInstances();
      for (final ConnectionInstance conn : _allEnclosingConnectionInstances) {
        if ((fi.getDirection().incoming() && PropertyUtil.getSrcComponent(conn).equals(ci))) {
          return PropertyUtil.getDstComponent(conn).getName();
        } else {
          if ((fi.getDirection().outgoing() && PropertyUtil.getDstComponent(conn).equals(ci))) {
            return PropertyUtil.getSrcComponent(conn).getName();
          }
        }
      }
      final Procedure1<String> _function = (String it) -> {
        String _name = ci.getCategory().getName();
        String _plus = ("Unknown target: " + _name);
        String _plus_1 = (_plus + " ");
        String _name_1 = ci.getName();
        String _plus_2 = (_plus_1 + _name_1);
        this.check(ci, false, _plus_2);
      };
      _xblockexpression = ObjectExtensions.<String>operator_doubleArrow(
        null, _function);
    }
    return _xblockexpression;
  }
  
  private String compileOutFeature(final FeatureInstance fi) {
    String _switchResult = null;
    FeatureCategory _category = fi.getCategory();
    if (_category != null) {
      switch (_category) {
        case DATA_PORT:
          _switchResult = "null(Real)";
          break;
        case EVENT_DATA_PORT:
          _switchResult = "null(Real)";
          break;
        case EVENT_PORT:
          _switchResult = "null(Unit)";
          break;
        default:
          final Procedure1<String> _function = (String it) -> {
            String _name = fi.getCategory().name();
            String _plus = ("Unsupported feature: " + _name);
            String _plus_1 = (_plus + " ");
            String _name_1 = fi.getName();
            String _plus_2 = (_plus_1 + _name_1);
            this.check(fi, false, _plus_2);
          };
          _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
          break;
      }
    } else {
      final Procedure1<String> _function = (String it) -> {
        String _name = fi.getCategory().name();
        String _plus = ("Unsupported feature: " + _name);
        String _plus_1 = (_plus + " ");
        String _name_1 = fi.getName();
        String _plus_2 = (_plus_1 + _name_1);
        this.check(fi, false, _plus_2);
      };
      _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence compilePortType(final FeatureInstance fi) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _isEnv = RtmAadlSetting.isEnv(fi.getContainingComponentInstance());
    if (_isEnv) {
      _xifexpression = "Env";
    } else {
      _xifexpression = "Data";
    }
    _builder.append(_xifexpression);
    Feature _feature = fi.getFeature();
    CharSequence _compileDirection = this.compileDirection(((Port) _feature).getDirection(), fi);
    _builder.append(_compileDirection);
    _builder.append("Port");
    return _builder;
  }
  
  private CharSequence compileDirection(final DirectionType type, final FeatureInstance o) {
    CharSequence _xblockexpression = null;
    {
      boolean _not = (!(type.incoming() && type.outgoing()));
      this.check(o, _not, "\'in out\' features are not supported");
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _incoming = type.incoming();
        if (_incoming) {
          _builder.append("In");
        }
      }
      {
        boolean _outgoing = type.outgoing();
        if (_outgoing) {
          _builder.append("Out");
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private String compileValue(final ComponentInstance o) {
    String _switchResult = null;
    String _name = o.getSubcomponent().getSubcomponentType().getName();
    if (_name != null) {
      switch (_name) {
        case "Float":
          String _xifexpression = null;
          boolean _isParameterized = PropertyUtil.isParameterized(o);
          if (_isParameterized) {
            _xifexpression = "param(Real)";
          } else {
            _xifexpression = "null(Real)";
          }
          _switchResult = _xifexpression;
          break;
        case "Real":
          String _xifexpression_1 = null;
          boolean _isParameterized_1 = PropertyUtil.isParameterized(o);
          if (_isParameterized_1) {
            _xifexpression_1 = "param(Real)";
          } else {
            _xifexpression_1 = "null(Real)";
          }
          _switchResult = _xifexpression_1;
          break;
        case "Boolean":
          String _xifexpression_2 = null;
          boolean _isParameterized_2 = PropertyUtil.isParameterized(o);
          if (_isParameterized_2) {
            _xifexpression_2 = "param(Boolean)";
          } else {
            _xifexpression_2 = "null(Boolean)";
          }
          _switchResult = _xifexpression_2;
          break;
        default:
          final Procedure1<String> _function = (String it) -> {
            String _name_1 = o.getCategory().name();
            String _plus = ("Unsupported data type: " + _name_1);
            String _plus_1 = (_plus + " ");
            String _name_2 = o.getName();
            String _plus_2 = (_plus_1 + _name_2);
            this.check(o, false, _plus_2);
          };
          _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
          break;
      }
    } else {
      final Procedure1<String> _function = (String it) -> {
        String _name_1 = o.getCategory().name();
        String _plus = ("Unsupported data type: " + _name_1);
        String _plus_1 = (_plus + " ");
        String _name_2 = o.getName();
        String _plus_2 = (_plus_1 + _name_2);
        this.check(o, false, _plus_2);
      };
      _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence compileVariables(final BehaviorVariable bv) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("( ");
    String _id = this.id(bv, "VarId");
    _builder.append(_id);
    _builder.append(" : Real )");
    return _builder;
  }
  
  private String compileVarGenName(final ComponentInstance o) {
    ComponentInstance _containingComponentInstance = o.getContainingComponentInstance();
    boolean _tripleEquals = (_containingComponentInstance == null);
    if (_tripleEquals) {
      return RtmAadlIdentifier.escape(o.getName());
    }
    Object _compileVarGenName = this.compileVarGenName(o.getContainingComponentInstance());
    String _plus = (_compileVarGenName + ".");
    String _escape = RtmAadlIdentifier.escape(o.getName());
    return (_plus + _escape);
  }
  
  private String compileCurrentMode(final EList<ModeInstance> mi) {
    final Consumer<ModeInstance> _function = (ModeInstance element) -> {
      this.id(element.getName(), "Location");
    };
    mi.forEach(_function);
    boolean _isEmpty = mi.isEmpty();
    if (_isEmpty) {
      return "@@default@loc@@";
    }
    for (final ModeInstance value : mi) {
      boolean _isInitial = value.isInitial();
      boolean _equals = (_isInitial == true);
      if (_equals) {
        return RtmAadlIdentifier.escape(value.getName());
      }
    }
    return RtmAadlIdentifier.escape(mi.get(0).getName());
  }
  
  private CharSequence compileJumps(final ModeTransitionInstance mti) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _escape = RtmAadlIdentifier.escape(mti.getSource().getName());
    _builder.append(_escape);
    _builder.append(" -[ (");
    final Function1<ModeTransitionTrigger, String> _function = (ModeTransitionTrigger it) -> {
      return RtmAadlIdentifier.escape(it.getTriggerPort().getName());
    };
    CharSequence _join = RtmAadlIdentifier.join(IterableExtensions.<String>filterNull(ListExtensions.<ModeTransitionTrigger, String>map(mti.getModeTransition().getOwnedTriggers(), _function)), " , ", "[[true]]");
    _builder.append(_join);
    _builder.append(") ]-> ");
    String _escape_1 = RtmAadlIdentifier.escape(mti.getDestination().getName());
    _builder.append(_escape_1);
    _builder.append(")");
    return _builder;
  }
  
  private EList<ModalPropertyValue> compileModalPropertyValue(final ComponentInstance o) {
    EList<PropertyAssociation> _ownedPropertyAssociations = o.getOwnedPropertyAssociations();
    for (final PropertyAssociation pa : _ownedPropertyAssociations) {
      boolean _contains = pa.getProperty().qualifiedName().contains(PropertyUtil.CONTINUOUSDYNAMICS);
      if (_contains) {
        return pa.getOwnedValues();
      }
    }
    return null;
  }
  
  private String compileFlows(final ModalPropertyValue mpv, final ComponentInstance o) {
    String mode = this.compileMode(o, mpv);
    PropertyExpression _ownedValue = mpv.getOwnedValue();
    String expr = ((StringLiteral) _ownedValue).getValue();
    ContSpec spec = ContSpec.parse(expr, o);
    List<ContSpecItem> _items = spec.getItems();
    for (final ContSpecItem item : _items) {
      if ((item instanceof ContFunc)) {
        ValueVariable _param = ((ContFunc)item).getParam();
        this.id(((BehaviorVariableHolder) _param).getBehaviorVariable().getName(), "VarId");
      }
    }
    String _escape = RtmAadlIdentifier.escape(mode);
    String _plus = ("((" + _escape);
    String _plus_1 = (_plus + ")");
    String _plus_2 = (_plus_1 + "[");
    CharSequence _compileContSpec = this.bc.compileContSpec(spec);
    String _plus_3 = (_plus_2 + _compileContSpec);
    return (_plus_3 + " ] )");
  }
  
  private String compileMode(final ComponentInstance o, final ModalPropertyValue mpv) {
    boolean _isEmpty = mpv.getInModes().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Mode> _inModes = mpv.getInModes();
      for (final Mode mode : _inModes) {
        String[] _split = mode.toString().split("#");
        for (final String name : _split) {
          {
            if (((!PropertyUtil.isTopComponent(o.getContainingComponentInstance())) && name.contains(((o.getContainingComponentInstance().getName() + ".") + o.getName())))) {
              return IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(name.split("\\."))));
            }
            if ((PropertyUtil.isTopComponent(o.getContainingComponentInstance()) && name.contains(o.getName()))) {
              return IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(name.split("\\."))));
            }
          }
        }
      }
    } else {
      return "@@default@loc@@";
    }
    return null;
  }
  
  private HashSet<ComponentInstance> compileTargetInstances(final ComponentInstance ci) {
    HashSet<ComponentInstance> targetInstances = new HashSet<ComponentInstance>();
    EList<ConnectionInstance> _allEnclosingConnectionInstances = ci.getAllEnclosingConnectionInstances();
    for (final ConnectionInstance conn : _allEnclosingConnectionInstances) {
      boolean _equals = PropertyUtil.getSrcComponent(conn).equals(ci);
      if (_equals) {
        targetInstances.add(PropertyUtil.getDstComponent(conn));
      }
    }
    return targetInstances;
  }
  
  private String compileSamplingTime(final ComponentInstance o) {
    String _name = o.getName();
    String _plus = ("(" + _name);
    String value = (_plus + " : (");
    EList<PropertyAssociation> _ownedPropertyAssociations = o.getOwnedPropertyAssociations();
    for (final PropertyAssociation p : _ownedPropertyAssociations) {
      boolean _contains = p.getProperty().getName().contains(PropertyUtil.SAMPLING_TIME);
      if (_contains) {
        String time = this.pc.compilePropertyValue(p.getProperty(), o).toString();
        String _value = value;
        String _get = time.split(" ")[0];
        String _plus_1 = ("rat(" + _get);
        String _plus_2 = (_plus_1 + "),rat(");
        String _get_1 = time.split(" ")[2];
        String _plus_3 = (_plus_2 + _get_1);
        String _plus_4 = (_plus_3 + ")))");
        return value = (_value + _plus_4);
      }
    }
    return null;
  }
  
  private String compileResponseTime(final ComponentInstance o) {
    String _name = o.getName();
    String _plus = ("(" + _name);
    String value = (_plus + " : (");
    EList<PropertyAssociation> _ownedPropertyAssociations = o.getOwnedPropertyAssociations();
    for (final PropertyAssociation p : _ownedPropertyAssociations) {
      boolean _equals = p.getProperty().getName().equals(PropertyUtil.RESPONSE_TIME);
      if (_equals) {
        String time = this.pc.compilePropertyValue(p.getProperty(), o).toString();
        String _value = value;
        String _get = time.split(" ")[0];
        String _plus_1 = ("rat(" + _get);
        String _plus_2 = (_plus_1 + "),rat(");
        String _get_1 = time.split(" ")[2];
        String _plus_3 = (_plus_2 + _get_1);
        String _plus_4 = (_plus_3 + ")))");
        return value = (_value + _plus_4);
      }
    }
    return null;
  }
  
  private CharSequence compileConnection(final ConnectionReference cr, final ComponentInstance ci) {
    CharSequence _xblockexpression = null;
    {
      Connection _connection = cr.getConnection();
      final Procedure1<Connection> _function = (Connection it) -> {
        this.check(cr, ((it instanceof PortConnection) || (it instanceof ParameterConnection)), "Unsupported connection type");
      };
      final Connection c = ObjectExtensions.<Connection>operator_doubleArrow(_connection, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      CharSequence _compileConnectionEndName = this.compileConnectionEndName(c.getSource(), cr);
      _builder.append(_compileConnectionEndName);
      _builder.append(" ");
      CharSequence _compileConnectionArrow = this.compileConnectionArrow(cr, ci);
      _builder.append(_compileConnectionArrow);
      _builder.append(" ");
      CharSequence _compileConnectionEndName_1 = this.compileConnectionEndName(c.getDestination(), cr);
      _builder.append(_compileConnectionEndName_1);
      _builder.append(")");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compileConnectionArrow(final ConnectionReference cr, final ComponentInstance ci) {
    CharSequence _xifexpression = null;
    boolean _isEnv = RtmAadlSetting.isEnv(ci);
    if (_isEnv) {
      StringConcatenation _builder = new StringConcatenation();
      {
        ConnectionInstanceEnd _destination = cr.getDestination();
        if ((_destination instanceof ComponentInstance)) {
          _builder.append("=>>");
        } else {
          _builder.append("==>");
        }
      }
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("-->");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence compileConnectionEndName(final ConnectedElement end, final ConnectionReference o) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (end instanceof ConnectedElement) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      {
        Context _context = end.getContext();
        boolean _tripleNotEquals = (_context != null);
        if (_tripleNotEquals) {
          String _escape = RtmAadlIdentifier.escape(end.getContext().getName());
          _builder.append(_escape);
          _builder.append(" .. ");
        }
      }
      String _escape_1 = RtmAadlIdentifier.escape(end.getConnectionEnd().getName());
      _builder.append(_escape_1);
      _switchResult = _builder;
    }
    if (!_matched) {
      final Procedure1<CharSequence> _function = (CharSequence it) -> {
        this.check(o, false, "Unsupported connection end");
      };
      _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(
        null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence compilePropertyAssociation(final PropertyAssociation p, final NamedElement ne) {
    CharSequence _xblockexpression = null;
    {
      final CharSequence value = this.pc.compilePropertyValue(p.getProperty(), ne);
      CharSequence _xifexpression = null;
      if (((value != null) && (!value.equals("param")))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _escape = RtmAadlIdentifier.escape(p.getProperty().qualifiedName());
        _builder.append(_escape);
        _builder.append(" => {{");
        String _replace = value.toString().replace("\n", "");
        _builder.append(_replace);
        _builder.append("}})");
        _xifexpression = _builder;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String compileInitialValue(final NamedElement ne, final String none) {
    String _xblockexpression = null;
    {
      final String iv = PropertyUtil.getSynchStringProp(ne, PropertyUtil.DATA_MODEL, PropertyUtil.INITIAL_VALUE, null);
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(iv);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _xifexpression = (("[[" + iv) + "]]");
      } else {
        _xifexpression = none;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
