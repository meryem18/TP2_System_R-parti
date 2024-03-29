package exo2;


/**
* exo2/calculPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./server.idl
* mercredi 8 d�cembre 2021 01 h 25 CET
*/

public abstract class calculPOA extends org.omg.PortableServer.Servant
 implements exo2.calculOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("incrementer", new java.lang.Integer (0));
    _methods.put ("decrementer", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // exo2/calcul/incrementer
       {
         org.omg.CORBA.IntHolder data = new org.omg.CORBA.IntHolder ();
         data.value = in.read_long ();
         this.incrementer (data);
         out = $rh.createReply();
         out.write_long (data.value);
         break;
       }

       case 1:  // exo2/calcul/decrementer
       {
         org.omg.CORBA.IntHolder data = new org.omg.CORBA.IntHolder ();
         data.value = in.read_long ();
         this.decrementer (data);
         out = $rh.createReply();
         out.write_long (data.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:exo2/calcul:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public calcul _this() 
  {
    return calculHelper.narrow(
    super._this_object());
  }

  public calcul _this(org.omg.CORBA.ORB orb) 
  {
    return calculHelper.narrow(
    super._this_object(orb));
  }


} // class calculPOA
