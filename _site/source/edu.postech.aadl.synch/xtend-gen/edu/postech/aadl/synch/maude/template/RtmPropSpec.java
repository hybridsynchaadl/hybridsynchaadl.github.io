package edu.postech.aadl.synch.maude.template;

import edu.postech.aadl.synch.maude.action.mode.Mode;
import edu.postech.aadl.synch.maude.action.mode.RandomMode;
import edu.postech.aadl.synch.maude.action.mode.SymbolicMode;
import edu.postech.aadl.synch.maude.template.RtmAadlIdentifier;
import edu.postech.aadl.synch.maude.template.RtmAadlProperty;
import edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression;
import edu.postech.aadl.xtext.propspec.propSpec.Invariant;
import edu.postech.aadl.xtext.propspec.propSpec.PSExpression;
import edu.postech.aadl.xtext.propspec.propSpec.PropRef;
import edu.postech.aadl.xtext.propspec.propSpec.Property;
import edu.postech.aadl.xtext.propspec.propSpec.Proposition;
import edu.postech.aadl.xtext.propspec.propSpec.Reachability;
import edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression;
import edu.postech.aadl.xtext.propspec.propSpec.Top;
import edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression;
import edu.postech.aadl.xtext.propspec.propSpec.Value;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PropertyValue;
import org.osate.ba.aadlba.BehaviorVariable;
import org.osate.ba.aadlba.ParameterHolder;

@SuppressWarnings("all")
public class RtmPropSpec {
  public static CharSequence compilePropertyCommand(final Top top, final Property prop, final String maudeDirPath, final Mode mode) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileLoadFiles = RtmPropSpec.compileLoadFiles(top, maudeDirPath, mode);
    _builder.append(_compileLoadFiles);
    _builder.newLineIfNotEmpty();
    _builder.append("mod TEST-");
    String _upperCase = top.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append(" is");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    CharSequence _compileIncludedModel = RtmPropSpec.compileIncludedModel(top, mode);
    _builder.append(_compileIncludedModel, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    CharSequence _compileIncludedAnalysisWay = RtmPropSpec.compileIncludedAnalysisWay(mode);
    _builder.append(_compileIncludedAnalysisWay, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("including SPECIFICATION-LANGUAGE-SEMANTICS .");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("op initState : -> Object .");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("eq initState = initialize(collapse(initial)) .");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("eq loopBoundNum = ");
    CharSequence _compileLoopBound = RtmPropSpec.compileLoopBound(mode);
    _builder.append(_compileLoopBound, "  ");
    _builder.append(" .");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("eq transBoundNum = ");
    CharSequence _compileTransBound = RtmPropSpec.compileTransBound(mode);
    _builder.append(_compileTransBound, "  ");
    _builder.append(" .");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    CharSequence _compileDefaultParam = RtmPropSpec.compileDefaultParam(mode);
    _builder.append(_compileDefaultParam, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    CharSequence _compileMerge = RtmPropSpec.compileMerge(top, mode);
    _builder.append(_compileMerge, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    CharSequence _compileProposition = RtmPropSpec.compileProposition(top);
    _builder.append(_compileProposition, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("endm");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    CharSequence _compileProperty = RtmPropSpec.compileProperty(top, prop, mode);
    _builder.append(_compileProperty);
    _builder.append("\t  ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("quit");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence compileLoadFiles(final Top top, final String maudeDirPath, final Mode mode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("load ");
    _builder.append(maudeDirPath);
    _builder.append("/prelude.maude");
    _builder.newLineIfNotEmpty();
    _builder.append("load ");
    _builder.append(maudeDirPath);
    _builder.append("/smt.maude");
    _builder.newLineIfNotEmpty();
    _builder.append("load ../semantics/");
    CharSequence _compileInterpreter = RtmPropSpec.compileInterpreter(mode);
    _builder.append(_compileInterpreter);
    _builder.newLineIfNotEmpty();
    _builder.append("load ../instance/");
    CharSequence _compileInstanceFile = RtmPropSpec.compileInstanceFile(top, mode);
    _builder.append(_compileInstanceFile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence compileInstanceFile(final Top top, final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      String _name = top.getName();
      _builder.append(_name);
      _builder.append(".maude");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = top.getName();
        _builder.append(_name);
        _builder.append("-symbolic.maude");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileIncludedModel(final Top top, final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("including ");
      String _upperCase = top.getName().toUpperCase();
      _builder.append(_upperCase);
      _builder.append("-MODEL .");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("including ");
        String _upperCase = top.getName().toUpperCase();
        _builder.append(_upperCase);
        _builder.append("-MODEL-SYMBOLIC .");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileIncludedAnalysisWay(final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("including RANDOMZIE-OBJECT . ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t\t   ");
      _builder.append("including RANDOM-SIMULATION .");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("including REACHABILITY-ANALYSIS .");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileInterpreter(final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interpreter-random.maude");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("interpreter-symbolic2-merge.maude");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileLoopBound(final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unbounded");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _loopBound = ((SymbolicMode)mode).getloopBound();
        _builder.append(_loopBound);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileTransBound(final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof RandomMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unbounded");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (mode instanceof SymbolicMode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _transBound = ((SymbolicMode)mode).gettransBound();
        _builder.append(_transBound);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileDefaultParam(final Mode mode) {
    CharSequence _xifexpression = null;
    if ((mode instanceof RandomMode)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("op minParam : -> PropSpec .");
      _builder.newLine();
      _builder.append("eq minParam = ParamCompRef | (c[ParamCompId] >= ");
      String _compileParamSign = RtmPropSpec.compileParamSign(((RandomMode)mode).getMinParamSignedValue());
      _builder.append(_compileParamSign);
      _builder.append("([[");
      float _minParamValue = ((RandomMode)mode).getMinParamValue();
      _builder.append(_minParamValue);
      _builder.append("]])) .");
      _builder.newLineIfNotEmpty();
      _builder.append("op maxParam : -> PropSpec .");
      _builder.newLine();
      _builder.append("eq maxParam = ParamCompRef | (c[ParamCompId] <= ");
      String _compileParamSign_1 = RtmPropSpec.compileParamSign(((RandomMode)mode).getMaxParamSignedValue());
      _builder.append(_compileParamSign_1);
      _builder.append("([[");
      float _maxParamValue = ((RandomMode)mode).getMaxParamValue();
      _builder.append(_maxParamValue);
      _builder.append("]])) .");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static String compileParamSign(final float value) {
    if ((value < 0)) {
      return "minus";
    }
    return "";
  }
  
  public static CharSequence compileMerge(final Top top, final Mode mode) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mode instanceof SymbolicMode) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("eq @m@ = [\'TEST-");
      String _upperCase = top.getName().toUpperCase();
      _builder.append(_upperCase);
      _builder.append("] .");
      _switchResult = _builder;
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  public static CharSequence compileProposition(final Top top) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Proposition> _proposition = top.getProposition();
      for(final Proposition prop : _proposition) {
        _builder.append("op ");
        String _name = prop.getName();
        _builder.append(_name);
        _builder.append(" : -> PropSpec .");
        _builder.newLineIfNotEmpty();
        _builder.append("eq ");
        String _name_1 = prop.getName();
        _builder.append(_name_1);
        _builder.append(" = ");
        CharSequence _compileExp = RtmPropSpec.compileExp(prop.getExpression());
        _builder.append(_compileExp);
        _builder.append(" .");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _compileProperty(final Top top, final Property prop, final SymbolicMode mode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("red reachAnalysis(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("initState,");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _compileInitConst = RtmPropSpec.compileInitConst(top, prop);
    _builder.append(_compileInitConst, "    ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _compileGoalConst = RtmPropSpec.compileGoalConst(top, prop);
    _builder.append(_compileGoalConst, "    ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    long _bound = prop.getBound();
    _builder.append(_bound, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append(") .");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _compileProperty(final Top top, final Property prop, final RandomMode mode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rew repeat({initState,");
    int _randomSeed = mode.getRandomSeed();
    _builder.append(_randomSeed);
    _builder.append("}, ");
    long _bound = prop.getBound();
    _builder.append(_bound);
    _builder.append(", (");
    CharSequence _compileInitConst = RtmPropSpec.compileInitConst(top, prop);
    _builder.append(_compileInitConst);
    _builder.append(" and (minParam and maxParam)), ");
    CharSequence _compileGoalConst = RtmPropSpec.compileGoalConst(top, prop);
    _builder.append(_compileGoalConst);
    _builder.append(") .");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence compileInitConst(final Top top, final Property pr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _escape = RtmAadlIdentifier.escape(top.getName());
    _builder.append(_escape);
    _builder.append(" | ");
    CharSequence _xifexpression = null;
    PSExpression _initCond = pr.getInitCond();
    boolean _tripleEquals = (_initCond == null);
    if (_tripleEquals) {
      _xifexpression = "[[true]]";
    } else {
      _xifexpression = RtmPropSpec.compileExp(pr.getInitCond());
    }
    _builder.append(_xifexpression);
    _builder.append(")");
    return _builder;
  }
  
  public static CharSequence compileGoalConst(final Top top, final Property pr) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (pr instanceof Invariant) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      String _escape = RtmAadlIdentifier.escape(top.getName());
      _builder.append(_escape);
      _builder.append(" | not(");
      CharSequence _compileExp = RtmPropSpec.compileExp(((Invariant)pr).getGoalCond());
      _builder.append(_compileExp);
      _builder.append(")");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (pr instanceof Reachability) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _escape = RtmAadlIdentifier.escape(top.getName());
        _builder.append(_escape);
        _builder.append(" | ");
        CharSequence _compileExp = RtmPropSpec.compileExp(((Reachability)pr).getGoalCond());
        _builder.append(_compileExp);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _switchResult = _builder;
    }
    return _switchResult;
  }
  
  /**
   * translate BA expressions
   */
  private static CharSequence _compileExp(final BinaryExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _compileExp = RtmPropSpec.compileExp(e.getLeft());
    _builder.append(_compileExp);
    _builder.append(" ");
    String _op = e.getOp();
    _builder.append(_op);
    _builder.append(" ");
    CharSequence _compileExp_1 = RtmPropSpec.compileExp(e.getRight());
    _builder.append(_compileExp_1);
    _builder.append(")");
    return _builder;
  }
  
  private static CharSequence _compileExp(final UnaryExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    String _translateUnaryOp = RtmPropSpec.translateUnaryOp(e.getOp());
    _builder.append(_translateUnaryOp);
    _builder.append("(");
    CharSequence _compileExp = RtmPropSpec.compileExp(e.getChild());
    _builder.append(_compileExp);
    _builder.append(")");
    return _builder;
  }
  
  private static CharSequence _compileExp(final ScopedExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _compileScopedPath = RtmPropSpec.compileScopedPath(e.getPath());
    _builder.append(_compileScopedPath);
    _builder.append(" | ( ");
    CharSequence _compileExp = RtmPropSpec.compileExp(e.getExpression());
    _builder.append(_compileExp);
    _builder.append(" ))");
    return _builder;
  }
  
  private static CharSequence _compileExp(final PropRef e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getDef().getName();
    _builder.append(_name);
    return _builder;
  }
  
  private static CharSequence _compileExp(final Value e) {
    CharSequence _xblockexpression = null;
    {
      Element v = e.getValue();
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (v instanceof ContainedNamedElement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        {
          int _length = ((Object[])Conversions.unwrapArray(((ContainedNamedElement)v).getContainmentPathElements(), Object.class)).length;
          boolean _greaterThan = (_length > 1);
          if (_greaterThan) {
            CharSequence _compilePath = RtmPropSpec.compilePath(((ContainedNamedElement)v));
            _builder.append(_compilePath);
            _builder.append(" | ");
          }
        }
        CharSequence _compilePrefix = RtmPropSpec.compilePrefix(IterableExtensions.<ContainmentPathElement>last(((ContainedNamedElement)v).getContainmentPathElements()).getNamedElement());
        _builder.append(_compilePrefix);
        _builder.append(" )");
        _switchResult = _builder;
      }
      if (!_matched) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        CharSequence _compilePropertyValue = RtmAadlProperty.compilePropertyValue(((PropertyValue) v));
        _builder.append(_compilePropertyValue);
        _builder.append("]]");
        _switchResult = _builder;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  private static CharSequence compilePrefix(final NamedElement ne) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (ne instanceof DataPort) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("f[");
      String _name = ((DataPort)ne).getName();
      _builder.append(_name);
      _builder.append("]");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (ne instanceof DataSubcomponent) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("c[");
        String _name = ((DataSubcomponent)ne).getName();
        _builder.append(_name);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ne instanceof BehaviorVariable) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("v[");
        String _name = ((BehaviorVariable)ne).getName();
        _builder.append(_name);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ne instanceof ParameterHolder) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("p[");
        String _name = ne.getName();
        _builder.append(_name);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  private static String translateUnaryOp(final String op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case "+":
          _switchResult = "plus";
          break;
        case "-":
          _switchResult = "minus";
          break;
        default:
          _switchResult = op;
          break;
      }
    } else {
      _switchResult = op;
    }
    return _switchResult;
  }
  
  private static CharSequence compilePath(final ContainedNamedElement path) {
    EList<ContainmentPathElement> _containmentPathElements = path.getContainmentPathElements();
    int _length = ((Object[])Conversions.unwrapArray(path.getContainmentPathElements(), Object.class)).length;
    int _minus = (_length - 1);
    final Function1<ContainmentPathElement, String> _function = (ContainmentPathElement it) -> {
      return RtmAadlIdentifier.escape(it.getNamedElement().getName());
    };
    return IterableExtensions.join(ListExtensions.<ContainmentPathElement, String>map(_containmentPathElements.subList(0, _minus), _function), " . ");
  }
  
  private static CharSequence compileScopedPath(final ContainedNamedElement path) {
    final Function1<ContainmentPathElement, String> _function = (ContainmentPathElement it) -> {
      return RtmAadlIdentifier.escape(it.getNamedElement().getName());
    };
    return IterableExtensions.join(ListExtensions.<ContainmentPathElement, String>map(path.getContainmentPathElements().subList(0, ((Object[])Conversions.unwrapArray(path.getContainmentPathElements(), Object.class)).length), _function), " . ");
  }
  
  public static CharSequence compileProperty(final Top top, final Property prop, final Mode mode) {
    if (mode instanceof RandomMode) {
      return _compileProperty(top, prop, (RandomMode)mode);
    } else if (mode instanceof SymbolicMode) {
      return _compileProperty(top, prop, (SymbolicMode)mode);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(top, prop, mode).toString());
    }
  }
  
  private static CharSequence compileExp(final PSExpression e) {
    if (e instanceof BinaryExpression) {
      return _compileExp((BinaryExpression)e);
    } else if (e instanceof PropRef) {
      return _compileExp((PropRef)e);
    } else if (e instanceof ScopedExpression) {
      return _compileExp((ScopedExpression)e);
    } else if (e instanceof UnaryExpression) {
      return _compileExp((UnaryExpression)e);
    } else if (e instanceof Value) {
      return _compileExp((Value)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
