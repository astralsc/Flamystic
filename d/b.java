package d;

import java.io.ByteArrayInputStream;

public abstract class b {
   protected byte[] a;
   protected byte[] b;
   protected byte[] c;
   private d d;

   public final void a(byte[] var1, byte[] var2) {
      this.c = var2;
      this.b = var1;
      this.a = new byte[var1.length + var2.length];
      System.arraycopy(var1, 0, this.a, 0, var1.length);
      System.arraycopy(var2, 0, this.a, var1.length, var2.length);
      c.a var3;
      short var4 = (var3 = new c.a(new ByteArrayInputStream(this.b))).readShort();
      this.d = d.d.a(var4);
      if (this.d == d.d.b) {
         this.d.b(var4);
      }

      var3.close();
   }

   public final void a(a.a var1) {
      byte[] var2 = var1.a().a(this.c);
      this.a(this.b, var2);
   }

   public final byte[] a() {
      return this.a;
   }

   public final d b() {
      return this.d;
   }

   public final byte[] c() {
      return this.b;
   }

   public final byte[] d() {
      return this.c;
   }
}
