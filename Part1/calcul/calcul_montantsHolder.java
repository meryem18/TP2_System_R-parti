package calcul;

/**
* calcul/calcul_montantsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./spec.idl
* mardi 7 d�cembre 2021 18 h 07 CET
*/

public final class calcul_montantsHolder implements org.omg.CORBA.portable.Streamable
{
  public calcul.calcul_montants value = null;

  public calcul_montantsHolder ()
  {
  }

  public calcul_montantsHolder (calcul.calcul_montants initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = calcul.calcul_montantsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    calcul.calcul_montantsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return calcul.calcul_montantsHelper.type ();
  }

}