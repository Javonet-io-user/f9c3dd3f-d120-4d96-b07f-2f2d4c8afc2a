package RGiesecke.DllExport;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import RGiesecke.DllExport.*;
import jio.System.Runtime.InteropServices.*;

public class DllExportAttribute extends Attribute implements _Attribute {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCallingConvention(CallingConvention value) {
    try {
      javonetHandle.set("CallingConvention", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CallingConvention getCallingConvention() {
    try {
      Object res = javonetHandle.<NEnum>get("CallingConvention");
      if (res == null) return null;
      return CallingConvention.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExportName(java.lang.String value) {
    try {
      javonetHandle.set("ExportName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getExportName() {
    try {
      java.lang.String res = javonetHandle.get("ExportName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DllExportAttribute() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RGiesecke.DllExport.DllExportAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DllExportAttribute(java.lang.String exportName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RGiesecke.DllExport.DllExportAttribute", exportName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DllExportAttribute(java.lang.String exportName, CallingConvention callingConvention) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "RGiesecke.DllExport.DllExportAttribute",
              exportName,
              NEnum.fromJavaEnum(callingConvention));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DllExportAttribute(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
