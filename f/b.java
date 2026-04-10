package f;

import java.io.ByteArrayInputStream;

public final class b extends d.b {
   private d.c[] d;

   public b(d.b var1) {
      this.b = var1.c();
      this.c = var1.d();
      this.a = var1.a();
   }

   public final void e() {
      c.a var1 = new c.a(new ByteArrayInputStream(this.c));
      byte var2 = 0;
      var1.readInt();
      var1.readLong();
      int var3 = var1.readInt();
      int var7 = var2 + 16;
      this.d = new d.c[var3];
      if (var3 > 0) {
         for(int var4 = 0; var4 < var3; ++var4) {
            d.c var5;
            (var5 = new d.c()).a(var1.readInt());
            var7 += 4;
            byte[] var6;
            if (var5.a() != 500 && var5.a() != 501) {
               if (var5.a() != 502) {
                  this.c = new byte[this.c.length - var7];
                  var1.readFully(this.c);
                  var5.a(this.c);
                  this.d[var4] = var5;
                  break;
               }

               var6 = new byte[8];
               var1.readFully(var6);
               var5.a(var6);
               var7 += 8;
            } else {
               var6 = new byte[16];
               var1.readFully(var6);
               var5.a(var6);
               var7 += 16;
            }

            this.d[var4] = var5;
         }
      }

      var1.close();
   }

   public final d.c[] f() {
      return this.d;
   }
}
