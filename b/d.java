package b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {
   private List a;
   private int b;
   private int c;
   private int d;
   private int e;

   public final void a(g.c var1) {
      g.a var2 = new g.a();
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         List var3 = (List)var4.next();
         g.a var5 = new g.a();
         Iterator var6 = var3.iterator();

         while(var6.hasNext()) {
            Integer var8 = (Integer)var6.next();
            int var7 = var8;
            var5.a(new Integer(var7));
         }

         var2.a(var5);
      }

      var1.a("units", (Object)var2);
      var1.a("storage_type", this.b);
      var1.a("boat_index", this.c);
      var1.a("last_unit", this.d);
      var1.a("unit_prod", (Object)(new g.c()).a("total_time", this.e));
   }

   public final d b(g.c var1) {
      d var2 = this;
      this.a = new ArrayList();
      g.a var4 = var1.c("units");

      for(int var3 = 0; var3 < var4.a(); ++var3) {
         Object var5;
         if (!((var5 = var4.a(var3)) instanceof g.a)) {
            throw new g.b("JSONArray[" + var3 + "] is not a JSONArray.");
         }

         g.a var10 = (g.a)var5;
         ArrayList var6 = new ArrayList();

         for(int var7 = 0; var7 < var10.a(); ++var7) {
            var6.add(new Integer(var10.b(var7)));
         }

         var2.a.add(var6);
      }

      this.b = var1.b("storage_type");
      this.c = var1.b("boat_index");
      this.d = var1.b("last_unit");
      String var8 = "unit_prod";
      Object var9;
      if ((var9 = var1.a(var8)) instanceof g.c) {
         this.e = ((g.c)var9).b("total_time");
         return this;
      } else {
         throw new g.b("JSONObject[" + g.c.e(var8) + "] is not a JSONObject.");
      }
   }
}
