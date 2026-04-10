package d;

import java.io.ByteArrayOutputStream;

public abstract class e {
   private d c;
   protected byte[] a;
   private byte[] d;
   private byte[] e;
   protected int b;

   public e(d var1) {
      this.c = var1;
   }

   public abstract void a();

   public final void b() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      c.b var2;
      (var2 = new c.b(var1)).writeShort(this.c.a());
      int var4 = this.a.length;
      byte[] var5;
      (var5 = new byte[3])[2] = (byte)var4;
      var5[1] = (byte)(var4 >> 8);
      var5[0] = (byte)(var4 >> 16);
      var2.write(var5);
      var2.writeShort(this.b);
      var2.flush();
      var2.close();
      this.d = var1.toByteArray();
      this.e = new byte[this.d.length + this.a.length];
      System.arraycopy(this.d, 0, this.e, 0, 7);
      System.arraycopy(this.a, 0, this.e, 7, this.a.length);
   }

   public final void a(a.a var1) {
      this.a = var1.b().a(this.a);
   }

   public final byte[] c() {
      return this.e;
   }
}
