package edu.postech.aadl.synch.maude.template;

import com.google.common.collect.SetMultimap;
import edu.postech.aadl.synch.maude.template.RtmAadlIdentifier;
import edu.postech.aadl.utils.PropertyUtil;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.NumberValue;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertyValue;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.StringLiteral;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

@SuppressWarnings("all")
public class RtmAadlProperty extends RtmAadlIdentifier {
  public RtmAadlProperty(final AnalysisErrorReporterManager errMgr, final SetMultimap<String, String> opTable) {
    super(errMgr, opTable);
  }
  
  public CharSequence compilePropertyValue(final Property pr, final NamedElement ne) {
    CharSequence _switchResult = null;
    EObject _eContainer = pr.eContainer();
    String _name = ((NamedElement) _eContainer).getName();
    if (_name != null) {
      switch (_name) {
        case PropertyUtil.DATA_MODEL:
          _switchResult = this.compileDataModelPropertyValue(pr, ne);
          break;
        default:
          _switchResult = this.compileDefaultPropertyValue(pr, ne);
          break;
      }
    } else {
      _switchResult = this.compileDefaultPropertyValue(pr, ne);
    }
    return _switchResult;
  }
  
  public String compileDataModelPropertyValue(final Property pr, final NamedElement ne) {
    String _switchResult = null;
    String _name = pr.getName();
    if (_name != null) {
      switch (_name) {
        case PropertyUtil.INITIAL_VALUE:
          PropertyExpression _simplePropertyValue = PropertyUtils.getSimplePropertyValue(ne, pr);
          PropertyExpression _get = ((ListValue) _simplePropertyValue).getOwnedListElements().get(0);
          _switchResult = ((StringLiteral) _get).getValue();
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileDefaultPropertyValue(final Property pr, final NamedElement ne) {
    CharSequence _xblockexpression = null;
    {
      final PropertyExpression pe = PropertyUtils.getSimplePropertyValue(ne, pr);
      CharSequence _xifexpression = null;
      if ((pe instanceof PropertyValue)) {
        _xifexpression = RtmAadlProperty.compilePropertyValue(((PropertyValue) pe));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Property expressions (only basic values)
   */
  protected static CharSequence _compilePropertyValue(final BooleanLiteral be) {
    String _xifexpression = null;
    boolean _isValue = be.isValue();
    if (_isValue) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  protected static CharSequence _compilePropertyValue(final StringLiteral sv) {
    String _value = sv.getValue();
    String _plus = ("\"" + _value);
    return (_plus + "\"");
  }
  
  protected static CharSequence _compilePropertyValue(final IntegerLiteral iv) {
    return Double.toString(iv.getScaledValue("ms"));
  }
  
  protected static CharSequence _compilePropertyValue(final RealLiteral rv) {
    return Double.toString(rv.getScaledValue("ms"));
  }
  
  protected static CharSequence _compilePropertyValue(final RangeValue pr) {
    PropertyExpression _minimum = pr.getMinimum();
    CharSequence _compilePropertyValue = RtmAadlProperty.compilePropertyValue(((NumberValue) _minimum));
    String _plus = (_compilePropertyValue + " .. ");
    PropertyExpression _maximum = pr.getMaximum();
    CharSequence _compilePropertyValue_1 = RtmAadlProperty.compilePropertyValue(((NumberValue) _maximum));
    return (_plus + _compilePropertyValue_1);
  }
  
  protected static CharSequence _compilePropertyValue(final PropertyValue pv) {
    return null;
  }
  
  public static CharSequence compilePropertyValue(final PropertyValue iv) {
    if (iv instanceof IntegerLiteral) {
      return _compilePropertyValue((IntegerLiteral)iv);
    } else if (iv instanceof RealLiteral) {
      return _compilePropertyValue((RealLiteral)iv);
    } else if (iv instanceof BooleanLiteral) {
      return _compilePropertyValue((BooleanLiteral)iv);
    } else if (iv instanceof RangeValue) {
      return _compilePropertyValue((RangeValue)iv);
    } else if (iv instanceof StringLiteral) {
      return _compilePropertyValue((StringLiteral)iv);
    } else if (iv != null) {
      return _compilePropertyValue(iv);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(iv).toString());
    }
  }
}
