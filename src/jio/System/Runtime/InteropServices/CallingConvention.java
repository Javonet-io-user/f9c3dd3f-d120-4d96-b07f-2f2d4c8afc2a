package jio.System.Runtime.InteropServices;

public enum CallingConvention {
  Winapi(1L),
  Cdecl(2L),
  StdCall(3L),
  ThisCall(4L),
  FastCall(5L),
  ;
  private long numVal;

  CallingConvention(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
