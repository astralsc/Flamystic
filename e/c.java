package e;

import d.d;
import d.e;
import java.io.ByteArrayOutputStream;

public final class c extends e {
   private b.b c;

   public c(b.b var1) {
      super(d.d.e);
      this.c = var1;
   }

   public final void a() {
      this.b = 1;
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      c.b var2;
      (var2 = new c.b(var1)).writeLong(this.c.a());
      var2.writeLong(this.c.a());
      var2.a(this.c.b());
      var2.a();
      var2.a();
      var2.writeInt(22);
      var2.writeInt(72);
      var2.writeInt(1);
      var2.a("prod");
      var2.a("480068372075366");
      var2.a("FR");
      var2.a("1435447997767");
      var2.a();
      var2.close();
      this.a = var1.toByteArray();
   }
}
