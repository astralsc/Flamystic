package b;

public final class a {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private d f;

   public a(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = 0;
   }

   public a() {
   }

   public final void a(int var1) {
      this.a = var1;
   }

   public final void b(int var1) {
      this.b = var1;
   }

   public final g.c a() {
      g.c var1;
      (var1 = new g.c()).a("data", this.c);
      if (this.d != -1) {
         var1.a("lvl", this.d);
      }

      var1.a("x", this.a);
      var1.a("y", this.b);
      if (this.e != -1) {
         var1.a("res_time", this.e);
      }

      if (this.c == 1000017) {
         if (this.f == null) {
            d var2 = new d();
            String var3 = "{\"units\":[[4000000,5]],\"storage_type\":0,\"boat_index\":0,\"last_unit\":4000000,\"unit_prod\":{\"total_time\":5}}";
            var2.b(new g.c(var3));
            this.f = var2;
         }

         this.f.a(var1);
      }

      return var1;
   }

   public final a a(g.c var1) {
      this.c = var1.b("data");
      if (var1.d("lvl")) {
         this.d = var1.b("lvl");
      } else {
         this.d = -1;
      }

      this.a = var1.b("x");
      this.b = var1.b("y");
      if (var1.d("res_time")) {
         this.e = var1.b("res_time");
      } else {
         this.e = -1;
      }

      if (this.c == 1000017) {
         this.f = (new d()).b(var1);
      }

      if (this.c == 1000000) {
         this.d = com.flamystic.boombeach.a.h() - 1;
      }

      return this;
   }

   public final void b() {
      ++this.d;
   }

   // $FF: synthetic method
   public final Object clone() {
      a var2;
      (var2 = new a()).c = this.c;
      var2.d = this.d;
      var2.e = this.e;
      var2.f = this.f;
      var2.a = this.a;
      var2.b = this.b;
      return var2;
   }
}
