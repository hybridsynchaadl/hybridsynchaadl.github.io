package edu.postech.aadl.synch.maude.template;

import edu.postech.aadl.utils.PropertyUtil;
import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.instance.ComponentInstance;

@SuppressWarnings("all")
public class RtmAadlSetting {
  public static final String SEMANTICS_PATH = "semantics";
  
  public static boolean isSync(final ComponentInstance o) {
    boolean _switchResult = false;
    int _value = o.getCategory().getValue();
    switch (_value) {
      case ComponentCategory.SYSTEM_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.PROCESS_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.THREAD_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.DATA_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.THREAD_GROUP_VALUE:
        _switchResult = true;
        break;
      default:
        _switchResult = false;
        break;
    }
    return _switchResult;
  }
  
  public static boolean periodic(final ComponentInstance o) {
    boolean _switchResult = false;
    int _value = o.getCategory().getValue();
    switch (_value) {
      case ComponentCategory.SYSTEM_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.PROCESS_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.THREAD_VALUE:
        _switchResult = true;
        break;
      case ComponentCategory.THREAD_GROUP_VALUE:
        _switchResult = true;
        break;
      default:
        _switchResult = false;
        break;
    }
    return _switchResult;
  }
  
  public static boolean behavioral(final ComponentInstance o) {
    boolean _switchResult = false;
    int _value = o.getCategory().getValue();
    switch (_value) {
      case ComponentCategory.THREAD_VALUE:
        _switchResult = true;
        break;
      default:
        _switchResult = false;
        break;
    }
    return _switchResult;
  }
  
  public static boolean isData(final ComponentInstance o) {
    boolean _switchResult = false;
    int _value = o.getCategory().getValue();
    switch (_value) {
      case ComponentCategory.DATA_VALUE:
        _switchResult = true;
        break;
      default:
        _switchResult = false;
        break;
    }
    return _switchResult;
  }
  
  public static boolean isEnv(final ComponentInstance o) {
    return PropertyUtil.isEnvironment(o);
  }
  
  public static String compClass(final ComponentInstance o) {
    String _switchResult = null;
    int _value = o.getCategory().getValue();
    switch (_value) {
      case ComponentCategory.SYSTEM_VALUE:
        String _xifexpression = null;
        boolean _isEnv = RtmAadlSetting.isEnv(o);
        if (_isEnv) {
          _xifexpression = "Env";
        } else {
          _xifexpression = "System";
        }
        _switchResult = _xifexpression;
        break;
      case ComponentCategory.PROCESS_VALUE:
        _switchResult = "Process";
        break;
      case ComponentCategory.THREAD_VALUE:
        _switchResult = "Thread";
        break;
      case ComponentCategory.DATA_VALUE:
        _switchResult = "Data";
        break;
      case ComponentCategory.THREAD_GROUP_VALUE:
        _switchResult = "ThreadGroup";
        break;
    }
    return _switchResult;
  }
}
