package exo1;


/**
* exo1/_calculStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./server.idl
* mardi 7 d�cembre 2021 18 h 40 CET
*/

public class _calculStub extends org.omg.CORBA.portable.ObjectImpl implements exo1.calcul
{

  public void incrementer (org.omg.CORBA.IntHolder data)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("incrementer", true);
                $out.write_long (data.value);
                $in = _invoke ($out);
                data.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                incrementer (data        );
            } finally {
                _releaseReply ($in);
            }
  } // incrementer

  public void decrementer (org.omg.CORBA.IntHolder data)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("decrementer", true);
                $out.write_long (data.value);
                $in = _invoke ($out);
                data.value = $in.read_long ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                decrementer (data        );
            } finally {
                _releaseReply ($in);
            }
  } // decrementer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:exo1/calcul:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _calculStub