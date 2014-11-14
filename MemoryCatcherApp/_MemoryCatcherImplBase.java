package MemoryCatcherApp;


/**
* MemoryCatcherApp/_MemoryCatcherImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/College/Network programming and distributed systems/Project/DistributedProject/MemoryCatcher.idl
* Friday, 14 November 2014 16:04:45 o'clock GMT
*/

public abstract class _MemoryCatcherImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements MemoryCatcherApp.MemoryCatcher, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _MemoryCatcherImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("buy", new java.lang.Integer (0));
    _methods.put ("getResource", new java.lang.Integer (1));
    _methods.put ("getMemory", new java.lang.Integer (2));
    _methods.put ("share", new java.lang.Integer (3));
    _methods.put ("getUser", new java.lang.Integer (4));
    _methods.put ("transfer", new java.lang.Integer (5));
    _methods.put ("login", new java.lang.Integer (6));
    _methods.put ("register", new java.lang.Integer (7));
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

  //THIS IS BUYING RESOURCES
       case 0:  // MemoryCatcherApp/MemoryCatcher/buy
       {
         int amount = in.read_long ();
         this.buy (amount);
         out = $rh.createReply();
         break;
       }


  //THIS IS GETTING RESOURCES
       case 1:  // MemoryCatcherApp/MemoryCatcher/getResource
       {
         int $result = (int)0;
         $result = this.getResource ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  //THIS IS GETTING MEMORIES
       case 2:  // MemoryCatcherApp/MemoryCatcher/getMemory
       {
         String $result = null;
         $result = this.getMemory ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }


  //THIS IS SHARING A MEMORY
       case 3:  // MemoryCatcherApp/MemoryCatcher/share
       {
         String share = in.read_string ();
         String moments = in.read_string ();
         this.share (share, moments);
         out = $rh.createReply();
         break;
       }

       case 4:  // MemoryCatcherApp/MemoryCatcher/getUser
       {
         String $result = null;
         $result = this.getUser ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // MemoryCatcherApp/MemoryCatcher/transfer
       {
         String points = in.read_string ();
         this.transfer (points);
         out = $rh.createReply();
         break;
       }

       case 6:  // MemoryCatcherApp/MemoryCatcher/login
       {
         String username = in.read_string ();
         String password = in.read_string ();
         int $result = (int)0;
         $result = this.login (username, password);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 7:  // MemoryCatcherApp/MemoryCatcher/register
       {
         String username = in.read_string ();
         String password = in.read_string ();
         String email = in.read_string ();
         int $result = (int)0;
         $result = this.register (username, password, email);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MemoryCatcherApp/MemoryCatcher:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _MemoryCatcherImplBase
