package e;

import java.io.ByteArrayInputStream;

public final class b extends d.b {
   private long d;
   private String e;
   private int f;
   private int g;

   public b(d.b var1) {
      this.b = var1.c();
      this.c = var1.d();
      this.a = var1.a();
   }

   public final void e() {
      c.a var1 = new c.a(new ByteArrayInputStream(this.c));
      this.d = var1.readLong();
      byte[] var10001;
      int var3;
      if ((var3 = var1.readInt()) == -1) {
         var10001 = null;
      } else {
         byte[] var4 = new byte[var3];
         var1.readFully(var4);
         var10001 = var4;
      }

      byte[] var2 = var10001;
      this.e = var10001 == null ? null : new String(var2, "UTF-8");
      this.f = 22;
      this.g = 59;
      var1.close();
   }

   public final long f() {
      return this.d;
   }

   public final String g() {
      return this.e;
   }
}
