package e;

import d.d;
import d.e;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;

public final class a extends e {
   public a() {
      super(d.d.c);
   }

   public final void a() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      c.b var2 = new c.b(var1);
      SecureRandom var3;
      byte[] var4 = new byte[(var3 = new SecureRandom()).nextInt(15) + 16];
      var3.nextBytes(var4);
      var2.a(var4);
      var2.writeInt(0);
      var2.close();
      this.a = var1.toByteArray();
   }
}
